//package Telran.Lesson9_260424;
//
//import java.util.*;
//
//public class SimpleCat {
//    public static void main(String[] args) {
//        Cat cat1 = new Cat("Tom", 10);
//        Cat cat2 = new Cat("Vasya", 6);
//        Cat cat3 = new Cat("Murka", 10);
//        Cat cat4 = new Cat("Barsik", 4);
//        Cat cat5 = new Cat("Pushok", 8);
//        Cat cat6 = new Cat("Slon", 10);
//
//        List<Cat> unMutableCats1 = List.of(cat1, cat2, cat3, cat4, cat5, cat6);
//        System.out.println(unMutableCats1);
//        List<Cat> unMutableCats2 = Arrays.asList(cat1, cat2, cat3, cat4, cat5, cat6);
//        System.out.println(unMutableCats2);
//
//        // нельзя выполнить
//        // unMutableCats1.add(new Cat("Noname", 18));
//        // unMutableCats2.add(new Cat("Noname", 18));
//
//        List<Cat> mutableCats = new ArrayList<>();
//        mutableCats.add(cat1);
//        mutableCats.add(cat2);
//        mutableCats.add(cat3);
//        mutableCats.add(cat4);
//        mutableCats.add(cat5);
//        mutableCats.add(cat6);
//        System.out.println(mutableCats);
//
//        Collections.sort(mutableCats);
//        System.out.println(mutableCats);
//
//        // здесь можете потерять данные, т.к.
//        Set<Cat> setCats = new TreeSet<>();
//        setCats.addAll(unMutableCats1);
//        System.out.println(setCats);
//
//        Collections.sort(mutableCats, new CatNameCompare());
//        System.out.println(mutableCats);
//
//        Comparator<Cat> compareCatsAgeWeight = new Comparator<Cat>() {
//            @Override
//            public int compare(Cat o1, Cat o2) {
//                if(o1.getAge() == o2.getAge()) {
////                    return o1.getWeight() - o2.getWeight();
//                }
//                else {
//                    return o1.getAge() - o2.getAge();
//                }
//            }
//        };
//            };
//
//        }
//        Collections.sort(mutableCats, compareCatsAgeWeight);
//        System.out.println(mutableCats);
//
//        // здесь можете потерять данные, т.к. сравнение идет по compareTo
////        Set<Cat> setCats = new TreeSet<>();
//        setCats.addAll(unMutableCats1);
//        System.out.println(setCats); // по умолчанию, все коты одного веса считаются одинаковыми
//
//        Set<Cat> setCats1 = new TreeSet<>(compareCatsAgeWeight);
//        setCats1.addAll(unMutableCats1);
//        System.out.println(setCats1); // критерии сравнения другие, поэтому данные не теряются.
//    }

//}
