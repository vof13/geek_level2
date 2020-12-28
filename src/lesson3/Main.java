package lesson3;

import java.util.*;

public class Main {
    public static void main(String[] args) {

// Задание 1

        List<String> list = new ArrayList<>(Arrays.asList("Крыло", "Фюзеляж", "Лонжерон", "Пуск", "Поехали",
                "Летчик", "Пилот", "Самолет", "Крыло", "Крыло",
                "Крыло", "Хвост", "Ракета", "Пилот", "Пилот"));
        Map<String, Integer> map = new HashMap <>();

        for (String i: list) {
            map.put(i, Collections.frequency(list, i));
        }


        System.out.println("Уникальные слова: ");
        map.forEach((k, v) -> {
            if (v == 1){
                System.out.print(k + " ");
            }
        });

        System.out.println("\n");
        map.forEach((k, v) -> System.out.println("Слово '" + k + "' встречается " + v + " раз."));

        // Задача 2

        Phonebook phonebook = new Phonebook();
        phonebook.add("Ivanov", "+375293333333");
        phonebook.add("Petrov", "+375294444444");
        phonebook.add("Sidorov", "+375295555555");
        phonebook.add("Ivanov", "+375293333311");
        phonebook.add("Ivanov", "+375293333322");


        System.out.println(phonebook.get("Ivanov"));
        System.out.println(phonebook.get("Sidorov"));
    }






}
