package Telran.HW210524;

import java.util.Comparator;
import java.util.Map;
import java.util.Optional;
import java.util.TreeMap;

public class Cat { String name;
    int age;
    double weight;
    String breed;

    public Cat(String name, int age, double weight, String breed) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.breed = breed;
    }

    @Override
    public String toString() {
        return "Cat{name='" + name + "', age=" + age + ", weight=" + weight + ", breed='" + breed + "'}";
    }
}

