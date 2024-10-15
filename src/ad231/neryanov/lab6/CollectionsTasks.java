package ad231.neryanov.lab6;

import java.util.*;

/**
 * Класс CollectionsTasks содержит методы для выполнения различных операций с коллекциями.
 *
 * @author [Vlad Neryanov]
 * @version 1.0 15 Oct 2024
 */
public class CollectionsTasks {

    /**
     * Выполняет задачи, связанные с коллекциями, включая создание, сортировку,
     * перемешивание и удаление дубликатов.
     */
    public static void performCollectionsTasks() {
        // a) Создание массива из N чисел
        int[] numbersArray = {5, 2, 8, 3, 1};

        // b) Создание списка List на основе массива
        List<Integer> numberList = new ArrayList<>();
        for (int number : numbersArray) {
            numberList.add(number);
        }

        // c) Сортировка списка в натуральном порядке
        Collections.sort(numberList);
        System.out.println("Отсортированный список: " + numberList);

        // d) Сортировка списка в обратном порядке
        Collections.sort(numberList, Collections.reverseOrder());
        System.out.println("Список в обратном порядке: " + numberList);

        // e) Перемешивание списка
        Collections.shuffle(numberList);
        System.out.println("Перемешанный список: " + numberList);

        // f) Циклический сдвиг на 1 элемент
        if (!numberList.isEmpty()) {
            Integer firstElement = numberList.remove(0);
            numberList.add(firstElement);
        }
        System.out.println("Список после циклического сдвига: " + numberList);

        // g) Удаление дубликатов
        List<Integer> uniqueList = new ArrayList<>(new HashSet<>(numberList));
        System.out.println("Список с уникальными элементами: " + uniqueList);

        // h) Удаление элементов, которые дублируются
        List<Integer> duplicateList = new ArrayList<>();
        for (Integer number : numberList) {
            if (Collections.frequency(numberList, number) > 1 && !duplicateList.contains(number)) {
                duplicateList.add(number);
            }
        }
        System.out.println("Список с дублирующимися элементами: " + duplicateList);

        // i) Получение массива из списка
        Integer[] arrayFromList = numberList.toArray(new Integer[0]);
        System.out.println("Массив из списка: " + Arrays.toString(arrayFromList));
    }
}
