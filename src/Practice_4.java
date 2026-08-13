import java.util.Scanner;

public class Practice_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        System.out.println("enter elements: ");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        System.out.println("enter element you want to find the last occurrence of!: ");
        int x  =sc.nextInt();
        for(int i =n-1; i>=0;i--){
            if(a[i]==x){
                System.out.println(i);
                break;
            }
        }
    }
}

