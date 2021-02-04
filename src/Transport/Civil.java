package Transport;

// Гражданский воздушный транспорт
public class Civil extends Air{
    private int countPassengers; // Количество пасажиров
    private boolean vip; // Наличие бизнес класса
    private int currentLoad = 0; // Количество занятых мест

    public Civil(int power, int speed, int weight, String brand, int wingspan, int minBandLength, int countPassengers, boolean vip) {
        super(power, speed, weight, brand, wingspan, minBandLength);
        this.countPassengers = countPassengers;
        this.vip = vip;
    }

    public Civil(int countPassengers, boolean vip) {}

    public int getCountPassengers() {
        return countPassengers;
    }

    public void setCountPassengers(int countPassengers) {
        this.countPassengers = countPassengers;
    }

    public boolean isVip() {
        return vip;
    }

    public void setVip(boolean vip) {
        this.vip = vip;
    }

    public void description() {
        String text = super.getDescription();
        text += " | Количество пасажиров: " + this.countPassengers + " | ";
        text += "Наличие бизнес класса: " + (this.vip ? "есть" : "нет");

        System.out.println(text);
    }

    public void load(int count) {
        int calc = this.countPassengers - this.currentLoad;
        if (count <= calc) {
            this.currentLoad += count;
            System.out.println("Пассажиры успешно посажены на свои места. Осталось мест на " + (calc - count) + " пассажиров");
        } else {
            System.out.println("Купите самалет побольше. В меня может влезть максимум еще " + calc + " пассажиров");
        }
    }
}
