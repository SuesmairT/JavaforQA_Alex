package Telran.HW280524;

import java.util.function.Predicate;

public class PredicateFunctInt {//- Создать лямбда выражение, которое возвращает значение true,
    //   если строка не null, используя функциональный интерфейс Predicate.

    public static void main(String[] args) {
        Predicate<String> predicate1 = new Predicate<String>() {

            @Override
            public boolean test(String s) {
                return s != null;
            }
        };
        System.out.println(predicate1.test(null));
        System.out.println(predicate1.test(""));
        System.out.println(predicate1.test("there is something"));

        Predicate<String> predicate2 = s -> s != null;
        System.out.println(predicate2.test("Hello")); //lambda

        // - Создать лямбда выражение, которое проверяет, что строка не пуста,
        //   используя функциональный интерфейс Predicate.

        Predicate<String> predicate3 = s -> !s.isEmpty();
        System.out.println(predicate3.test("Hello"));
        System.out.println(predicate3.test(""));

        //  - Написать программу проверяющую, что строка не null и не пуста,
        //    используя функциональный интерфейс Predicate.

        Predicate<String> predicate4 = s -> s != null && !s.isEmpty();
        System.out.println(predicate4.test("not empty and not null"));

        // Написать программу, которая проверяет, что строка начинается буквой “J”или “N”
        //    и заканчивается “A”. Используем функциональный интерфейс Predicate.

        Predicate<String> predicate5 = s ->s.startsWith("J");
        Predicate<String> predicate6 = s ->s.startsWith("N");
        Predicate<String> predicate7 = s ->s.endsWith("A");

        Predicate<String> predicate8 = predicate5.or(predicate6).and(predicate7);

        System.out.println(predicate8.test("JAFFA"));
        System.out.println(predicate8.test("NINJA"));
        System.out.println(predicate8.test("HELLO"));


    }


}
