package Telran.Lesson10_030524;

import java.util.*;

public class SimpleCollection {
    public static void main(String[] args) {
            ArrayList<Integer> arr = new ArrayList<>(List.of(1,2,3,8,5,6,3));
            arr.add(10);
            System.out.println(arr);
            for (int i = 0; i < arr.size(); i++) {
                if (arr.get(i)>=5) {//какое-то условие, здесь взяли показать более 5
                    System.out.println("arr["+i+"]="+arr.get(i));
                }
            }
            LinkedList<Integer> linkedList = new LinkedList<>(List.of(1,2,3,8,5,6,3));
            linkedList.add(10);
            System.out.println(linkedList);
            for (int i = 0; i < linkedList.size(); i++) {
                if(linkedList.get(i) >= 5) { //какое-то условие
                    System.out.println("linkedList["+i+"]="+linkedList.get(i));
                }
            }
        // Работаем с foreach
        for (Integer val : linkedList) {
            if(val >= 5) { //какое-то условие
                System.out.println("linkedList (foreach) = "+val);
            }
        }
            HashSet<Integer> hashSet = new HashSet<>(List.of(1,2,3,8,5,6,3));
            hashSet.add(10);
            System.out.println(hashSet);
            Iterator<Integer> iterator = hashSet.iterator();
            while (iterator.hasNext()) {
                Integer val = iterator.next();
                if (val>=5) {
                    System.out.println("hashSet ="+val);
                }
            }
        // Работаем с foreach
        for (Integer val : hashSet) {
            if(val >= 5) { //какое-то условие
                System.out.println("hashSet (foreach) = "+val);
            }

        }


        // Работаем с iterator
        iterator = linkedList.iterator();
        while (iterator.hasNext()) {
            Integer val = iterator.next();
            if(val >= 5) { //какое-то условие
                System.out.println("arr = "+val);
            }
        }

        // Работаем с foreach
        for (Integer val : arr) {
            if(val >= 5) { //какое-то условие
                System.out.println("arr (foreach) = "+val);
            }
        }

            }
        }





