package ad231.neryanov.lab5;

/**
 * Класс Student представляет студента и наследует от класса Person.
 * Содержит уникальные параметры, такие как группа и номер студенческого билета.
 * Предоставляет метод для получения информации о студенте.
 *
 * @author [Vlad Neryanov]
 * @version 1.0 10 Oct 2024
 */
public class Student extends Person {
    private String group;      // Группа студента
    private int studPass;      // Номер студенческого билета

    /**
     * Конструктор для создания экземпляра Student.
     *
     * @param surname фамилия студента
     * @param name имя студента
     * @param age возраст студента
     * @param group группа студента
     * @param studPass номер студенческого билета
     */
    public Student(String surname, String name, int age, String group, int studPass) {
        super(surname, name, age);
        this.group = group;
        this.studPass = studPass;
    }

    @Override
    public String printInfo() {
        return "Student of group " + group + " " + surname + " " + name + ", age: " + age + ". Student pass number: " + studPass;
    }

    public String getCourse() {
        return group;
    }

    public void setCourse(String course) {
        this.group = course;
    }

    public int getStudPass() {
        return studPass;
    }

    public void setStudPass(int studPass) {
        this.studPass = studPass;
    }
}
