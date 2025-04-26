package by.HomeWorks.task21;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Date3Task {
    public static void main(String[] args) {
        System.out.println("Перевести String (2023-03-19 : 10:12:24 AM) " +
                "в формат LocalDateTime по умолчанию.");
        String dateTimeStr = "2023-03-19 : 10:12:24 AM";
        LocalDateTime dateTime = convertStringToLocalDateTime(dateTimeStr);
        System.out.println(dateTime);
    }

    public static LocalDateTime convertStringToLocalDateTime(String dateTimeStr) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd : hh:mm:ss a");
        return LocalDateTime.parse(dateTimeStr, formatter);
    }
}
