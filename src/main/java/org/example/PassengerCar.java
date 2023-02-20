package org.example;

class PassengerCar extends Car{

    private String typeOfPassengerCar;

    public PassengerCar(String model, int year, double weight, String color, int speed, String typeOfPassengerCar) {
        super(model, year, weight, color, speed);
        this.typeOfPassengerCar = typeOfPassengerCar;
    }

    public String getTypeOfPassengerCar() {
        return typeOfPassengerCar;
    }

    public void setTypeOfPassengerCar(String typeOfPassengerCar) {
        this.typeOfPassengerCar = typeOfPassengerCar;
    }

    @Override
    public void Info() {
        super.Info();
        System.out.println("Type of passenger car: " + getTypeOfPassengerCar());
    }
}
