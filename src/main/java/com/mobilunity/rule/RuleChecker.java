package com.mobilunity.rule;

import java.util.ArrayList;
import java.util.List;

public class RuleChecker {
    private List<Rule> rules;

    public RuleChecker() {
        rules = new ArrayList<>();
        rules.add(new LengthRule());
        rules.add(new LetterRule());
        rules.add(new DigitRule());
        rules.add(new SpecialCharacterRule());
        rules.add(new SpaceRule());
    }

    public Resolution checkRules(String name) {
        for (Rule rule : rules) {
            boolean check = rule.check(name);
            if (!check) {
                return Resolution.FAIL;
            }
        }

        return Resolution.PASS;
    }
}
