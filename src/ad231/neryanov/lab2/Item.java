/*
 * @(#)Item.java 1.0 2024/09/19
 *
 * Copyright (c) 2024 [Vlad Neryanov], Inc.
 * All Rights Reserved.
 *
 * This software is the confidential and proprietary information of [Vlad Neryanov].
 * You shall not disclose such Confidential Information and shall use it only in
 * accordance with the terms of the license agreement you entered into.
 */

package ad231.neryanov.lab2;

/**
 * Класс Item представляет товар с наименованием и ценой.
 * Он содержит методы для изменения цены товара на заданный процент.
 *
 * @author [Vlad Neryanov]
 * @version 1.0 19 Sep 2024
 */
public class Item {
    public String name;
    public double price;

    /**
     * Конструктор для создания товара
     *
     * @param n имя товара
     * @param p начальная цена товара
     */
    public Item(String n, double p) {
        this.name = n;
        if (p >= 0) {
            this.price = p;
        } else {
            this.price = 0;
        }
    }

    /**
     * Метод для увеличения цены товара на заданный процент
     *
     * @param percentage процент, на который будет увеличена цена
     * @return новая цена товара после увеличения
     */
    public double increaseByPercentage(double percentage) {
        return price + (price * percentage / 100);
    }

    /**
     * Метод для уменьшения цены товара на заданный процент
     *
     * @param percentage процент, на который будет уменьшена цена
     * @return новая цена товара после уменьшения
     */
    public double decreaseByPercentage(double percentage) {
        double newPrice = price - (price * percentage / 100);
        return newPrice < 0 ? 0 : newPrice;
    }
}
