import java.util.Scanner;
public class even_odd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of an array: ");
        int n = sc.nextInt();
        int[] a = new int[n];
        System.out.println("enter elements of an array");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int odd = 0;
        int even = 0;
        for (int i = 0; i < n; i++) {
            if (a[i] % 2 == 0) {
               ++even;
            }
            if (a[i] % 2 != 0) {
                ++odd;
            }
        }
        System.out.println("even : " + even);
        System.out.println("odd :" + odd);
        sc.close();
    }
}
