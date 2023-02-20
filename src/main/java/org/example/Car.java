package org.example;

class Car extends Transport{
    private int speed;

    public Car(String model, int year, double weight, String color, int speed){
        super(model, year, weight, color);
        this.speed = speed;
    }


    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        if (speed < 0) {
            this.speed = speed;
        } else {
            System.out.println("Error! Speed is invalid!");
        }
    }

    @Override
    public void Info() {
        System.out.println("Car: \n" +
                "Model: " + getModel() + "\n" +
                "Year: " + getYear() + "\n" +
                "Weight: " + getWeight() + " kg\n" +
                "Color: " + getColor() + "\n" +
                "Speed: " + getSpeed());
    }
}
