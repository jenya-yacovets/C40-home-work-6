package Transport;

// Военный воздушный транспорт
public class Military extends Air{
    private boolean ejectionSystem; // Наличие системы катапультирования
    private int countMissiles; // количество ракет на борту
    private int  missilesUsed = 0; // количество использованых ракет
    private boolean usedEjectionSystem = false; // Использована ли система катапультирования

    public Military(int power, int speed, int weight, String brand, int wingspan, int minBandLength, boolean ejectionSystem, int countMissiles) {
        super(power, speed, weight, brand, wingspan, minBandLength);
        this.ejectionSystem = ejectionSystem;
        this.countMissiles = countMissiles;
    }

    public Military() {}

    public boolean isEjectionSystem() {
        return ejectionSystem;
    }

    public void setEjectionSystem(boolean ejectionSystem) {
        this.ejectionSystem = ejectionSystem;
    }

    public int getCountMissiles() {
        return countMissiles;
    }

    public void setCountMissiles(int countMissiles) {
        this.countMissiles = countMissiles;
    }

    public void description() {
        String text = super.getDescription();
        text += " | Количество ракет на борту: " + this.countMissiles + " | ";
        text += "Наличие системы катапультирования: " + (this.ejectionSystem ? "есть" : "нет");

        System.out.println(text);
    }

    public void shot() {
        if (this.countMissiles - this.missilesUsed > 0) {
            this.missilesUsed++;
            System.out.println("Ракета пошла....");
        } else {
            System.out.println("Боеприпасы отсутствуют");
        }
    }

    public void ejection() {
        if (!ejectionSystem) {
            System.out.println("У вас нет такой системы");
            return;
        }

        if(!usedEjectionSystem) {
            usedEjectionSystem = true;
            System.out.println("Катапультирование прошло успешно");
        } else {
            System.out.println("Система катапультроования уже использована... Используй парашут");
        }
    }
}

