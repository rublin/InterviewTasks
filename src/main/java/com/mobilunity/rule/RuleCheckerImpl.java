package com.mobilunity.rule;

import java.util.ArrayList;
import java.util.List;

public class RuleCheckerImpl implements RuleChecker {
    private List<Rule> rules;

    public RuleCheckerImpl() {
        rules = new ArrayList<>();
        rules.add(new LengthRule());
        rules.add(new LetterRule());
        rules.add(new DigitRule());
        rules.add(new SpecialCharacterRule());
        rules.add(new SpaceRule());
    }

    /**
     * Check {@link String} to all rules
     * @param name {@link String}
     * @return {@link Resolution#PASS} if all rules passed
     *          and {@link Resolution#FAIL} if any rule is not passed
     */
    @Override
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
