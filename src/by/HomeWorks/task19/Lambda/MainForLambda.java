package by.HomeWorks.task19.Lambda;

public class MainForLambda {
    public static void main(String[] args) {
        StringProcessor toUpperCase = input -> input.toUpperCase();

        String original = "лямбда это круто";
        String result = toUpperCase.process(original);

        System.out.println(result);
    }
}
