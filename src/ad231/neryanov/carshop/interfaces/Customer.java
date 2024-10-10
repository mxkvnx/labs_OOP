/*
 * @(#)Customer.java 1.0 2024/10/10
 *
 * Copyright (c) 2024 [Vlad Neryanov], Inc.
 * All Rights Reserved.
 *
 * This software is the confidential and proprietary information of [Vlad Neryanov].
 * You shall not disclose such Confidential Information and shall use it only in
 * accordance with the terms of the license agreement you entered into.
 */

package ad231.neryanov.carshop.interfaces;

/**
 * Интерфейс Customer описывает методы, которые должны быть реализованы классами,
 * представляющими клиентов автомобильного магазина.
 *
 * @author [Vlad Neryanov]
 * @version 1.0 10 Oct 2024
 */
public interface Customer {
    /**
     * Метод для получения общей стоимости всех автомобилей в магазине.
     *
     * @return общая стоимость автомобилей в виде числа с плавающей запятой
     */
    double getCarsPrice();

    /**
     * Метод для получения цветов всех автомобилей в магазине.
     *
     * @return массив строк, содержащий цвета всех автомобилей
     */
    String[] getCarColors();

    /**
     * Метод для получения стоимости автомобиля по его идентификатору.
     *
     * @param id идентификатор автомобиля
     * @return стоимость автомобиля с заданным идентификатором
     */
    double getCarPrice(int id);

    /**
     * Метод для получения цвета автомобиля по его идентификатору.
     *
     * @param id идентификатор автомобиля
     * @return цвет автомобиля с заданным идентификатором
     */
    String getCarColor(int id);

    /**
     * Метод для покупки автомобиля по его идентификатору.
     *
     * @param id идентификатор автомобиля, который нужно купить
     */
    void purchaseCar(int id);
}
