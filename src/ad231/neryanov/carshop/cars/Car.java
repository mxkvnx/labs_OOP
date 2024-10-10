/*
 * @(#)Car.java 1.0 2024/10/10
 *
 * Copyright (c) 2024 [Vlad Neryanov], Inc.
 * All Rights Reserved.
 *
 * This software is the confidential and proprietary information of [Vlad Neryanov].
 * You shall not disclose such Confidential Information and shall use it only in
 * accordance with the terms of the license agreement you entered into.
 */

package ad231.neryanov.carshop.cars;

/**
 * Абстрактный класс Car представляет общий интерфейс для всех автомобилей.
 * Содержит общие параметры, такие как скорость, цена и цвет.
 * Определяет абстрактный метод для расчета цены продажи.
 *
 * @author [Vlad Neryanov]
 * @version 1.0 10 Oct 2024
 */
public abstract class Car {
    protected int speed;            // Максимальная скорость автомобиля
    protected boolean isSellOut;    // Флаг распродажи
    protected double regularPrice;  // Регулярная цена автомобиля
    protected String color;         // Цвет автомобиля

    /**
     * Конструктор для создания экземпляра Car.
     *
     * @param speed максимальная скорость автомобиля
     * @param isSellOut флаг распродажи
     * @param regularPrice регулярная цена автомобиля
     * @param color цвет автомобиля
     */
    public Car(int speed, boolean isSellOut, double regularPrice, String color) {
        this.speed = speed;
        this.isSellOut = isSellOut;
        this.regularPrice = regularPrice;
        this.color = color;
    }

    /**
     * Абстрактный метод для получения итоговой цены автомобиля.
     * Конкретная реализация будет предоставлена в подклассах.
     *
     * @return цена продажи автомобиля
     */
    public abstract double getSalePrice();

    /**
     * Метод для получения цвета автомобиля.
     *
     * @return цвет автомобиля
     */
    public String getColor() {
        return color;
    }

    /**
     * Метод для получения регулярной цены автомобиля.
     *
     * @return регулярная цена автомобиля
     */
    public double getRegularPrice() {
        return regularPrice;
    }
}
