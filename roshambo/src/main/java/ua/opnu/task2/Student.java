package ua.opnu.task2;

public class Student extends Person {
    private String group;
    private String studentIdNumber;

    public Student(String lastName, String firstName, int age, String group, String studentIdNumber) {
        super(lastName, firstName, age); // Виклик конструктора батьківського класу
        this.group = group;
        this.studentIdNumber = studentIdNumber;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public String getStudentIdNumber() {
        return studentIdNumber;
    }

    public void setStudentIdNumber(String studentIdNumber) {
        this.studentIdNumber = studentIdNumber;
    }

    @Override
    public String toString() {
        return "Студент групи " + group + ", " + getLastName() + " " + getFirstName() +
                ", вік: " + getAge() + ". Номер студентського квитка: " + studentIdNumber;
    }
}