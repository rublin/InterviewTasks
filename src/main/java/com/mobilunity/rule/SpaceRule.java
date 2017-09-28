package com.mobilunity.rule;

/**
 * It should not contain any spaces
 */
public class SpaceRule implements Rule {

    @Override
    public boolean check(String name) {
        return !name.contains(" ");
    }
}
