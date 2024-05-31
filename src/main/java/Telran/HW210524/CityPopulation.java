package Telran.HW210524;

import java.util.*;

public class CityPopulation {
    public static void main(String[] args) {
        Map<String, Integer> cityPopulation = new HashMap<>();
        cityPopulation.put("CityA", 500000);
        cityPopulation.put("CityB", 1000000);
        cityPopulation.put("CityC", 750000);
        cityPopulation.put("CityD", 1000000);

        // Найти город с самым большим количеством жителей
        Optional<Map.Entry<String, Integer>> maxEntry = cityPopulation.entrySet()
                .stream()
                .max(Map.Entry.comparingByValue());

        maxEntry.ifPresent(entry -> System.out.println("City with largest population: " + entry.getKey() + " with " + entry.getValue() + " inhabitants"));

        // Найти среднее количество жителей по всем городам
        double averagePopulation = cityPopulation.values()
                .stream()
                .mapToInt(Integer::intValue)
                .average()
                .orElse(0.0);

        System.out.println("Average population: " + averagePopulation);

        // Найти все города с одинаковым количеством жителей
        Map<Integer, List<String>> populationGroups = new HashMap<>();
        for (Map.Entry<String, Integer> entry : cityPopulation.entrySet()) {
            populationGroups
                    .computeIfAbsent(entry.getValue(), k -> new ArrayList<>())
                    .add(entry.getKey());
        }

        System.out.println("Cities with same population:");
        for (Map.Entry<Integer, List<String>> entry : populationGroups.entrySet()) {
            if (entry.getValue().size() > 1) {
                System.out.println("Population: " + entry.getKey() + " Cities: " + entry.getValue());
            }
        }
    }
}
