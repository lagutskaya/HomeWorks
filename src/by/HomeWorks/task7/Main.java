package by.HomeWorks.task7;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student(1, "Иван", "Иванов", "Инженер", 2, "201", 85);
        Student student2 = new Student();

        student1.info();

        student2.info();


        student1.changeGroup("201/2");

        Student[] students = new Student[5];
        students[0] = new Student(1, "Костя", "Сидоров", "Инженер", 2, "101", 100);
        students[1] = new Student(2, "Андрей", "Петров", "Певец", 3, "102", 90);
        students[2] = new Student(3, "Катя", "Котова", "Тестировщик", 1, "103", 75);
        students[3] = new Student(4, "Николай", "Потемкин", "Клинер", 2, "104", 43);
        students[4] = new Student(5, "Сан", "Саныч", "Юрист", 3, "105", 80);

        Student studentHelper = new Student();
        Student[] highRatingStudents = studentHelper.getStudents(students, 80);

        System.out.println("Студенты с оценкой выше 80 : ");
        for (Student student : highRatingStudents) {
            student.info();
        }
    }
}
