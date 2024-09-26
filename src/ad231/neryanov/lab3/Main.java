/*
 * @(#)Main.java 1.0 2024/09/26
 *
 * Copyright (c) 2024 [Vlad Neryanov], Inc.
 * All Rights Reserved.
 *
 * This software is the confidential and proprietary information of [Vlad Neryanov].
 * You shall not disclose such Confidential Information and shall use it only in
 * accordance with the terms of the license agreement you entered into.
 */

package ad231.neryanov.lab3;
/**
 * Класс Main демонстрирует функциональность методов класса StringLab.
 * Программа выполняет проверки строк и выводит результаты.
 *
 * @author [Vlad Neryanov]
 * @version 1.0 26 Sep 2024
 */
public class Main {
    /**
     * Основной метод для запуска программы
     *
     * @param args аргументы командной строки
     */
    public static void main(String[] args) {
        String testString1 = "finished";
        String testString2 = "123abc45";
        String testString3 = "aaBCSaaa";
        String testString4 = "Hello world, this is a test.";
        String testString5A = "abc";
        String testString5B = "defghi";

        // 1
        boolean endsWithEd = StringLab.firstTask(testString1);
        System.out.println("Строка \"" + testString1 + "\" заканчивается на 'ed': " + endsWithEd);

        // 2
        int sumOfDigits = StringLab.secondTask(testString2);
        System.out.println("Сумма цифр в строке \"" + testString2 + "\": " + sumOfDigits);

        // 3
        int longestBlockLength = StringLab.thirdTask(testString3);
        System.out.println("Длина самого длинного блока символов в строке \"" + testString3 + "\": " + longestBlockLength);

        // 4
        StringLab.fourthTask(testString4);

        // 5
        String interleavedString = StringLab.fiveTask(testString5A, testString5B);
        System.out.println("Результат чередования строк \"" + testString5A + "\" и \"" + testString5B + "\": " + interleavedString);
    }
}
