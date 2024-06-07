package HW_060624;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
            public static void main(String[] args) {
            // Примеры входных данных
            List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 60, 71, 82, 93);
            List<String> strings = Arrays.asList("apple", "banana", "apple", "orange", "grape", "apricot");
            List<String> numberStrings = Arrays.asList("1", "2", "3", "4", "5");
            List<User> users = Arrays.asList(
                    new User("Alice", 30),
                    new User("Bob", 25),
                    new User("Charlie", 35),
                    new User("David", 20)
            );

            // Задание 1: Фильтрация списка целых чисел на нечетные числа
            List<Integer> oddNumbers = numbers.stream()
                    .filter(n -> n % 2 != 0)
                    .collect(Collectors.toList());
            System.out.println("Odd numbers: " + oddNumbers);

            // Задание 2: Фильтрация четных чисел и умножение на 2
            List<Integer> evenNumbersMultiplied = numbers.stream()
                    .filter(n -> n % 2 == 0)
                    .map(n -> n * 2)
                    .collect(Collectors.toList());
            System.out.println("Even numbers multiplied by 2: " + evenNumbersMultiplied);

            // Задание 3: Фильтрация чисел больше 50 и вывод их квадратов
            List<Integer> squaresOfNumbersGreaterThan50 = numbers.stream()
                    .filter(n -> n > 50)
                    .map(n -> n * n)
                    .collect(Collectors.toList());
            System.out.println("Squares of numbers greater than 50: " + squaresOfNumbersGreaterThan50);

            // Задание 4: Удаление дубликатов из списка строк
            List<String> uniqueStrings = strings.stream()
                    .distinct()
                    .collect(Collectors.toList());
            System.out.println("Unique strings: " + uniqueStrings);

            // Задание 5: Пропуск первых двух элементов и вывод оставшихся
            List<Integer> skippedFirstTwo = numbers.stream()
                    .skip(2)
                    .collect(Collectors.toList());
            System.out.println("Skipped first two elements: " + skippedFirstTwo);

            // Задание 6: Преобразование списка строк в список чисел
            List<Integer> convertedNumbers = numberStrings.stream()
                    .map(Integer::valueOf)
                    .collect(Collectors.toList());
            System.out.println("Converted numbers: " + convertedNumbers);

            // Задание 7: Суммирование списка чисел
            int sumOfNumbers = numbers.stream()
                    .mapToInt(Integer::intValue)
                    .sum();
            System.out.println("Sum of numbers: " + sumOfNumbers);

            // Задание 8: Определение максимального значения в списке
                //Object NoSuchElementException;
                //int maxNumber = numbers.stream()
                   // .mapToInt(Integer::intValue);
                   // .max()
                    //.orElseThrow(NoSuchElementException::new);
            //System.out.println("Max number: " + maxNumber);

            // Задание 9: Фильтрация строк, начинающихся на "A" и преобразование в верхний регистр
            List<String> filteredStrings = strings.stream()
                    .filter(s -> s.startsWith("A") || s.startsWith("a"))
                    .map(String::toUpperCase)
                    .collect(Collectors.toList());
            System.out.println("Strings starting with 'A' in uppercase: " + filteredStrings);

            // Задание 10: Сортировка списка чисел в порядке убывания и выбор первых трех элементов
            List<Integer> topThreeNumbers = numbers.stream()
                    .sorted(Comparator.reverseOrder())
                    .limit(3)
                    .collect(Collectors.toList());
            System.out.println("Top three numbers: " + topThreeNumbers);

            // Задание 11: Фильтрация списка строк на те, которые начинаются с определенной буквы и преобразование их в верхний регистр
            char filterChar = 'a';
            List<String> filteredByCharStrings = strings.stream()
                    .filter(s -> s.toLowerCase().startsWith(String.valueOf(filterChar)))
                    .map(String::toUpperCase)
                    .collect(Collectors.toList());
            System.out.println("Strings starting with '" + filterChar + "' in uppercase: " + filteredByCharStrings);

            // Задание 12: Получение списка уникальных слов из списка строк, длина которых больше 4 символов
            List<String> uniqueLongWords = strings.stream()
                    .filter(s -> s.length() > 4)
                    .distinct()
                    .collect(Collectors.toList());
            System.out.println("Unique long words: " + uniqueLongWords);

            // Задание 13: Нахождение суммы чисел, кратных 3 и 5, из списка чисел
            int sumOfMultiplesOf3And5 = numbers.stream()
                    .filter(n -> n % 3 == 0 || n % 5 == 0)
                    .mapToInt(Integer::intValue)
                    .sum();
            System.out.println("Sum of multiples of 3 and 5: " + sumOfMultiplesOf3And5);

            // Задание 14: Фильтрация и сортировка пользователей по возрасту
            List<User> sortedUsers = users.stream()
                    .sorted(Comparator.comparingInt(User::getAge))
                    .collect(Collectors.toList());
            System.out.println("Sorted users by age:");
            sortedUsers.forEach(user -> System.out.println(user.getName() + " - " + user.getAge()));
        }
    }

    class User {
        private String name;
        private int age;

        public User(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public int getAge() {
            return age;
        }
    }

