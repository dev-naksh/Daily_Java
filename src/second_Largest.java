import java.util.Scanner;

public class second_Largest {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter elements: ");
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        int max=0;
        int smax=0;
        for(int i=0;i<n;i++){
            if(a[i]>max){
                max=a[i];
            }
        }
        for(int i=0;i<n;i++){
            if(smax<a[i] && max!=a[i]){
                smax = a[i];
            }
        }
        System.out.println(smax);
        sc.close();
    }
}
