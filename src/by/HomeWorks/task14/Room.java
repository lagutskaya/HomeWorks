package by.HomeWorks.task14;

import java.util.Set;
import java.util.TreeSet;

public class Room {
    private int roomNumber;
    private RoomType roomType;
    private Set<Patient> patients; // Список пациентов

    public Room(int roomNumber, RoomType roomType) {
        this.roomNumber = roomNumber;
        this.roomType = roomType;
        this.patients = new TreeSet<>(); // Используем TreeSet для автоматической сортировки
    }

    public boolean addPatientByDiagnosis(Patient patient) {
        if (patients.contains(patient)) {
            System.out.println("\nПациент с такими данными уже существует в палате.");
            return false;
        }

        if (patients.size() < 3) {
            if (patients.isEmpty()) {
                patients.add(patient);
                return true;
            } else {
                String diagnosis = patient.getDiagnosis();
                for (Patient p : patients) {
                    if (!p.getDiagnosis().equals(diagnosis)) {
                        System.out.println("Пациент с диагнозом \"" + diagnosis + "\" не может быть добавлен в палату, "
                                + "где уже есть пациенты с другими диагнозами.");
                        return false;
                    }
                }
                patients.add(patient);
                return true;
            }
        } else {
            System.out.println("Палата " + roomNumber + " переполнена. Максимум 3 пациента.");
            return false;
        }
    }

    public void printPatientInfo() {
        System.out.println("\nПациенты в палате номер " + roomNumber + " (Тип: " + roomType + "):");
        if (patients.isEmpty()) {
            System.out.println("Нет пациентов в палате.");
        } else {
            for (Patient patient : patients) {
                System.out.println("Пациент: " + patient.getId() + " - " + patient.getName() + " " +
                        patient.getSurname() + ", Возраст: " + patient.getAge() +
                        ", Пол: " + patient.getGender() + ", Диагноз: " + patient.getDiagnosis());
            }
        }
    }

    public Set<Patient> getPatients() {
        return patients;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public RoomType getRoomType() {
        return roomType;
    }
}