package by.HomeWorks.task20;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;
import java.util.concurrent.Callable;

public class FileGenerator implements Callable<String> {
    private final int fileNumber;

    public FileGenerator(int fileNumber) {
        this.fileNumber = fileNumber;
    }

    @Override
    public String call() throws Exception {
        String fileName = "file" + fileNumber + ".txt";

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
            for (int i = 0; i < 10; i++) {
                writer.write(generateRandomString());
                writer.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        int sleepTime = new Random().nextInt(3) + 1;
        Thread.sleep(sleepTime * 1000);

        System.out.println(Thread.currentThread().getName() + " создал файл: " + fileName);
        return fileName;
    }

    private String generateRandomString() {
        int length = 10;
        StringBuilder sb = new StringBuilder(length);
        Random random = new Random();
        for (int i = 0; i < length; i++) {
            sb.append((char) (random.nextInt(26) + 'a'));
        }
        return sb.toString();
    }

}
