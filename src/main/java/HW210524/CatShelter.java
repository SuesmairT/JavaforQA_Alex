package HW210524;

import java.util.Comparator;
import java.util.Map;
import java.util.Optional;
import java.util.TreeMap;

public class CatShelter {

    public static void main(String[] args) {
        Map<String, Cat> catMap = new TreeMap<>();
        catMap.put("Tom", new Cat("Tom", 5, 7.5, "Siamese"));
        catMap.put("Jerry", new Cat("Jerry", 3, 4.2, "Bengal"));
        catMap.put("Luna", new Cat("Luna", 2, 3.9, "Siamese"));
        catMap.put("Bella", new Cat("Bella", 4, 5.8, "Persian"));
        catMap.put("Charlie", new Cat("Charlie", 6, 6.5, "Bengal"));

        // Выведите имена котов, порода которых равна "Bengal"
        String targetBreed = "Bengal";
        System.out.println("Cats of breed " + targetBreed + ":");
        catMap.values()
                .stream()
                .filter(cat -> cat.breed.equals(targetBreed))
                .map(cat -> cat.name)
                .forEach(System.out::println);

        // Выведите список всех котов, вес которых больше 5.0
        double weightThreshold = 5.0;
        System.out.println("Cats with weight more than " + weightThreshold + ":");
        catMap.values()
                .stream()
                .filter(cat -> cat.weight > weightThreshold)
                .forEach(System.out::println);

        // Найдите кота с самым большим весом и возрастом одновременно
        Optional<Cat> heaviestOldestCat = catMap.values()
                .stream()
                .max(Comparator.comparingDouble((Cat cat) -> cat.weight)
                        .thenComparingInt(cat -> cat.age));

        heaviestOldestCat.ifPresent(cat -> System.out.println("Cat with largest weight and age: " + cat));
    }
}
