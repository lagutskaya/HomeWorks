package by.HomeWorks.task14;

import java.util.HashSet;
import java.util.Set;

public class Department {
    private String departmentName; // Наименование отделения
    private Set<Room> rooms;        // Список палат

    public Department(String departmentName) {
        this.departmentName = departmentName;
        this.rooms = new HashSet<>();
    }
    public void addRoom(Room room) {
        rooms.add(room);
    }

    public int[] countGenders() {
        int maleCount = 0;
        int femaleCount = 0;

        for (Room room : rooms) {
            for (Patient patient : room.getPatients()) {
                if (patient.getGender() == Gender.MALE) {
                    maleCount++;
                } else if (patient.getGender() == Gender.FEMALE) {
                    femaleCount++;
                }
            }
        }

        return new int[] { maleCount, femaleCount };
    }

    public String getDepartmentName() {
        return this.departmentName;
    }

    public Set<Room> getRooms() {
        return rooms;
    }
}
