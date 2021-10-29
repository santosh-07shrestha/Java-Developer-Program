package Lecture7Assignment;

public class SumOfRows {

    public void sumOfRows() {
        int[][] arr = { { 1, 2, 3 }, { 5, 6, 2 }, { 3, 6, 5 } };
        int[] sum = new int[3];
        System.out.println("Sum of the rows are: ");
        for (int i = 0; i < sum.length; i++) {
            for (int j = 0; j < sum.length; j++)
                sum[i] += arr[i][j];
            System.out.println(sum[i]);
        }

        // for (int i = 0; i < sum.length; i++) {
        // sum[i] = arr[i][0] + arr[i][1] + arr[i][2];
        // System.out.println(sum[i]);
        // }
    }

}
