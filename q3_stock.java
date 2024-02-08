import java.util.Scanner;

public class q3_stock {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input total number of days
        int N = 0 ;
        // Input stock price array
        System.out.println("Days: ");
        N = sc.nextInt();
        int[] arr = new int[N];

        for(int i=0;i<N;i++){
            arr[i] = sc.nextInt();
        }

        int smallest = arr[0];
        for(int i=1;i<N;i++){
            if(arr[i]<smallest){
                smallest = arr[i];
            }
        }
        System.out.println("Max profit when bought at " + smallest);
    }
}
