package com.mobilunity.rule;

/**
 * It should contain at least one digit from 0-9
 */
public class DigitRule implements Rule {

    private static final String ANY_DIGIT = ".*\\d+.*";

    @Override
    public boolean check(String name) {
        return name.matches(ANY_DIGIT);
    }
}
