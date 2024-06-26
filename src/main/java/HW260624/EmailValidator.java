package HW260624;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailValidator {
    // Регулярное выражение для проверки email
    private static final String EMAIL_REGEX = "^[\\w._%+-]+@[\\w.-]+\\.[a-zA-Z]{2,6}$";

    public static void main(String[] args) {
        String email = "my_25@domen-38.de";
        System.out.println("Is the email valid? " + isValidEmail(email));
    }

    public static boolean isValidEmail(String email) {
        Pattern pattern = Pattern.compile(EMAIL_REGEX);
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
    }
}
