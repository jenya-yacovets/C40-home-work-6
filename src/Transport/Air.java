package Transport;

// Воздушный транспорт
public class Air extends Transport {
    private int wingspan; // Размах крыльев (м)
    private int minBandLength; // Минимальная длина взлётно-посадочной полосы для взлёта (м)

    public Air(int power, int speed, int weight, String brand, int wingspan, int minBandLength) {
        super(power, speed, weight, brand);
        this.wingspan = wingspan;
        this.minBandLength = minBandLength;
    }

    public Air() {}

    public int getWingspan() {
        return wingspan;
    }

    public void setWingspan(int wingspan) {
        this.wingspan = wingspan;
    }

    public int getMinBandLength() {
        return minBandLength;
    }

    public void setMinBandLength(int minBandLength) {
        this.minBandLength = minBandLength;
    }

    @Override
    public String getDescription() {
        String text = super.getDescription();
        text += " | Размах крыльев: " + this.wingspan + " м | ";
        text += "Минимальная длина взлётно-посадочной полосы для взлёта: " + this.minBandLength + " м";
        return text;
    }
}
