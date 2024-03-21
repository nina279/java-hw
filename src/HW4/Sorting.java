package HW4;

import java.util.Arrays;

public class Sorting {
    public static void main(String[] args) {
        int[] array = {8, 1, 2, 5, 7, 12, 3}; //ствопили масив, задали йому імʼя

        System.out.println("base: " + Arrays.toString(array));

        /* використовуємо Arrays.copyOf() для створення копії відсортованого array та
         метод sort з імпортованого класу Arrays, який впорядковує елементи масиву у порядку зростання
         */
        int[] ascArray = Arrays.copyOf(array, array.length);
        Arrays.sort(ascArray);
        System.out.println("asc: " + Arrays.toString(ascArray));

        // беремо відсортований ascArray та відсортовуємо його у зворотньому порядку
        int[] descArray = Arrays.copyOf(ascArray, ascArray.length);
        for (int i = 0; i < descArray.length / 2; i++) {
            int temp = descArray[i];
            descArray[i] = descArray[descArray.length - 1 - i];
            descArray[descArray.length - 1 - i] = temp;
        }
        System.out.println("desc: " + Arrays.toString(descArray));

        int[] innerArray = new int[array.length];
        int left = 0;
        int right = array.length - 1;
        for (int i = 0; i < array.length; i++) {
            if (i % 2 == 0) {
                innerArray[i] = array[right];
                right--;
            } else {
                innerArray[i] = array[left];
                left++;
            }
        }
        System.out.println("inner: " + Arrays.toString(innerArray));
    }
}
