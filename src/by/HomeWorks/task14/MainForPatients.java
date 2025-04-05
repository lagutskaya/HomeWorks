package by.HomeWorks.task14;

public class MainForPatients {
    public static void main(String[] args) {
        Patient ivan = new Patient(88, "Аппендицит", Gender.MALE, "123qwe", "Иван", "Иванов");
        Patient irina = new Patient(22, "Гастрит", Gender.FEMALE, "1918fg", "Ирина", "Козлова");
        Patient alena = new Patient(31, "Гастрит", Gender.FEMALE, "2332tr", "Алена", "Дрозд");
        Patient ivanov = new Patient(88, "Аппендицит", Gender.MALE, "123qwe", "Иван", "Иванов");
        Patient nikita = new Patient(24, "Мигрень", Gender.MALE, "456df", "Никита", "Китов");

        Room room101 = new Room(101, RoomType.MALE);
        Room room102 = new Room(102, RoomType.FEMALE);

        Department department1 = new Department("Хирургическое");
        department1.addRoom(room101);
        Department department2 = new Department("Терапевтическое");
        department2.addRoom(room102);


        System.out.println("Отделение: " + department1.getDepartmentName());
        System.out.println("Палаты в отделении:");
        for (Room room : department1.getRooms()) {
            System.out.println("Палата номер " + room.getRoomNumber() + " (Тип: " + room.getRoomType() + ")");
        }


        System.out.println("\nОтделение: " + department2.getDepartmentName());
        System.out.println("Палаты в отделении:");
        for (Room room : department2.getRooms()) {
            System.out.println("Палата номер " + room.getRoomNumber() + " (Тип: " + room.getRoomType() + ")");
        }

        room101.addPatientByDiagnosis(ivan);
        room102.addPatientByDiagnosis(irina);
        room102.addPatientByDiagnosis(alena);
        room101.addPatientByDiagnosis(ivanov);
        room102.addPatientByDiagnosis(nikita);

        int[] genderCountsDepartment1 = department1.countGenders();
        System.out.println("\nКоличество мужчин в хирургическом отделении : " + genderCountsDepartment1[0]);
        System.out.println("Количество женщин в хирургическом отделении : " + genderCountsDepartment1[1]);

        int[] genderCountsDepartment2 = department2.countGenders();
        System.out.println("\nКоличество мужчин в терапевтическом отделении: " + genderCountsDepartment2[0]);
        System.out.println("Количество женщин в терапевтическом отделении: " + genderCountsDepartment2[1]);

        room101.printPatientInfo();
        room102.printPatientInfo();
    }
}

