package ad231.neryanov.carshop.impl;

import ad231.neryanov.carshop.cars.*;
import ad231.neryanov.carshop.interfaces.*;

public class MyOwnAutoShop implements Admin, Customer{
    private Sedan sedan;
    private Ford ford1;
    private Ford ford2;
    private Truck truck1;
    private Truck truck2;

    public MyOwnAutoShop() {
        sedan = new Sedan(150, true, 20000, "Red", 25);
        ford1 = new Ford(160, false, 25000, "Blue", 2018, 2000);
        ford2 = new Ford(170, false, 27000, "Black", 2020, 3000);
        truck1 = new Truck(140, true, 35000, "White", 3000);
        truck2 = new Truck(130, true, 33000, "Green", 1800);
    }

    @Override
    public double getIncome(){
        return sedan.getSalePrice() + ford1.getSalePrice() + ford2.getSalePrice() + truck1.getSalePrice() + truck2.getSalePrice();
    }

    @Override
    public double getCarsPrice() {
        return getIncome();
    }

    @Override
    public String[] getCarColors() {
        return new String[]{sedan.getColor(), ford1.getColor(), ford2.getColor(), truck1.getColor(), truck2.getColor()};
    }

    @Override
    public double getCarPrice(int id) {
        switch (id) {
            case 1: return sedan.getSalePrice();
            case 2: return ford1.getSalePrice();
            case 3: return ford2.getSalePrice();
            case 4: return truck1.getSalePrice();
            case 5: return truck2.getSalePrice();
            default: return 0;
        }
    }

    @Override
    public String getCarColor(int id) {
        switch (id) {
            case 1: return sedan.getColor();
            case 2: return ford1.getColor();
            case 3: return ford2.getColor();
            case 4: return truck1.getColor();
            case 5: return truck2.getColor();
            default: return "Unknown";
        }
    }

    @Override
    public void purchaseCar(int id) {
        // Логіка покупки автомобіля
        System.out.println("Car with ID " + id + " purchased.");
    }
}