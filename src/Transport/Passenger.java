package Transport;

// Легковой наземный транспорт
public class Passenger extends Ground{
    private String typeBody; // тип кузова
    private int countPassengers; // количество пасажиров

    public Passenger(int power, int speed, int weight, String brand, int countWheels, int consumption, String typeBody, int countPassengers) {
        super(power, speed, weight, brand, countWheels, consumption);
        this.typeBody = typeBody;
        this.countPassengers = countPassengers;
    }

    public Passenger() {}

    public String getTypeBody() {
        return typeBody;
    }

    public void setTypeBody(String typeBody) {
        this.typeBody = typeBody;
    }

    public int getCountPassengers() {
        return countPassengers;
    }

    public void setCountPassengers(int countPassengers) {
        this.countPassengers = countPassengers;
    }

    public void description() {
        String text = super.getDescription();
        text += " | Тип кузова: " + this.typeBody + " | ";
        text += "Количество пассажиров: " + this.countPassengers;

        System.out.println(text);
    }

    private int calculationConsumption(int distance) {
        return distance / 100 * this.getConsumption();
    }

    public void calculateDistance(int time) {
        int distance = time * this.getSpeed();
        int consumption = this.calculationConsumption(distance);

        System.out.println("За время " + time + " ч, автомобиль " + this.getBrand() + " двигаясь с максимальной скоростью " + this.getSpeed() + " км/ч проедет " + distance + " км и израсходует " + consumption + " литров топлива");
    }
}
