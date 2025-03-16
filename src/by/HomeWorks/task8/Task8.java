package by.HomeWorks.task8;

public class Task8 {
    public static void main(String[] args) {
        System.out.println("Задача 1");
        String str1 = "Я люблю Java";
        String str2 = "Java";
        String result = getString(str1, str2);
        System.out.println(result);

        int index = str1.indexOf(str2);
        if (index != -1) {
            System.out.println("Строка " + str2 + " начинается с индекса " + index);
        } else System.out.println("Строка " + str2 + " не найдена в строке");
        getText();
        getPatternText();

    }

    public static String getString(String str1, String str2) {
        if (str1.endsWith(str2)) {
            return str1.substring(0, str1.length() - str2.length());
        } else {
            return str1.toUpperCase();
        }
    }

    public static void getText() {
        System.out.println("Задача 2");
        String text = "Каждая строка, создаваемая с помощью оператора new, литерала" +
                " (заключенная в двойные апострофы) и ли метода класса, создающего строку, является экземпляром" +
                "класса String. Особенностью объекта класса String является то, что его значение не может быть" +
                " изменено после создания объекта при помощи любого метода класса. Изменение строки всегда " +
                "приводит к созданию нового объекта в heap. Сама объектная ссылка при этом сохраняет прежнее" +
                " значение и хранится в стеке. Произведенные изменения можно сохранить переинициализируя" +
                "ссылку.";
        int k = 5;
        String str = "!!!";
        String result = insertSubstring(text, k, str);
        System.out.println(result);
    }

    public static String insertSubstring(String text, int k, String str) {
        String[] words = text.split(" ");
        String modifiedText = "";

        for (String word : words) {
            if (k < word.length()) {
                String modifiedWord = word.substring(0, k) + str + word.substring(k);
                modifiedText += modifiedWord + " ";
            } else {
                modifiedText += word + " ";
            }
        }

        return modifiedText;
    }

    public static void getPatternText() {
        System.out.println("Задача 3");
        String text = "Да1та выпуска 8 декабря 1998 года[12]. Кодовое имя Playground. В данном случае встречается" +
                " путаница. Выпускались книги, например,Beginning Java 2 by Ivor Horton (Mar 1999), фактически" +
                " по J2SE 1.2 (бывшее название — Java 2). Вместе с тем по сей день такие книги публикуются, " +
                "например:Х. М. Дейтел, П. Дж. Дейтел, С. И. Сантри. Технологии программирования на Java 2. " +
                "Распределённые приложения (2011). В то время, когда, как известно, Java 2была исторически заменена " +
                "следующими релизами, подобные названия книг" +
                "дезориентируют в понимании, о какой же версии Java они написаны на самом деле." +
                "Если J2SE 1.2 принято считать за Java 2, а авторы книг за Java 2 принимают JDK 7, " +
                "это приводит к полной путанице.";
        String cleanedText = cleanedText(text);
        System.out.println(cleanedText);
    }

    public static String cleanedText(String text) {
        return text.replaceAll("[^а-яА-ЯёЁa-zA-Z ]+", "");
    }
}

