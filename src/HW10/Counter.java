package HW10;

import java.util.HashMap;
import java.util.Map;

public class Counter {
    public static void main(String[] args) {
        // перевірка на подачу аргументів в масив
        if (args.length == 0) {
            System.out.println("Please enter sentence as arguments through CLI.");
            return;
        }

        // зберігання аргументів в рядок, роздільником є пробіл
        String sentence = String.join(" ", args);

        // Map, щоб зберігти літери та їх кількість. Використовую клас Character (обгортка для char)
        Map<Character, Integer> letterCountMap = new HashMap<>();

        // Перетворення речення в масив символів і підрахунок кількості кожної літери
        for (char letter : sentence.toCharArray()) {
            // не рахувати (ігнорувати) пробіл
            if (Character.isWhitespace(letter)) {
                continue;
            }
            letterCountMap.put(letter, letterCountMap.getOrDefault(letter, 0) + 1);
        }

        System.out.println("Кількість кожної літери у реченні:");
        for (Map.Entry<Character, Integer> entry : letterCountMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
