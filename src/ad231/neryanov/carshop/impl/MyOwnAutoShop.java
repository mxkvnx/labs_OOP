/*
 * @(#)MyOwnAutoShop.java 1.0 2024/10/10
 *
 * Copyright (c) 2024 [Vlad Neryanov], Inc.
 * All Rights Reserved.
 *
 * This software is the confidential and proprietary information of [Vlad Neryanov].
 * You shall not disclose such Confidential Information and shall use it only in
 * accordance with the terms of the license agreement you entered into.
 */

package ad231.neryanov.carshop.impl;

import ad231.neryanov.carshop.cars.*;
import ad231.neryanov.carshop.interfaces.*;

/**
 * Класс MyOwnAutoShop представляет автосалон, который содержит различные автомобили.
 * Реализует интерфейсы Admin и Customer для управления ценами автомобилей и их покупкой.
 *
 * В автосалоне есть следующие автомобили:
 * - Sedan
 * - Два автомобиля Ford
 * - Два грузовика Truck
 *
 * @author [Vlad Neryanov]
 * @version 1.0 10 Oct 2024
 */
public class MyOwnAutoShop implements Admin, Customer {
    private Sedan sedan;
    private Ford ford1;
    private Ford ford2;
    private Truck truck1;
    private Truck truck2;

    /**
     * Конструктор MyOwnAutoShop создает экземпляры автомобилей и инициализирует их параметры.
     * Автомобили имеют различные скорости, цвета, годы выпуска и скидки.
     */
    public MyOwnAutoShop() {
        sedan = new Sedan(150, true, 20000, "Red", 25);
        ford1 = new Ford(160, false, 25000, "Blue", 2018, 2000);
        ford2 = new Ford(170, false, 27000, "Black", 2020, 3000);
        truck1 = new Truck(140, true, 35000, "White", 3000);
        truck2 = new Truck(130, true, 33000, "Green", 1800);
    }

    /**
     * Возвращает общий доход автосалона от продажи всех автомобилей.
     *
     * @return общая сумма доходов от продажи всех автомобилей
     */
    @Override
    public double getIncome() {
        return sedan.getSalePrice() + ford1.getSalePrice() + ford2.getSalePrice() + truck1.getSalePrice() + truck2.getSalePrice();
    }

    /**
     * Возвращает общую стоимость всех автомобилей в автосалоне.
     *
     * @return общая стоимость всех автомобилей
     */
    @Override
    public double getCarsPrice() {
        return getIncome();
    }

    /**
     * Возвращает массив с цветами всех автомобилей.
     *
     * @return массив строк с цветами автомобилей
     */
    @Override
    public String[] getCarColors() {
        return new String[]{sedan.getColor(), ford1.getColor(), ford2.getColor(), truck1.getColor(), truck2.getColor()};
    }

    /**
     * Возвращает цену автомобиля по его идентификатору.
     *
     * @param id идентификатор автомобиля
     * @return цена автомобиля с данным идентификатором
     */
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

    /**
     * Возвращает цвет автомобиля по его идентификатору.
     *
     * @param id идентификатор автомобиля
     * @return цвет автомобиля с данным идентификатором
     */
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

    /**
     * Осуществляет покупку автомобиля по его идентификатору.
     *
     * @param id идентификатор автомобиля для покупки
     */
    @Override
    public void purchaseCar(int id) {
        // Логика покупки автомобиля
        System.out.println("Car with ID " + id + " purchased.");
    }
}
