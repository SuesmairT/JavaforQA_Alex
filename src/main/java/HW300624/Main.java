package HW300624;

public class Main {
    public static void main(String[] args) {
        Calculator<Integer> intCalc = new IntegerCalculator();
        System.out.println("Integer Add: " + intCalc.add(5, 3));  // Output: 8
        System.out.println("Integer Sub: " + intCalc.sub(5, 3));  // Output: 2
        System.out.println("Integer Multi: " + intCalc.multi(5, 3));  // Output: 15
        System.out.println("Integer Div: " + intCalc.div(5, 3));  // Output: 1

        Calculator<Double> doubleCalc = new DoubleCalculator();
        System.out.println("Double Add: " + doubleCalc.add(5.0, 3.0));  // Output: 8.0
        System.out.println("Double Sub: " + doubleCalc.sub(5.0, 3.0));  // Output: 2.0
        System.out.println("Double Multi: " + doubleCalc.multi(5.0, 3.0));  // Output: 15.0
        System.out.println("Double Div: " + doubleCalc.div(5.0, 3.0));  // Output: 1.6666666666666667
    }
}
