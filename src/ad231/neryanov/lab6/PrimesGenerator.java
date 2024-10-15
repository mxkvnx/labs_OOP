package ad231.neryanov.lab6;

import java.util.*;

/**
 * Класс PrimesGenerator генерирует простые числа и выводит их на консоль.
 *
 * @author [Vlad Neryanov]
 * @version 1.0 15 Oct 2024
 */
public class PrimesGenerator {

    /**
     * Генерирует заданное количество простых чисел.
     *
     * @param n количество простых чисел для генерации
     * @return список простых чисел
     */
    public List<Integer> generatePrimes(int n) {
        List<Integer> primes = new ArrayList<>();
        int count = 0;
        int num = 2; // Начинаем с первого простого числа

        while (count < n) {
            if (isPrime(num)) {
                primes.add(num);
                count++;
            }
            num++;
        }
        return primes;
    }

    /**
     * Проверяет, является ли число простым.
     *
     * @param num число для проверки
     * @return true, если число простое, иначе false
     */
    private boolean isPrime(int num) {
        if (num < 2) return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    /**
     * Отображает простые числа и их обратный порядок.
     *
     * @param n количество простых чисел для отображения
     */
    public void displayPrimes(int n) {
        List<Integer> primes = generatePrimes(n);
        System.out.println("Простые числа: " + primes);
        Collections.reverse(primes);
        System.out.println("Простые числа в обратном порядке: " + primes);
    }
}
