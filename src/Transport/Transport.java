package Transport;

// Транспорт
public class Transport {
    private int power; // Мощность(в лошадиных силах)
    private int speed; // Максимальная скорость(км/ч)
    private int weight; // Масса (кг)
    private String brand; //Марка

    public Transport(int power, int speed, int weight, String brand) {
        this.power = power;
        this.speed = speed;
        this.weight = weight;
        this.brand = brand;
    }

    public  Transport() {}

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getDescription() {
        String text = "Мощность: " + this.power + " л.с. | ";
        text += "Мощность в киловаттах: " + this.getPowerWatt() + " кВт | ";
        text += "Максимальная скорость: " + this.speed + " км/ч | ";
        text += "Масса: " + this.weight + " кг | ";
        text += "Марка: " + this.brand;
        return text;
    }

    private double getPowerWatt() {
        return this.power * 0.74;
    }
}
