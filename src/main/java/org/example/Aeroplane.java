package org.example;

class Aeroplane extends Transport{
    private double wingLength;

    public Aeroplane(String model, int year, double weight, String color, double wingLength){
        super(model, year, weight, color);
        this.wingLength = wingLength;
    }

    public double getWingLength() {
        return wingLength;
    }

    public void setWingLength(double wingLength) {
        this.wingLength = wingLength;
    }

    @Override
    public void Info() {
        System.out.println("Aeroplane: \n" +
                           "Model: " + getModel() + "\n" +
                           "Year: " + getYear() + "\n" +
                           "Weight : " + getWeight() + " tons\n" +
                           "Color: " + getColor() + "\n" +
                           "Wings' length: " + getWingLength() + " m");
    }
}
