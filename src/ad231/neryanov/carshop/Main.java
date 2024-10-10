package ad231.neryanov.carshop;

import ad231.neryanov.carshop.impl.MyOwnAutoShop;


public class Main {
    public static void main(String[] args) {
        MyOwnAutoShop autoShop = new MyOwnAutoShop();

        System.out.println("Total income: " + autoShop.getIncome());

        System.out.println("Total price of all cars: " + autoShop.getCarsPrice());
        System.out.println("Colors of all cars: ");
        for (String color : autoShop.getCarColors()) {
            System.out.println(color);
        }
        System.out.println("Price of car 1: " + autoShop.getCarPrice(1));
        System.out.println("Color of car 1: " + autoShop.getCarColor(1));

        autoShop.purchaseCar(2);
    }
}
