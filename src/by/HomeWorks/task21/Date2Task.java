package by.HomeWorks.task21;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Date2Task {
    public static void main(String[] args) {
        System.out.println("Вывести текущую дату в формате (пример формата: 1 апреля 2023, 10:59:20 PM).");
        String currentDateTime = getCurrentDateTime();
        System.out.println(currentDateTime);
    }

    public static String getCurrentDateTime() {
        LocalDateTime dateTime = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d MMMM yyyy, hh:mm:ss a");
        return dateTime.format(formatter);
    }
}
