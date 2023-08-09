package org.example;

import java.util.Arrays;
import java.util.Random;
//Создайте массив из 5 случайных целых чисел из интервала [10;99]
//Выведите его на консоль в строку.
//Определите и выведите на экран сообщение о том, является ли массив строго возрастающей последовательностью.
public class FiveNumbers {
    public static void main(String[] args) {
        int[] array = generateRandomArray(5, 10, 99);

        System.out.println("Сгенерированный массив: " + Arrays.toString(array));

        boolean isStrictlyIncreasing = checkStrictlyIncreasing(array);

        if (isStrictlyIncreasing) {
            System.out.println("Массив является строго возрастающей последовательностью.");
        } else {
            System.out.println("Массив не является строго возрастающей последовательностью.");
        }
    }

    public static int[] generateRandomArray(int length, int min, int max) {
        int[] array = new int[length];
        Random random = new Random();

        for (int i = 0; i < length; i++) {
            array[i] = random.nextInt(max - min + 1) + min;
        }

        return array;
    }

    public static boolean checkStrictlyIncreasing(int[] array) {
        for (int i = 1; i < array.length; i++) {
            if (array[i] <= array[i - 1]) {
                return false;
            }
        }
        return true;
    }
}


