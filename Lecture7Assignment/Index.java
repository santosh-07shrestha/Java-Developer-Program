package Lecture7Assignment;

import java.util.Scanner;

public class Index {
    public static void main(String[] args) {
        MaxValueArray maxNum = new MaxValueArray();
        Even e = new Even();
        System.out.println("1.Sum of Array\n2.Largest  Number\n3.Smallest Number\n4.Even Number\n5.Prime Number");
        Scanner scan = new Scanner(System.in);
        int choice = scan.nextInt();
        switch (choice) {
        case 1:
            SumOfRows sor = new SumOfRows();
            sor.sumOfRows();
            break;
        case 2:
            maxNum.maxNum();
            break;
        case 3:
            maxNum.minNum();
            break;
        case 4:
            e.evenNum();
            break;
        case 5:
            e.primeNum();
            break;
        default:
            break;
        }
    }
}