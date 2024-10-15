package ad231.neryanov.lab6;
import java.util.Comparator;

/**
 * Класс HumanComparatorByLName реализует интерфейс Comparator для сравнения объектов Human по фамилии.
 *
 * @author [Vlad Neryanov]
 * @version 1.0 15 Oct 2024
 */
public class ComparatorBySurname implements Comparator<Human> {

    /**
     * Сравнивает двух людей по их фамилиям.
     *
     * @param h1 первый человек для сравнения
     * @param h2 второй человек для сравнения
     * @return отрицательное значение, если h1 меньше h2; положительное, если больше; 0, если равны
     */
    @Override
    public int compare(Human h1, Human h2) {
        return h1.getlName().compareToIgnoreCase(h2.getlName());
    }
}
