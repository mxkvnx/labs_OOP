package ad231.neryanov.lab5;

/**
 * Класс Lecturer представляет преподавателя и наследует от класса Person.
 * Содержит уникальные параметры, такие как кафедра и зарплата.
 * Предоставляет метод для получения информации о преподавателе.
 *
 * @author [Vlad Neryanov]
 * @version 1.0 10 Oct 2024
 */
public class Lecturer extends Person {
    private String department;  // Кафедра преподавателя
    private int salary;         // Зарплата преподавателя

    /**
     * Конструктор для создания экземпляра Lecturer.
     *
     * @param surname фамилия преподавателя
     * @param name имя преподавателя
     * @param age возраст преподавателя
     * @param department кафедра преподавателя
     * @param salary зарплата преподавателя
     */
    public Lecturer(String surname, String name, int age, String department, int salary) {
        super(surname, name, age);
        this.department = department;
        this.salary = salary;
    }

    @Override
    public String printInfo() {
        return "Lecturer of department " + department + " " + surname + " " + name + ", age: " + age + ". Salary: " + salary;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}
