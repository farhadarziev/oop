package org.example;

import org.junit.jupiter.api.Test;
import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class UserUtilTest {

    @Test
    void testGenerateUserId() {
        int userId = UserUtil.generateUserId();
        String userIdStr = String.valueOf(userId);
        assertEquals(8, userIdStr.length(), "User ID should contain 8 digits");
        assertTrue(userIdStr.startsWith(String.valueOf(LocalDate.now().getYear() % 100)), "User ID should start with the last 2 digits of the year");
    }

    @Test
    void testGeneratePassword() {
        String password = UserUtil.generatePassword();
        assertTrue(password.length() >= 8, "Password should be at least 8 characters long");
        assertTrue(password.matches(".*[A-Z].*"), "Password should contain at least one uppercase letter");
        assertTrue(password.matches(".*[a-z].*"), "Password should contain at least one lowercase letter");
        assertTrue(password.matches(".*\\d.*"), "Password should contain at least one digit");
        assertTrue(password.matches(".*[!@#$%^&*()-_+=<>?].*"), "Password should contain at least one special character");
    }

    @Test
    void testIsStrongPassword() {
        assertTrue(UserUtil.isStrongPassword("Aa1!5678"), "The password should be strong");
        assertFalse(UserUtil.isStrongPassword("weakpass"), "The password is too weak (no digits, uppercase letters, or special characters)");
        assertFalse(UserUtil.isStrongPassword("WEAKPASS1!"), "The password is missing lowercase letters");
        assertFalse(UserUtil.isStrongPassword("weakpass1!"), "The password is missing uppercase letters");
        assertFalse(UserUtil.isStrongPassword("WeakPass!"), "The password is missing digits");
    }

    @Test
    void testGenerateEmail() {
        String email = UserUtil.generateEmail("Farhad", "Arziev", "example.com");
        assertEquals("farhad.arziev@example.com", email, "The email should be formatted correctly");
    }

    @Test
    void testValidateEmail() {
        assertTrue(UserUtil.validateEmail("test.user@example.com"), "A valid email should pass validation");
        assertFalse(UserUtil.validateEmail("invalid-email"), "An invalid email should not pass validation");
        assertFalse(UserUtil.validateEmail("user@com"), "An email without a domain part should be invalid");
        assertFalse(UserUtil.validateEmail("user@@example.com"), "An email with two @ symbols should be invalid");
    }
}
