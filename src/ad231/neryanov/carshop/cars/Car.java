package ad231.neryanov.carshop.cars;

public abstract class Car {
    protected int speed;
    protected boolean isSellOut;
    protected double regularPrice;
    protected String color;

    public Car(int speed, boolean isSellOut, double regularPrice, String color) {
        this.speed = speed;
        this.isSellOut = isSellOut;
        this.regularPrice = regularPrice;
        this.color = color;
    }

    public abstract double getSalePrice();

    public String getColor() {
        return color;
    }

    public double getRegularPrice() {
        return regularPrice;
    }
}
