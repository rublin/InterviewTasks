package com.mobilunity;

import com.mobilunity.rule.RuleChecker;
import com.mobilunity.rule.RuleCheckerImpl;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {

    private final static RuleChecker RULE_CHECKER = new RuleCheckerImpl();

    public static void main(String[] args) {
        List<String> lines = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.println("Type username each in separate line:");
            for (int i = 0; i < 4; i++) {
                lines.add(reader.readLine());
            }
            lines.forEach(line -> System.out.println(RULE_CHECKER.checkRules(line)));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
