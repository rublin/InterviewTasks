package com.mobilunity;

/**
 * We need a user registration which ensures that usernames respect certain rules.
 The rules for selecting a username are:
 1. The minimum length of the username must be 4 characters, the maximum should be 32.
 2. It should contain at least one letter from A-Z
 3. It should contain at least one digit from 0-9
 4. It should contain at least one special character from amongst @#_-
 5. It should not contain any spaces
 */
public class Rules {
    public static boolean checkLength(String name) {
        return true;
    }

    public static boolean checkLetter(String name) {
        return true;
    }

    public static boolean checkDigit(String name) {
        return true;
    }

    public static boolean checkSpecChar(String name) {
        return true;
    }

    public static boolean checkSpace(String name) {
        return true;
    }
}
