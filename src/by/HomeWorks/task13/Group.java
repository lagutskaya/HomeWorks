package by.HomeWorks.task13;

import java.util.ArrayList;
import java.util.List;

public class Group {
    private int numberOfGroup;
    List<Student> students;
    private FacultyStatus facultyStatus;

    public Group(int numberOfGroup, FacultyStatus facultyStatus){
        this.numberOfGroup = numberOfGroup;
        this.students = new ArrayList<>();
        this.facultyStatus = facultyStatus;
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public void removeStudentsByMark(double mark) {
        List<Student> studentsToRemove = new ArrayList<>();

        for (Student student : students) {
            if (student.getAverageMark() < mark) {
                studentsToRemove.add(student);
            }
        }
        students.removeAll(studentsToRemove);
    }

    public void transferToGroup(Group newGroup) {
        if (students.size() < 2) {
            newGroup.getStudents().addAll(students);
            students.clear();
            System.out.println("\nСтуденты из группы 102 переведены в группу 101.");
        } else {
            System.out.println("\nВ группе 101 достаточно студентов, перевод не требуется.");
        }
    }

    public double calculateAverageMark() {
        if (students.isEmpty()) {
            return 0.0;
        }

        double totalMark = 0.0;
        for (Student student : students) {
            totalMark += student.getAverageMark();
        }

        return totalMark / students.size();
    }

    public void checkFacultyStatus() {
        if (students.size() < 20) {
            facultyStatus = FacultyStatus.NOT_ACTIVE;
            System.out.println("\nФакультет QA Engineering стал неактивным из-за недостаточного количества студентов.");
        }
    }

    public void printStudentsByAverageMarkAscending() {
        for (int i = 0; i < students.size() - 1; i++) {
            for (int j = 0; j < students.size() - i - 1; j++) {
                if (students.get(j).getAverageMark() > students.get(j + 1).getAverageMark()) {
                    Student temp = students.get(j);
                    students.set(j, students.get(j + 1));
                    students.set(j + 1, temp);
                }
            }
        }

        System.out.println("\nСписок студентов в порядке возрастания среднего балла:");
        for (Student student : students) {
            System.out.println("Студент: " + student.getName() + " " + student.getSurname() + ", Средний балл: " + student.getAverageMark());
        }
    }

    public void printStudentsByAverageMarkDescending() {
        for (int i = 0; i < students.size() - 1; i++) {
            for (int j = 0; j < students.size() - i - 1; j++) {
                if (students.get(j).getAverageMark() < students.get(j + 1).getAverageMark()) {
                    Student temp = students.get(j);
                    students.set(j, students.get(j + 1));
                    students.set(j + 1, temp);
                }
            }
        }

        System.out.println("\nСписок студентов в порядке убывания среднего балла:");
        for (Student student : students) {
            System.out.println("Студент: " + student.getName() + " " + student.getSurname() + ", Средний балл: " + student.getAverageMark());
        }
    }

    public FacultyStatus getFacultyStatus() {
        return facultyStatus;
    }

    public void setFacultyStatus(FacultyStatus facultyStatus) {
        this.facultyStatus = facultyStatus;
    }

    public int getNumberOfGroup() {
        return numberOfGroup;
    }

    public void setNumberOfGroup(int numberOfGroup) {
        this.numberOfGroup = numberOfGroup;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }
}
