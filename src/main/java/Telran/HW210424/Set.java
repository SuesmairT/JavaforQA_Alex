package Telran.HW210424;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Set {
    public static void main(String[] args) {
        int elementsCount = 1000000;
// Создание TreeSet
TreeSet<Integer> treeSet = new TreeSet<>();
long startTime =System.nanoTime();
for (int i=0; i<elementsCount;i++) {
    treeSet.add(i);
}
long addTreeSetTime = System.nanoTime() - startTime;
        startTime = System.nanoTime();
        for (int i = 0; i < elementsCount; i++) {
            treeSet.remove(i);
        }
        long removeTreeSetTime = System.nanoTime() - startTime;

        startTime = System.nanoTime();
        for (int i = 0; i < elementsCount; i++) {
            treeSet.contains(i);
        }
        long containsTreeSetTime = System.nanoTime() - startTime;

        // Создание HashSet
        HashSet<Integer> hashSet = new HashSet<>();
        startTime = System.nanoTime();
        for (int i = 0; i < elementsCount; i++) {
            hashSet.add(i);
        }
        long addHashSetTime = System.nanoTime() - startTime;

        startTime = System.nanoTime();
        for (int i = 0; i < elementsCount; i++) {
            hashSet.remove(i);
        }
        long removeHashSetTime = System.nanoTime() - startTime;

        startTime = System.nanoTime();
        for (int i = 0; i < elementsCount; i++) {
            hashSet.contains(i);
        }
        long containsHashSetTime = System.nanoTime() - startTime;

        // Создание LinkedHashSet
        LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<>();
        startTime = System.nanoTime();
        for (int i = 0; i < elementsCount; i++) {
            linkedHashSet.add(i);
        }
        long addLinkedHashSetTime = System.nanoTime() - startTime;

        startTime = System.nanoTime();
        for (int i = 0; i < elementsCount; i++) {
            linkedHashSet.remove(i);
        }
        long removeLinkedHashSetTime = System.nanoTime() - startTime;

        startTime = System.nanoTime();
        for (int i = 0; i < elementsCount; i++) {
            linkedHashSet.contains(i);
        }
        long containsLinkedHashSetTime = System.nanoTime() - startTime;

        // Вывод результатов
        System.out.println("Add time:");
        System.out.println("TreeSet: " + addTreeSetTime);
        System.out.println("HashSet: " + addHashSetTime);
        System.out.println("LinkedHashSet: " + addLinkedHashSetTime);

        System.out.println("\nRemove time:");
        System.out.println("TreeSet: " + removeTreeSetTime);
        System.out.println("HashSet: " + removeHashSetTime);
        System.out.println("LinkedHashSet: " + removeLinkedHashSetTime);

        System.out.println("\nContains time:");
        System.out.println("TreeSet: " + containsTreeSetTime);
        System.out.println("HashSet: " + containsHashSetTime);
        System.out.println("LinkedHashSet: " + containsLinkedHashSetTime);

    }
}
