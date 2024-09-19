/*
 * @(#)Cart.java 1.0 2024/09/19
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
 * Класс Cart реализует структуру данных стек для хранения объектов класса Item.
 * Он позволяет добавлять товары, подсчитывать сумму цен и увеличивать/уменьшать цены всех товаров.
 *
 * @author [Vlad Neryanov]
 * @version 1.0 19 Sep 2024
 */
public class Cart {
    private int size;
    private Item[] stackArr;
    private int top;

    /**
     * Конструктор для инициализации корзины с максимальным количеством элементов.
     *
     * @param max максимальное количество элементов в корзине
     */
    public Cart(int max) {
        this.size = max;
        stackArr = new Item[size];
        top = -1;
    }

    /**
     * Метод для добавления товара в корзину.
     *
     * @param item объект класса Item, который добавляется в корзину
     */
    public void push(Item item) {
        if (top >= size - 1) {
            System.out.println("Stack overflow");
            return;
        }
        top += 1;
        stackArr[top] = item;
    }

    /**
     * Метод для подсчета суммы цен всех товаров в корзине.
     *
     * @return сумма цен всех товаров
     */
    public double sum() {
        if (top == -1) {
            System.out.println("Cart is empty");
            return 0;
        }
        double sum = 0;
        for (int i = 0; i <= top; i++) {
            sum += stackArr[i].price;
        }
        return sum;
    }

    /**
     * Метод для увеличения цен всех товаров в корзине на указанный процент.
     *
     * @param percentage процент, на который увеличиваются цены
     */
    public void increaseAll(double percentage) {
        if (top == -1) {
            System.out.println("Cart is empty, nothing to increase.");
            return;
        }
        for (int i = 0; i <= top; i++) {
            double newPrice = stackArr[i].price + (stackArr[i].price * percentage / 100);
            stackArr[i].price = newPrice;
        }
    }

    /**
     * Метод для уменьшения цен всех товаров в корзине на указанный процент.
     * Если новая цена становится отрицательной, она устанавливается в 0.
     *
     * @param percentage процент, на который уменьшаются цены
     */
    public void decreaseAll(double percentage) {
        if (top == -1) {
            System.out.println("Cart is empty, nothing to decrease.");
            return;
        }
        for (int i = 0; i <= top; i++) {
            double newPrice = stackArr[i].price - (stackArr[i].price * percentage / 100);
            stackArr[i].price = newPrice < 0 ? 0 : newPrice;
        }
    }
}
