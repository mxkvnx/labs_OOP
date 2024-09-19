/*
 * @(#)Main.java 1.0 2024/09/19
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
 * Класс Main содержит метод для запуска программы,
 * который демонстрирует функциональность корзины (Cart) и товаров (Item).
 * В программе создаются товары, добавляемые в корзину, и выполняются операции
 * по увеличению и уменьшению цен всех товаров.
 *
 * @author [Vlad Neryanov]
 * @version 1.0 19 Sep 2024
 */
public class Main {
    /**
     * Основной метод для запуска программы
     *
     * @param args аргументы командной строки
     */
    public static void main(String[] args) {
        Item item = new Item("milk", 20);
        Item item1 = new Item("bread", 10);
        Item item2 = new Item("butter", 15);
        Item item3 = new Item("soap", 5);
        Item item4 = new Item("banana", 3);

        Cart cart = new Cart(5);

        cart.push(item);
        cart.push(item1);
        cart.push(item2);
        cart.push(item3);
        cart.push(item4);

        System.out.println("Total price: " + cart.sum());
        cart.increaseAll(15);
        System.out.println("Total price after increase: " + cart.sum());
        cart.decreaseAll(30);
        System.out.println("Total price after decrease: " + cart.sum());
    }
}
