import java.util.Scanner;

public class Practice_1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        System.out.println("enter array elements: ");
        for(int i =0;i<n;i++){
            a[i] = sc.nextInt();
        }
        System.out.println("enter element you want to search: ");
        int x = sc.nextInt();
        for(int i =0; i<n;i++){
            if(a[i] == x){
                System.out.println(i);
            }
        }
        sc.close();
    }
}