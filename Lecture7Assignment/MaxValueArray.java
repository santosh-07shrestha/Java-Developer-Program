package Lecture7Assignment;

public class MaxValueArray {
    public void maxNum() {
        int[] arr = { 11, 20, 300 };
        int maxNum = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > maxNum)
                maxNum = arr[i];
        }
        System.out.println(maxNum + " is the largest number in the array.");

    }

    public void minNum() {
        int[] arr = { 11, 20, 300 };
        int minNum = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < minNum)
                minNum = arr[i];
        }
        System.out.println(minNum + " is the smallest number in the array.");
    }
}
