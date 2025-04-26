package by.HomeWorks.task21;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Locale;

public class Date4Task {
    public static void main(String[] args) {
        System.out.println("Перевести String (пн 20.03.23 г. время: 15:07:28) " +
                "в формат LocalDateTime по умолчанию.");
        String dateTimeStr = "пн 20.03.23 г. время: 15:07:28";
        try {
            LocalDateTime dateTime = convertStringToLocalDateTime(dateTimeStr);
            System.out.println(dateTime);
        } catch (DateTimeParseException e) {
            System.err.println("Ошибка парсинга даты: " + e.getMessage());
        }
    }

    public static LocalDateTime convertStringToLocalDateTime(String dateTimeStr) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("EEE dd.MM.yy 'г.' время: HH:mm:ss",
                Locale.forLanguageTag("ru"));
        return LocalDateTime.parse(dateTimeStr, formatter);
    }
}