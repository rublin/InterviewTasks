package arrays;

import java.sql.Time;
import java.util.*;

/**
 * Created by Ruslan Sheremet (rublin) on 06.10.2016.
 */
public class Duplicates {

    /**
     * Returns <tt>true</tt> if array contains duplicates element.
     * @param array with Integers
     * @return <tt>true</tt> if array contains duplicates element
     */
    public static boolean isArrayHasDuplicatesBySet(Integer[] array) {
        Set<Integer> withoutDuplicates = new HashSet<>(Arrays.asList(array));
        return array.length - withoutDuplicates.size() != 0;
    }

    public static boolean isArrayHasDuplicatesByStream(Integer[] array) {
        long uniqueCount = Arrays.asList(array).stream()
                .distinct()
                .count();
        return array.length - uniqueCount != 0;
    }

    public static boolean isArrayHasDuplicatesBySort(Integer[] array) {
        Arrays.sort(array);
//        System.out.println(Arrays.toString(array));
        for (int i = 1; i < array.length; i++) {
            if (array[i].equals(array[i -1])) {
                return true;
            }
        }
        return false;
    }

    private static Integer[] getRandomArray(int length) {
        Integer[] randomArray = new Integer[length];
        Random random = new Random();
        for (int i = 0; i < length; i++) {
            randomArray[i] = random.nextInt();
        }
        return randomArray;
    }
    public static void main(String[] args) {
        Integer[] arrayWithDuplicates = {1, 32, 2, 43, 23895, 21, 2, 3};
        Integer[] arrayWithoutDuplicates = {1, 32, 2, 43, 23895, 21, 3};
        System.out.println("By HashSet method:");
        System.out.println(isArrayHasDuplicatesBySet(arrayWithDuplicates));
        System.out.println(isArrayHasDuplicatesBySet(arrayWithoutDuplicates));
        System.out.println("By sort method:");
        System.out.println(isArrayHasDuplicatesBySort(arrayWithDuplicates));
        System.out.println(isArrayHasDuplicatesBySort(arrayWithoutDuplicates));
        System.out.println("By stream method:");
        System.out.println(isArrayHasDuplicatesByStream(arrayWithDuplicates));
        System.out.println(isArrayHasDuplicatesByStream(arrayWithoutDuplicates));

        System.out.println("Generate random array...");
        Integer[] randomArray = getRandomArray(1000000);

        System.out.println("#################################################");
        long start = System.currentTimeMillis();
        System.out.println("By HashSet result is: " + isArrayHasDuplicatesBySet(randomArray) + "; time is: " + (System.currentTimeMillis() - start));

        start = System.currentTimeMillis();
        System.out.println("By Sort result is: " + isArrayHasDuplicatesBySort(randomArray) + "; time is: " + (System.currentTimeMillis() - start));
        start = System.currentTimeMillis();
        System.out.println("By Stream result is: " + isArrayHasDuplicatesByStream(randomArray) + "; time is: " + (System.currentTimeMillis() - start));
        System.out.println("#################################################");
    }
}
