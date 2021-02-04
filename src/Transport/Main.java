package Transport;

public class Main {
    public static void main(String[] args) {
        Passenger passenger = new Passenger(
                350,
                190,
                2500,
                "Копейка",
                4,
                5,
                "седан",
                4
        );
//        passenger.description();
//        passenger.calculateDistance(10);

        Cargo cargo = new Cargo(
                350,
                190,
                2500,
                "МАЗ",
                8,
                14,
                10
        );
//        cargo.description();
//        cargo.load(5);
//        cargo.load(6);

        Civil AirCivil = new Civil(
                6500,
                920,
                7000,
                "Боинг",
                120,
                1200,
                45,
                true
        );
//        AirCivil.description();
//        AirCivil.load(10);
//        AirCivil.load(36);

        Military AirMilitary = new Military(
                6500,
                920,
                7000,
                "Боинг",
                120,
                1200,
                true,
                2
        );
//        AirMilitary.description();
//        AirMilitary.shot();
//        AirMilitary.shot();
//        AirMilitary.shot();

//        AirMilitary.ejection();
//        AirMilitary.ejection();
    }
}
