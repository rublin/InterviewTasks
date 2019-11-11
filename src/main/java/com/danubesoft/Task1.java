package com.danubesoft;

import java.util.Arrays;

public class Task1 {

    public static void main(String[] args) {
//        1
//        System.out.println(factorial(4));

//        2
//        System.out.println(palindrome("Bobb"));

//        3
//        System.out.println(binarySearch(new int[]{1, 2, 3}, 5));

//        4
//        System.out.println(isRotation("abcd", "dbac"));
    }

    //
    public static int factorial(int number) {
        if (number < 1) {
            throw new RuntimeException("Wrong number");
        }
        if (number == 1) {
            return 1;
        }

        return factorial(number - 1) * number;
    }

    // O(n2)
    public static String[] removeDuplicates(String[] stringArray) {
        String[] result = null;
        for (int i = 0; i < stringArray.length - 1; i++) {
            if (stringArray[i] != null) {
                for (int j = i + 1; j < stringArray.length; j++) {
                    if (stringArray[j] != null && stringArray[i].equals(stringArray[j])) {
                        stringArray[j] = null;
                    }
                }
            }
        }
// need to think how to remove nulls
        return stringArray;
    }

    public static boolean palindrome(String string) {
        char[] revers = new char[string.length()];
        char[] stringArray = string.toCharArray();
        for (int i = 0; i < stringArray.length; i++) {
            revers[i] = stringArray[stringArray.length - i - 1];
        }

        return string.toLowerCase().equals(new String(revers).toLowerCase());
    }

    public static boolean binarySearch(int[] array, int number) {
        if (array.length == 1) {
            return array[0] == number;
        }

        int position;
        if (array.length % 2 == 0) {
            position = (array.length / 2) - 1;
        } else {
            position = array.length / 2;
        }
        int element = array[position];
        if (element > number) {
            return binarySearch(Arrays.copyOfRange(array, 0, position), number);
        } else if (element < number) {
           return binarySearch(Arrays.copyOfRange(array, position + 1, array.length), number);
        } else {
            return true;
        }
    }

    public static boolean isRotation(String string1, String string2) {
        if (string1.length() != string2.length()) {
            return false;
        }

        for (int i = 0; i < string1.length(); i++) {
            String concat = string1.substring(i, string1.length()).concat(string1.substring(0, i));
            if (concat.equals(string2)) {
                return true;
            }
        }

        return false;
    }


}
