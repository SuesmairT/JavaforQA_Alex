import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class HW150524 {

            public static void main(String[] args) {
            List<Integer> list = new ArrayList<>();
            // Заполнение списка
            for (int i = 0; i < 10000000; i++) {
                list.add(i);
            }

            // Измерение времени выполнения для каждого подпункта
            long startTime, endTime;

            // a) С помощью for-each loop
            startTime = System.currentTimeMillis();
            for (int i : list) {
                int temp = i;
            }
            endTime = System.currentTimeMillis();
            System.out.println("for-each loop: " + (endTime - startTime) + " ms");

            // b) Классический for с выполнением условия i<list.size()
            startTime = System.currentTimeMillis();
            for (int i = 0; i < list.size(); i++) {
                int temp = list.get(i);
            }
            endTime = System.currentTimeMillis();
            System.out.println("Classical for with list.size(): " + (endTime - startTime) + " ms");

            // c) Классический for с расчетом размера заранее
            int size = list.size();
            startTime = System.currentTimeMillis();
            for (int i = 0; i < size; i++) {
                int temp = list.get(i);
            }
            endTime = System.currentTimeMillis();
            System.out.println("Classical for with pre-calculated size: " + (endTime - startTime) + " ms");

            // d) Классический for, проход с конца к началу
            startTime = System.currentTimeMillis();
            for (int i = list.size() - 1; i >= 0; i--) {
                int temp = list.get(i);
            }
            endTime = System.currentTimeMillis();
            System.out.println("Classical for, traversing from end to start: " + (endTime - startTime) + " ms");

            // e) Использование Iterator
            startTime = System.currentTimeMillis();
            Iterator<Integer> iterator = list.iterator();
            while (iterator.hasNext()) {
                int temp = iterator.next();
            }
            endTime = System.currentTimeMillis();
            System.out.println("Using Iterator: " + (endTime - startTime) + " ms");

            // f) Использование ListIterator с проходом от начала списка до конца
            startTime = System.currentTimeMillis();
            ListIterator<Integer> listIterator = list.listIterator();
            while (listIterator.hasNext()) {
                int temp = listIterator.next();
            }
            endTime = System.currentTimeMillis();
            System.out.println("Using ListIterator, traversing from start to end: " + (endTime - startTime) + " ms");

            // g) Использование ListIterator с проходом от конца списка к началу
            startTime = System.currentTimeMillis();
            ListIterator<Integer> reverseListIterator = list.listIterator(list.size());
            while (reverseListIterator.hasPrevious()) {
                int temp = reverseListIterator.previous();
            }
            endTime = System.currentTimeMillis();
            System.out.println("Using ListIterator, traversing from end to start: " + (endTime - startTime) + " ms");
        }

}
