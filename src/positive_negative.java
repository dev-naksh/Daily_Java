import java.util.Scanner;
public class positive_negative {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of an array: ");
        int n = sc.nextInt();
        int[] a = new int[n];
        System.out.println("enter elements of an array");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        int positive=0,negative=0;
        int zero=0;
        for(int i =0;i<n;i++){
            if(a[i]>0){
                positive++;
            }
            if(a[i]<0){
                negative++;
            }if(a[i]==0){
                zero++;
            }
        }
        System.out.println("+: " + positive);
        System.out.println("-: " + negative);
        System.out.println("0: " + zero);
        sc.close();
    }

    }
