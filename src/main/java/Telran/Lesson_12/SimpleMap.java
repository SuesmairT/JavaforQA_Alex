package Telran.Lesson_12;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class SimpleMap {
    public static void main(String[] args) {
        Map<Integer,String> map1 = new TreeMap<>();
        System.out.println(map1.put(2,"Наша 2"));//добавление возвращает null
        System.out.println(map1.put(1,"Наша 1"));
        System.out.println(map1);
        System.out.println(map1.put(1,"Наша новая 1"));//изменение данных, возвращает предыдущее значение
        System.out.println(map1);
        //null
        System.out.println(map1.put(5,"null"));
        System.out.println(map1.put(5,"Наша 5"));
        System.out.println(map1);
        //map1.put(null,"Наш null"); ключ не может быть нуль
        System.out.println(map1.put(3,"null"));
        System.out.println(map1.put(3,"Наша 3"));
        System.out.println(map1);

        Map<Integer,String> map2=new TreeMap<>(Comparator.reverseOrder());
        System.out.println(map2.put(2,"Наша 2"));//добавление возвращает null
        System.out.println(map2.put(1,"Наша 1"));
        System.out.println(map2.put(5,"Наша 5"));
        map2.put(3,"Наша 3");
        System.out.println(map2);

        for (Map.Entry<Integer,String> el:map2.entrySet()){
            System.out.println(el.getKey()+" = " +el.getValue());
        }
        for (Integer key:map2.keySet()){
            System.out.println(key);
        }

        for (String val:map2.values()){
            System.out.println(val);
        }
        //поиск
        System.out.println("Поиск");
        System.out.println(map2.get(1));
        System.out.println(map2.get(4));
        System.out.println(map2.containsKey(1));
        System.out.println(map2.containsKey(4));
        System.out.println(map2.containsValue(1));
        System.out.println(map2.containsValue(4));

        //удаление объектов
        System.out.println("Удаление");
        System.out.println(map2.remove(1));
        System.out.println(map2.remove(4));
        System.out.println(map2);

        System.out.println(map2.remove(3,"Другое value"));
        System.out.println(map2);

        System.out.println(map2.remove(3,"Наша 3"));
        System.out.println(map2);

        System.out.println("Sise=" +map2.size()+" ,isEmpty()="+map2.isEmpty());

    //HashMap - порядок хранения объектов не гарантируется

        Map<Integer,String> map3 = new HashMap<>();
        System.out.println(map3.put(2,"Наша 2"));
        System.out.println(map3.put(1,"Наша 1"));
        map3.put(3,"Наша 3");
        System.out.println("HashMap= "+map3);
        map3.put(17,"Наша 17");
        System.out.println("HashMap= "+map3);

    }
}
