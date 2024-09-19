/*
 * @(#)Main.java 1.0 2024/09/12
 *
 * Copyright (c) 2024 [Vlad Neryanov], Inc.
 * All Rights Reserved.
 *
 * This software is the confidential and proprietary information of [Vlad Neryanov].
 * You shall not disclose such Confidential Information and shall use it only in
 * accordance with the terms of the license agreement you entered into.
 */

package ad231.neryanov.lab1;

/**
 * Класс Main содержит методы для выполнения лабораторной работы:
 * - Проверка на неубывающий массив
 * - Реализация игры FizzBuzz
 *
 * @author [Vlad Neryanov]
 * @version 1.0 12 Sep 2024
 */
public class Main {

    /**
     * Метод для проверки, является ли массив неубывающим
     *
     * @param array массив целых чисел
     * @return true если массив неубывающий, иначе false
     */
    public static boolean notDecreasing(int[] array) {
        for (int i = 1; i < array.length; i++) {
            if (array[i] < array[i - 1]) {
                return false;  // Возвращаем false, если элемент меньше предыдущего
            }
        }
        return true;  // Массив не убывает
    }

    /**
     * Метод, реализующий игру FizzBuzz.
     * Выводит числа от 1 до 100, заменяя кратные 3 на "Fizz",
     * кратные 5 на "Buzz", и кратные 3 и 5 на "FizzBuzz".
     */
    public static void fizzBuzz() {
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);  // Выводим само число
            }
        }
    }

    /**
     * Основной метод для запуска программы
     *
     * @param args аргументы командной строки
     */
    public static void main(String[] args) {
        // Пример для метода проверки неубывающего массива
        int[] array1 = {1, 3, 5, 6, 7};
        System.out.println("Is non-decreasing: " + notDecreasing(array1));  // Ожидаем true

        // Вызов метода FizzBuzz
        System.out.println("FizzBuzz: ");
        fizzBuzz();
    }
}
