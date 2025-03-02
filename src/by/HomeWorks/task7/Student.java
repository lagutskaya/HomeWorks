package by.HomeWorks.task7;

public class Student {
    int id;
    String name;
    String surname;
    String faculty;
    int course;
    String group;
    int averageRating;

    public Student(int id, String name, String surname, String faculty, int course, String group, int averageRating) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.faculty = faculty;
        this.course = course;
        this.group = group;
        this.averageRating = averageRating;
    }

    public Student() {
    }

    public void info() {
        System.out.println("ID : " + id + " Name : " + name + " Surname : " + surname + " Faculty : " + faculty
                + " Course : " + course + " Group : " + group + " Average Rating : " + averageRating);
    }

    public void changeGroup(String newGroup) {
        this.group = newGroup;
    }

    public String getCurrentGroup() {
        return this.group;
    }

    public void changeRatingAndGroup(int newRating, String newGroup) {
        this.averageRating = newRating;
        this.group = newGroup;
    }

    public Student[] getStudents(Student[] students, int mark) {
        int count = 0;
        for (Student student : students) {
            if (student.averageRating > mark) {
                count++;
            }
        }

        Student[] highRatingStudents = new Student[count];
        int i = 0;
        for (Student student : students) {
            if (student.averageRating > mark) {
                highRatingStudents[i] = student;
                i++;
            }
        }

        return highRatingStudents;
    }
}
