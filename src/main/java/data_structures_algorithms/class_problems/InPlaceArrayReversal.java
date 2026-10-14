package data_structures_algorithms.class_problems;

import java.util.Arrays;

public class InPlaceArrayReversal {
    public static void main(String[] args) {
        int[] arr = {11, 22, 33, 44};
        reverseArray(arr);
        System.out.println(Arrays.toString(arr));
    }
    
    static void reverseArray(int[] arr) {
        int left = 0, right = arr.length - 1;
        while (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }
}
