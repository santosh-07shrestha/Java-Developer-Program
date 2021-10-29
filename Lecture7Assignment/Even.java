package Lecture7Assignment;

public class Even {
    public void evenNum() {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8 };
        for (int i = 0; i < arr.length; i++) {
            if ((arr[i] % 2) == 0) {
                System.out.println(arr[i] + " is Even");
            }
        }
    }

    public void primeNum() {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8 };
        System.out.print("The prime number are: ");
        for (int i = 0; i < arr.length; i++) {
            boolean isPrime = true;
            if (arr[i] == 1)
                isPrime = false;
            else {
                // check to see if the numbers are prime
                for (int j = 2; j <= arr[i] / 2; j++) {
                    if (arr[i] % j == 0) {
                        isPrime = false;
                        break;
                    }
                }
            }
            // print the number
            if (isPrime) {
                if (arr[i] == 0) {
                } else {
                    System.out.print(arr[i] + " ");
                }
            }
        }
    }
}
