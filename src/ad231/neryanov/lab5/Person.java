package ad231.neryanov.lab5;
/**
 * Класс Person представляет человека с базовой информацией.
 * Содержит параметры, такие как фамилия, имя и возраст.
 * Предоставляет методы для получения и установки этих параметров.
 *
 * @author [Vlad Neryanov]
 * @version 1.0 10 Oct 2024
 */

public class Person {
    protected String surname;  // Фамилия человека
    protected String name;     // Имя человека
    protected int age;        // Возраст человека

    /**
     * Конструктор для создания экземпляра Person.
     *
     * @param surname фамилия человека
     * @param name имя человека
     * @param age возраст человека
     */
    public Person(String surname, String name, int age) {
        this.surname = surname;
        this.name = name;
        this.age = age;
    }

    public String printInfo(){
        return "Person " + surname + " " + name + ", age: " + age;
    }

    public String getSurname(){
        return surname;
    }
    public void setSurname(String surname){
        this.surname = surname;
    }

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }

    public int getAge(){
        return age;
    }
    public void setAge(int age){
        this.age = age;
    }
}
