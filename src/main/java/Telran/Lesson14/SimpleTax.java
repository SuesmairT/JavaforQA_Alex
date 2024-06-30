package Telran.Lesson14;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class SimpleTax {
    public static void main(String[] args) {
        List<Integer> list = List.of(500, 1000, 1500, 400, 350, 1200, 1500);
        // Налоги с сумм более 1000 євро
        List<Integer> taxSum  = new ArrayList<>();

        // filter
        for (Integer el : list) {
            if(el >= 1000) {
                taxSum.add(el);
            }
        }

        List<Double> taxes  = new ArrayList<>();
        // преобразование
        for (int i = 0; i < taxSum.size(); i++) {
            taxes.add(taxSum.get(i) * 0.4);
        }

        // суммирование
        double allSumTax = 0;
        for (Double tax : taxes) {
            allSumTax+=tax;
        }
        System.out.println("Нам нужно заплатить налогов = "+allSumTax);

        list.stream()
                .filter(el -> el>=1000)
                .mapToDouble(el -> el*0.4)
                .sum();
        System.out.println("Нам нужно заплатить налогов(stream) = "+allSumTax);

        //===================================================
        String str = "Мама мыла раму!";
        // строки как stream!!!
        System.out.println(" В строке буква 'а' встречается - "+
                str.chars()
                        .mapToObj(i -> (char) i)
                        .filter(s -> s == 'а')
                        .count()
        );


    }
}
