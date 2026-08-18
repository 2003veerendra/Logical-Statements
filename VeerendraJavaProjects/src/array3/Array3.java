package array3;

import java.util.Scanner;

public class Array3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] arr = {18, 7, 45, 1, 10, 33, 9, 8};

        System.out.println("Enter a number:");
        int search = sc.nextInt();

        boolean status = false;

        for (int a : arr) {
            if (a == search) {
                System.out.println("The element is found: " + a);
                status = true;
                break;
            }
        }

        if (!status) {
            System.out.println("The element is not found!!");
        }

        sc.close();
    }
}