package Telran.HW180424;

import java.util.ArrayList;
import java.util.LinkedList;

public class Time {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        LinkedList<Integer> linkedList = new LinkedList<>();
        // Далее выполним операции и измерим время для каждого случая

        // Добавление в конец
        long startTime = System.nanoTime();
        for (int i = 0; i < 100000; i++) {
            arrayList.add(i);
        }
        long endTime = System.nanoTime();
        System.out.println("Время добавления в конец ArrayList: " + (endTime - startTime) + " нс");

        startTime = System.nanoTime();
        for (int i = 0; i < 100000; i++) {
            linkedList.addLast(i);
        }
        endTime = System.nanoTime();
        System.out.println("Время добавления в конец LinkedList: " + (endTime - startTime) + " нс");

        // Добавление в начало
        startTime = System.nanoTime();
        for (int i = 0; i < 100000; i++) {
            arrayList.add(0, i);
        }
        endTime = System.nanoTime();
        System.out.println("Время добавления в начало ArrayList: " + (endTime - startTime) + " нс");

        startTime = System.nanoTime();
        for (int i = 0; i < 100000; i++) {
            linkedList.addFirst(i);
        }
        endTime = System.nanoTime();
        System.out.println("Время добавления в начало LinkedList: " + (endTime - startTime) + " нс");


    }
}