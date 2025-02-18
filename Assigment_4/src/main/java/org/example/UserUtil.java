package org.example;

import java.time.LocalDate;
import java.util.Random;
import java.util.regex.Pattern;

public class UserUtil {
    private static final String EMAIL_REGEX = "^[a-z]+\\.[a-z]+@[a-z]+\\.[a-z]+$";

    public static int generateUserId() {
        int year = LocalDate.now().getYear() % 100;
        int randomDigits = new Random().nextInt(900000) + 100000;
        return Integer.parseInt(year + "" + randomDigits);
    }

    public static String generatePassword() {
        String upper = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String lower = "abcdefghijklmnopqrstuvwxyz";
        String digits = "0123456789";
        String special = "!@#$%^&*()-_+=<>?";
        String allChars = upper + lower + digits + special;

        Random random = new Random();
        StringBuilder password = new StringBuilder();

        password.append(upper.charAt(random.nextInt(upper.length())));
        password.append(lower.charAt(random.nextInt(lower.length())));
        password.append(digits.charAt(random.nextInt(digits.length())));
        password.append(special.charAt(random.nextInt(special.length())));

        for (int i = 4; i < 8; i++) {
            password.append(allChars.charAt(random.nextInt(allChars.length())));
        }

        return password.toString();
    }

    public static boolean isStrongPassword(String password) {
        return password.length() >= 8 &&
                password.matches(".*[A-Z].*") &&
                password.matches(".*[a-z].*") &&
                password.matches(".*\\d.*") &&
                password.matches(".*[!@#$%^&*()-_+=<>?].*");
    }

    public static String generateEmail(String name, String surname, String domain) {
        return name.toLowerCase() + "." + surname.toLowerCase() + "@" + domain;
    }

    public static boolean validateEmail(String email) {
        return Pattern.matches(EMAIL_REGEX, email);
    }
}
