package ua.opnu.task2;

public class main {
    public static void main(String[] args) {
        Person student1 = new Student("Кучерявенко", "Олексій", 20, "АІ-243", "KB12345678");
        Person lecturer1 = new Lecturer("Пасічник", "Валентина", 45, "Комп'ютерних наук", 25000.0);
        Student student2 = new Student("Перепилиця", "Володимир", 19, "АС-231", "KC87654321");
        Lecturer lecturer2 = new Lecturer("Семко", "Марина", 38, "Програмної інженерії", 22500.50);

        Person[] people = new Person[4];
        people[0] = student1;
        people[1] = lecturer1;
        people[2] = student2;
        people[3] = lecturer2;

        System.out.println("Інформація про всіх осіб в масиві:");
        for (Person person : people) {
            System.out.println(person.toString());
        }
    }
}