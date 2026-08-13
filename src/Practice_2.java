import java.util.Scanner;

public class Practice_2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        System.out.println("enter elements: ");
        for(int i =0;i<n;i++){
            a[i] = sc.nextInt();
        }
        System.out.println("enter element you want to count: ");
        int x = sc.nextInt();
        int count= 0;
        for(int i=0;i<n;i++){
            if(a[i]==x){
                count ++;
            }
        }
        System.out.println(count);
        sc.close();
    }
}
