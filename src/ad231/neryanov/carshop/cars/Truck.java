package ad231.neryanov.carshop.cars;

public class Truck extends Car {
    private int weight;

    public Truck(int speed, boolean isSellOut, double regularPrice, String color, int weight) {
        super(speed, isSellOut, regularPrice, color);
        this.weight = weight;
    }

    @Override
    public double getSalePrice() {
        if(weight > 2000){
            return regularPrice * 0.9;
        } else {
            return regularPrice;
        }
    }
}
