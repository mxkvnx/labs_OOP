/*
 * @(#)Main.java 1.0 2024/10/15
 *
 * Copyright (c) 2024 [Vlad Neryanov], Inc.
 * All Rights Reserved.
 *
 * This software is the confidential and proprietary information of [Vlad Neryanov].
 * You shall not disclose such Confidential Information and shall use it only in
 * accordance with the terms of the license agreement you entered into.
 */
package ad231.neryanov.lab6;
/**
 * Класс Main является точкой входа в программу.
 * Он запускает выполнение всех заданий, связанных с коллекциями, генерацией простых чисел и классом Human.
 *
 * @author [Vlad Neryanov]
 * @version 1.0 15 Oct 2024
 */
public class Main {
    public static void main(String[] args) {
        // Задание 1: Работа со списком
        CollectionsTasks.performCollectionsTasks();

        // Задание 2: Генератор простых чисел
        PrimesGenerator primesGenerator = new PrimesGenerator();
        primesGenerator.displayPrimes(10);

        // Задание 3: Работа с классами Human
        HumanTask.performHumanTasks();
    }
}
