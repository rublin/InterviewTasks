package com.mobilunity.rule;

/**
 * It should contain at least one letter from A-Z
 */
public class LetterRule implements Rule {

    public static final String UPPERCASE_LETTER = ".*[A-Z].*";
    public static final String ANY_LETTER = ".*[a-zA-Z]+.*";

    @Override
    public boolean check(String name) {
        return name.matches(UPPERCASE_LETTER);
    }
}
