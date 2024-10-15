/*
 * @(#)Person.java 1.0 2024/10/10
 *
 * Copyright (c) 2024 [Vlad Neryanov], Inc.
 * All Rights Reserved.
 *
 * This software is the confidential and proprietary information of [Vlad Neryanov].
 * You shall not disclose such Confidential Information and shall use it only in
 * accordance with the terms of the license agreement you entered into.
 */
package ad231.neryanov.lab5;

/**
 * Класс Main содержит метод main, который является точкой входа в программу.
 * Здесь создаются объекты студентов и преподавателей,
 * и выводится информация о них в консоль.
 *
 * @author [Vlad Neryanov]
 * @version 1.0 10 Oct 2024
 */

public class Main {
    public static void main(String[] args) {
        Person student1 = new Student("Ivanov", "Vasiliy", 18, "AA-222", 525423);
        Person lecturer1 = new Lecturer("Shevchenko", "Taras", 52, "Literature", 15000);
        Person student2 = new Student("Petrov", "Alexey", 20, "BB-333", 452342);
        Person lecturer2 = new Lecturer("Franko", "Ivan", 45, "History", 20000);

        Person[] arr = new Person[4];
        arr[0] = student1;
        arr[1] = student2;
        arr[2] = lecturer1;
        arr[3] = lecturer2;

        for(Person p : arr){
            System.out.println(p.printInfo());
        }

    }
}
