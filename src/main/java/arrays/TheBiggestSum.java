package arrays;

/**
 * Created by Sheremet on 01.08.2016.
 */
public class TheBiggestSum {

    /*
    *  На входе массив чисел, например: arr = [1, -2, 3, 4, -9, 6].
    *  Задача – найти непрерывный подмассив arr, сумма элементов которого максимальна.
    *  Ваша функция должна возвращать только эту сумму.
    * */
    public static int findTheBiggestSum(int[] array) {
        int sum = 0;
        int maxSum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
            if (sum > maxSum)
                maxSum = sum;
            if (sum < 0)
                sum = 0;
        }
        return maxSum;
    }

    public static void main(String[] args) {
        int[] array = {12, 13, -56, 32, -1, 52, -129};
        System.out.println(findTheBiggestSum(array)); //expected 83
    }
}
