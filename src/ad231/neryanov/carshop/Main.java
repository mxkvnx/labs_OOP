/*
 * @(#)Main.java 1.0 2024/10/10
 *
 * Copyright (c) 2024 [Vlad Neryanov], Inc.
 * All Rights Reserved.
 *
 * This software is the confidential and proprietary information of [Vlad Neryanov].
 * You shall not disclose such Confidential Information and shall use it only in
 * accordance with the terms of the license agreement you entered into.
 */

package ad231.neryanov.carshop;

import ad231.neryanov.carshop.impl.MyOwnAutoShop;

/**
 * Класс Main демонстрирует работу автосалона через объект MyOwnAutoShop.
 * Выводит на экран доход автосалона, общую стоимость машин, их цвета,
 * а также позволяет совершить покупку автомобиля по ID.
 *
 * @author [Vlad Neryanov]
 * @version 1.0 10 Oct 2024
 */
public class Main {

    /**
     * Основной метод для запуска программы. Демонстрирует функционал автосалона.
     *
     * @param args аргументы командной строки
     */
    public static void main(String[] args) {
        MyOwnAutoShop autoShop = new MyOwnAutoShop(); // Создание объекта автосалона

        // Вывод общей прибыли автосалона
        System.out.println("Total income: " + autoShop.getIncome());

        // Вывод общей стоимости всех автомобилей
        System.out.println("Total price of all cars: " + autoShop.getCarsPrice());

        // Вывод цветов всех автомобилей
        System.out.println("Colors of all cars: ");
        for (String color : autoShop.getCarColors()) {
            System.out.println(color);
        }

        // Вывод цены и цвета автомобиля с ID 1
        System.out.println("Price of car 1: " + autoShop.getCarPrice(1));
        System.out.println("Color of car 1: " + autoShop.getCarColor(1));

        // Покупка автомобиля с ID 2
        autoShop.purchaseCar(2);
    }
}
