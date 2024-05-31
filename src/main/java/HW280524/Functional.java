package HW280524;

import java.util.function.Function;

public class Functional {
    public static void main(String[] args) {
        Function<Integer,String> function= i->{
            String result = "Zero";
            if (i>0){
                result = "Positive number";
            } else if (i <0){
                result = "Negative number";
            }
            return result;
        };
        System.out.println(function.apply(-67));
        System.out.println(function.apply(67));
        System.out.println(function.apply(0));
    }
}
