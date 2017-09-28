package com.mobilunity.rule;

/**
 * It should contain at least one special character from amongst @#_-
 */
public class SpecialCharacterRule implements Rule {

    @Override
    public boolean check(String name) {
        return name.contains("@") ||
                name.contains("#") ||
                name.contains("_") ||
                name.contains("-");
    }
}
