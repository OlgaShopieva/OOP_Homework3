package org.example;

class Train extends Transport{


    private int numberWagons;

    public Train(String model, int year, double weight, String color, int numberWagons){
        super(model, year, weight, color);
        this.numberWagons = numberWagons;
    }

    public int getNumberWagons() {
        return numberWagons;
    }

    public void setNumberWagons(int numberWagons) {
        this.numberWagons = numberWagons;
    }

    @Override
    public void Info() {
        System.out.println("Train: \n" +
                "Model: " + getModel() + "\n" +
                "Year: " + getYear() + "\n" +
                "Weight: " + getWeight() + " tons\n" +
                "Color: " + getColor() + "\n" +
                "Number of wagons: " + getNumberWagons());
    }

}
