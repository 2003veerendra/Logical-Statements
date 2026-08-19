package array5;

import java.util.Arrays;

public class arrayprg5 {

    public static void main(String[] args) {

        int[] a1 = {3, 4, 5, 8, 7, 9};
        int[] a2 = {6, 7, 8, 9, 10, 11};

        int[] a3 = new int[a1.length];
        int[] a4 = new int[a2.length];

        for (int i = 0; i < a1.length; i++) {

            a3[i] = a1[i] + a2[i];
            a4[i] = a1[i] * a2[i];

        }

        System.out.println(Arrays.toString(a3));
        System.out.println(Arrays.toString(a4));
    }
}