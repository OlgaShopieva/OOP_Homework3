package org.example;

public abstract class Transport {
    private String model;
    private int year;
    private double weight;
    private String color;

    public Transport() { }

    public Transport(String model, int year, double weight, String color)
    {
        this.model = model;
        this.year = year;
        this.weight = weight;
        this.color = color;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public double getWeight() {
        return weight;
    }

    public String getColor() {
        return color;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public abstract void Info();

}

