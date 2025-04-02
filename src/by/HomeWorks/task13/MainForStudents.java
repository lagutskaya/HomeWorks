package by.HomeWorks.task13;

import java.util.ArrayList;
import java.util.List;

public class MainForStudents {
    public static void main(String[] args) {
        Student gleb = new Student();
        gleb.setName("Глеб");
        gleb.setSurname("Тарасов");
        gleb.setBirthDate("05/12/2000");
        gleb.setBirthCity("Минск");
        gleb.setAverageMark(9);

        Student ivan = new Student();
        ivan.setName("Иван");
        ivan.setSurname("Иванов");
        ivan.setBirthDate("13/02/1998");
        ivan.setBirthCity("Полоцк");
        ivan.setAverageMark(3);

        Student petr = new Student();
        petr.setName("Петр");
        petr.setSurname("Петров");
        petr.setBirthDate("01/01/1980");
        petr.setBirthCity("Пинск");
        petr.setAverageMark(6);

        List<Student> studentList = new ArrayList<>();
        studentList.add(gleb);
        studentList.add(ivan);
        studentList.add(petr);


        Group group1 = new Group(101,FacultyStatus.ACITVE);
        Group group2 = new Group(102,FacultyStatus.NOT_ACTIVE);


        group1.addStudent(gleb);
        group1.addStudent(ivan);
        group2.addStudent(petr);


        System.out.println("Студенты группы 101 : ");
        for (Student student : group1.getStudents()) {
            System.out.println("Студент: " + student.getName() + " "
                    + student.getSurname() + ", Средний балл: "
                    + student.getAverageMark() + " Дата рождения : "
                    + student.getBirthDate() + " Город рождения : " + student.getBirthCity());
        }
        System.out.println("\nСтуденты группы 102 : ");
        for (Student student : group2.getStudents()) {
            System.out.println("Студент: " + student.getName() + " "
                    + student.getSurname() + ", Средний балл: "
                    + student.getAverageMark() + " Дата рождения : "
                    + student.getBirthDate() + " Город рождения : " + student.getBirthCity());
        }

        group1.transferToGroup(group2);
        group2.transferToGroup(group1);

        System.out.println("\nСредний балл группы 101 : " + group1.calculateAverageMark());
        System.out.println("Средний балл группы 102 : " + group2.calculateAverageMark());


        Faculty faculty1 = new Faculty("IT Faculty");
        Faculty faculty2 = new Faculty("QA Engineering");
        faculty1.addGroup(group1);
        faculty2.addGroup(group2);

        group2.checkFacultyStatus();


        System.out.println("\nСписок студентов до удаления из группы 101 из-за низкого среднего балла:");
        for (Student student : group1.getStudents()) {
            System.out.println("Студент: " + student.getName() + " "
                    + student.getSurname() + ", Средний балл: " + student.getAverageMark());
        }

        group1.removeStudentsByMark(4.0);

        System.out.println("\nСписок студентов после удаления из группы 101 из-за низкого среднего балла : ");
        for (Student student : group1.getStudents()) {
            System.out.println("Студент: " + student.getName() + " "
                    + student.getSurname() + ", Средний балл: " + student.getAverageMark());
        }

        group1.printStudentsByAverageMarkAscending();

        group1.printStudentsByAverageMarkDescending();
    }
}
