package Telran.HW280524;


public class Main {
    public static void main(String[] args) {
        Printable upperCasePrinter = (text) -> System.out.println(text.toUpperCase());
        Printable lowerCasePrinter = (text) -> System.out.println(text.toLowerCase());

        String text = "Hello, World!";
        upperCasePrinter.print(text);  // Печатает "HELLO, WORLD!"
        lowerCasePrinter.print(text);  // Печатает "hello, world!"
    }
}
