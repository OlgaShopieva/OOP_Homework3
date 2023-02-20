package org.example;

class TruckCar extends Car {
    private double bodyArea;

    public TruckCar(String model, int year, double weight, String color, int speed, double bodyArea) {
        super(model, year, weight, color, speed);
        this.bodyArea = bodyArea;
    }

    public double getBodyArea() {
        return bodyArea;
    }

    public void setBodyArea(double bodyArea) {
        this.bodyArea = bodyArea;
    }

    @Override
    public void Info() {
        super.Info();
        System.out.println("Body's area: " + getBodyArea());
    }
}
