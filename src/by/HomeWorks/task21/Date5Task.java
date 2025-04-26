package by.HomeWorks.task21;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Date5Task {
    public static void main(String[] args) {
        System.out.println("Вывести текущую дату в формате (пример формата:\n" +
                "понедельник 20 марта 2023 время: 11.54.06 PM). На выходе дата должна быть класса String");
        String currentFormattedDateTime = getCurrentFormattedDateTime();
        System.out.println(currentFormattedDateTime);
    }

    public static String getCurrentFormattedDateTime() {
        LocalDateTime dateTime = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("EEEE dd MMMM yyyy время: hh.mm.ss a");
        return dateTime.format(formatter);
    }
}
