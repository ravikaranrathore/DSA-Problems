import java.util.Scanner;

public class q5_exam {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] oxygen = new int[3][3];     // 3 trainee * 3 rounds
        int i, j;
        int[] avg = new int[3];

        for (i = 0; i < 3; i++) {
            int temp = 0;
            for (j = 0; j < 3; j++) {
                oxygen[i][j] = sc.nextInt();
                if (oxygen[i][j] > 100 ||oxygen[i][j] < 1) {
                    System.out.println("Oxygen level should be in range 1 to 100. RUN AGAIN !!!!");
                    System.exit(404);
                }
                temp += oxygen[i][j];
            }
            temp /= 3;
            avg[i] = temp;
        }

        int max = avg[0];
        for(i=0;i<3;i++)
        {
            if(max<avg[i])
                max = avg[i];
        }


        if(max < 70)
            System.out.println("All trainees are unfit.");
        else {
            System.out.println("Most fit trainee:");
            for (i = 0; i < 3; i++) {
                if (max == avg[i])
                    System.out.println("Trainee no. " + (i+1) + " with average oxygen level " + max);
            }
        }

    }
}
