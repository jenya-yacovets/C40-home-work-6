package Transport;

// Наземный транспорт
public class Ground extends Transport{
    private int countWheels; // Количество колёс
    private int consumption; // Расход топлива(л/100км)

    public Ground(int power, int speed, int weight, String brand, int countWheels, int consumption) {
        super(power, speed, weight, brand);
        this.countWheels = countWheels;
        this.consumption = consumption;
    }

    public Ground() {}

    public int getCountWheels() {
        return countWheels;
    }

    public void setCountWheels(int countWheels) {
        this.countWheels = countWheels;
    }

    public int getConsumption() {
        return consumption;
    }

    public void setConsumption(int consumption) {
        this.consumption = consumption;
    }

    @Override
    public String getDescription() {
        String text = super.getDescription();
        text += " | Количество колес: " + this.countWheels + " | ";
        text += "Расход топлива: " + this.consumption + " л/100км";
        return text;
    }
}
