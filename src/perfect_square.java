import java.util.Scanner;

public class perfect_square {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("enter array elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        for(int i =0;i<n;i++){
            double a = Math.sqrt(arr[i]);
            if( a*a == arr[i]){
                System.out.println(a);
            }
        }
        sc.close();
    }
}
