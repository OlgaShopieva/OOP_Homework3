package org.example;

public class Main {
    public static void main(String[] args) {
        Aeroplane plane1 = new Aeroplane("Boeing", 2015, 80.5, "blue", 75.3);
        plane1.Info();
        System.out.println();
        Train train1 = new Train("Sapsan", 2014, 8345, "red", 15);
        train1.Info();
        System.out.println();
        PassengerCar car1 = new PassengerCar("Volkswagen", 2019, 1200.5, "Silver", 184,
                "hatchback");
        car1.Info();
        

    }
}