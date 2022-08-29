package africa.semicolon;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class emailregex {
    public static void main(String[] args) {
        String email = "Hello@gmail.com";
        System.out.println(email.getBytes());
        // make sure that the email can be hashed using Dictionary

    }
    public static final Pattern VALID_EMAIL_ADDRESS_REGEX =
            Pattern.compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$", Pattern.CASE_INSENSITIVE);

    public static boolean validate(String emailStr) {
        Matcher matcher = VALID_EMAIL_ADDRESS_REGEX.matcher(emailStr);
        return matcher.find();

    }
}