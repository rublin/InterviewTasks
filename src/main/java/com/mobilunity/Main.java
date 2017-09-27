package com.mobilunity;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<String> lines = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))){
            System.out.println("Type username each in separate line:");
            for (int i = 0; i < 4; i++) {
                lines.add(reader.readLine());
            }
            lines.forEach(line -> System.out.printf("You entered: %s\n", line));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
