package ad231.neryanov.lab6;
/**
 * Класс Human представляет человека с полями имя, фамилия и возраст.
 * Реализует интерфейс Comparable для поддержки сортировки.
 *
 * @author [Vlad Neryanov]
 * @version 1.0 15 Oct 2024
 */
public class Human implements Comparable<Human> {
    private String name; // Имя
    private String surname; // Фамилия
    private int age;      // Возраст

    public Human(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    @Override
    public int compareTo(Human o) {
        int rez;
        if (this.equals(o)) return 0;
        rez = name.compareToIgnoreCase(o.getfName());
        if (rez != 0) return rez;
        rez = surname.compareToIgnoreCase(o.getlName());
        if (rez != 0) return rez;
        else return age - o.getAge();
    }

    public String getfName() {
        return name;
    }

    public String getlName() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Human{" +
                "fName='" + name + '\'' +
                ", lName='" + surname + '\'' +
                ", age=" + age +
                '}';
    }
}
