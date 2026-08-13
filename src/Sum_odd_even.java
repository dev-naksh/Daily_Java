import java.util.Scanner;

public class Sum_odd_even {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("enter array elements: ");
        for(int i=0; i<n;i++){
            arr[i]=sc.nextInt();
        }
        int sumeven =0;
        int sumodd=0;
        for(int i =0; i<n;i++){
            if(arr[i]%2==0){
                sumeven = sumeven +arr[i];
            }
            if(arr[i]%2!=0){
                sumodd += arr[i];
            }
        }
        System.out.println(sumeven);
        System.out.println(sumodd);
        sc.close();
    }
}
