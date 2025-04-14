package by.HomeWorks.task17.File;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class MainForFile {
    public static void main(String[] args) {
        System.out.println("Чтение из файла с относительным путем: \n");
        writeToFileRelativePath();

        System.out.println("\n\nЧтение из файла с абсолютным путем: \n");
        writeToFileAbsolutePath();
    }

    public static void writeToFileRelativePath() {
        try (FileInputStream fileInputStream = new FileInputStream("src/Files/Text.txt")) {
            int symbol;
            while ((symbol = fileInputStream.read()) != -1) {
                System.out.print((char) symbol);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException("Файл не найден", e);
        } catch (IOException e) {
            throw new RuntimeException("Ошибка при чтении файла", e);
        }
    }

    public static void writeToFileAbsolutePath() {
        String path = "C:\\Users\\harni\\OneDrive\\Desktop\\Курсы Полина\\Text.txt";
        try (FileInputStream fileInputStream = new FileInputStream(path)) {
            int symbol;
            while ((symbol = fileInputStream.read()) != -1) {
                System.out.print((char) symbol);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException("Файл не найден по пути: " + path, e);
        } catch (IOException e) {
            throw new RuntimeException("Ошибка при чтении файла", e);
        }
    }
}