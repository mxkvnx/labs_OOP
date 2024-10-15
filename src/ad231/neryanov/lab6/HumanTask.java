package ad231.neryanov.lab6;

import java.util.*;

/**
 * Класс HumanTask содержит методы для выполнения задач, связанных с классом Human.
 *
 * @author [Vlad Neryanov]
 * @version 1.0 15 Oct 2024
 */
public class HumanTask {

    /**
     * Выполняет задачи, связанные с классом Human, включая создание коллекций
     * и их сортировку.
     */
    public static void performHumanTasks() {
        Set<Human> humans = new HashSet<>();
        humans.add(new Human("Ivan", "Ivanov", 30));
        humans.add(new Human("Petr", "Petrov", 25));
        humans.add(new Human("Sidor", "Sidorov", 28));

        // TreeSet с компаратором по фамилии
        TreeSet<Human> treeSetByLName = new TreeSet<>(new ComparatorBySurname());
        treeSetByLName.addAll(humans);
        System.out.println("TreeSet, отсортированный по фамилии:");
        for (Human human : treeSetByLName) {
            System.out.println(human);
        }

        // TreeSet с анонимным компаратором по возрасту
        TreeSet<Human> treeSetByAge = new TreeSet<>((h1, h2) -> Integer.compare(h1.getAge(), h2.getAge()));
        treeSetByAge.addAll(humans);
        System.out.println("TreeSet, отсортированный по возрасту:");
        for (Human human : treeSetByAge) {
            System.out.println(human);
        }
    }
}
