package by.HomeWorks.task21;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Date1Task {
    public static void main(String[] args) {
        System.out.println("Вывести текущую дату в формате (пример формата:1 апреля 2023). " +
                "На выходе дата должна быть класса String");
        String currentDate = getCurrentDate();
        System.out.println(currentDate);
    }

    public static String getCurrentDate() {
        LocalDate date = LocalDate.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d MMMM yyyy");
        return date.format(formatter);
    }
}

