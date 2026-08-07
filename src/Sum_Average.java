import java.util.Scanner;
public class Sum_Average {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of an array: ");
        int n = sc.nextInt();
        int[] a = new int[n];
        System.out.println("enter elements of an array");
        for(int i=0; i<n; i++){
            a[i]=sc.nextInt();
        }

        System.out.println("sum and average respectivly: ");
        int sum =0;
        for(int i =0; i<n; i++){
            sum= sum + a[i];

        }
        float avg = sum/n;
        System.out.println(sum);
        System.out.println(avg);
    }
}
