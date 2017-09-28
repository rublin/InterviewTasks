package com.mobilunity;

import com.mobilunity.rule.RuleChecker;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<String> lines = new ArrayList<>();
        RuleChecker ruleChecker = new RuleChecker();
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))){
            System.out.println("Type username each in separate line:");
            for (int i = 0; i < 4; i++) {
                lines.add(reader.readLine());
            }
            lines.forEach(line -> System.out.println(ruleChecker.checkRules(line)));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
