import java.util.Scanner;

public class q8_ladder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = {23,22,24,8,9,10};
        for(int i=0;i<arr.length;i++){
            int temp = 0;
            int a = arr.length - (i+1);     // for remaining items in array after selected item to check if remaining are smaller
            for(int j=i+1;j< arr.length;j++){
                if(arr[i] < arr[j])
                    break;
                else
                    temp++;
            }
            if(temp == a){
                System.out.println(arr[i]);
            }
        }

    }
}
