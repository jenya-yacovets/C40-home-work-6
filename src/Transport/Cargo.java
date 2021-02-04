package Transport;

// Грузовой наземный транспорт
public class Cargo extends Ground{
    private int loadCapacity; // Грузоподъёмность(т)
    private int currentLoad = 0; // На сколько загружен грузовик

    public Cargo(int power, int speed, int weight, String brand, int countWheels, int consumption, int loadCapacity) {
        super(power, speed, weight, brand, countWheels, consumption);
        this.loadCapacity = loadCapacity;
    }

    public Cargo(int loadCapacity) {}

    public int getLoadCapacity() {
        return loadCapacity;
    }

    public void setLoadCapacity(int loadCapacity) {
        this.loadCapacity = loadCapacity;
    }

    public void description() {
        String text = super.getDescription();
        text += " | Грузоподъёмность: " + this.loadCapacity + " т.";

        System.out.println(text);
    }

    public void load(int weight) {
        int calc = this.loadCapacity - this.currentLoad;
        if (weight <= calc) {
            this.currentLoad += weight;
            System.out.println("Грузовик успешно загружен. Осталось место на " + (calc - weight) + " тонн");
        } else {
            System.out.println("Вам нужен грузовик побольше. В меня может влезть максимум еще " + calc + " тонн");
        }
    }
}
