import java.util.Scanner;
public class Maximum_minimum {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter size of an array: ");
        int n =sc.nextInt();
        int[] a = new int[n];
        System.out.println("enter array elements: ");
        for(int i=0;i<n;i++){
            a[i] = sc.nextInt();
        }
        int max = a[0];
        int min = a[0];
        System.out.println("for Maximum and minimum element: ");
        for(int i=1 ; i<n ; i++){
            if(a[i]>max){
                max = a[i];
            }
            if(a[i]<min){
                min =a[i];
            }
        }
        System.out.println("max :" + max +"\nmin: " +min);
        sc.close();
    }
}
