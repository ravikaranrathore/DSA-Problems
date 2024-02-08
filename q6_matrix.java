import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class q6_matrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = 0;
        System.out.print("Enter the size of the array: ");
        n = sc.nextInt();

        int[] arr = new int[n];
        int i;
        for(i=0;i<n;i++){
            System.out.println("Enter the element at " + i + "index");
            arr[i] = sc.nextInt();
        }

        ArrayList<Integer> v = new ArrayList<Integer>();
        ArrayList<Integer> v1 = new ArrayList<Integer>();
        for (i=0;i<n;i++){
            if(i%2==0){
                v.add(arr[i]);
            }
            else{
                v1.add(arr[i]);
            }
        }
        Collections.sort(v);
        Collections.sort(v1);

        System.out.println("Sorted even array is " + v);
        System.out.println("Sorted odd array is " + v1);

        int s1 = v.get(v.size() - 2);
        int s2 = v1.get(v1.size() - 2);

        System.out.println("The sum of the second largest numbers from both matrices is: "+ (s1+s2) );
    }
}
