package com.mobilunity.rule;

/**
 * The minimum length of the username must be 4 characters,
 *          the maximum should be 32.
 */
public class LengthRule implements Rule {

    private static final int MIN_LENGTH = 4;
    private static final int MAX_LENGTH = 32;

    @Override
    public boolean check(String name) {
        return MIN_LENGTH <= name.length() &&
                name.length() <= MAX_LENGTH;
    }
}
