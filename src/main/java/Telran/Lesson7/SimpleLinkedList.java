package Telran.Lesson7;

import java.util.LinkedList;
import java.util.List;

public class SimpleLinkedList {
    public static void main(String[] args) {
        List<Integer> list=new LinkedList<>();
        //добавление в хвост(конец)
        list.add(5);
        list.add(8);
        list.add(2);
        list.add(9);
        list.add(6);


        System.out.println(list);
        //вставить элемент
        list.add(2,10);

        System.out.println(list);

        //вставка в начало
        list.addFirst(11);//равнозначный с 21
        list.add(0,13);
        System.out.println(list);

        //Удаление элементов+++++++++++________
        //удаляем с головы

        System.out.println(list.remove(0));//удаление по индексу
        System.out.println(list);

        System.out.println(list.removeFirst());//альтернативный метод
        System.out.println(list);

        //удаляем  с хвоста
        System.out.println(list.removeLast());//альтернативный метод
        System.out.println(list);

        System.out.println(list.remove(list.size()-1));//удаление по индексу
        System.out.println(list);

        //удаление из середины
        System.out.println(list.remove(2));//удаление по индексу
        System.out.println(list);

        //универсальный удалитель
        //удаление по значению
        list.remove(Integer.valueOf(8));//только для чисел, т.к. компилятор путается
        //list.remove("Hallo");//для строк
        System.out.println(list);

        //извлечение информации
        System.out.println(list.get(1));
        System.out.println(list.getFirst());//с 21 версии джава
        System.out.println(list.getLast());

        //Изменение информации
        System.out.println("Старое число="+list.set(1,33));
        System.out.println(list);


        //Доп метод. поиск инфо
        System.out.println(list.contains(5));
        System.out.println(list.contains(10));
        if (list.contains(5)) {
            System.out.println("Число найдено");
        }
        else {
            System.out.println("Число не найдено");
        }

            //Очистка
        list.clear();
        System.out.println(list);

    }
}
