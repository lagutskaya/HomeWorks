package by.HomeWorks.task20;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class MainForFileGenerator {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(3);
        List<Future<String>> futures = new ArrayList<>();

        for (int i = 1; i <= 10; i++) {
            FileGenerator fileGenerator = new FileGenerator(i);
            futures.add(executor.submit(fileGenerator));
        }

        for (Future<String> future : futures) {
            try {
                String fileName = future.get();
                System.out.println("Сгенерированный файл: " + fileName);
            } catch (InterruptedException | ExecutionException e) {
                e.printStackTrace();
            }
        }

        executor.shutdown();
    }
}
