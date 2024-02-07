import java.util.Scanner;

public class q2_steps {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int m ; // number of stairs;
        int n; // number of stairs covered in each steps;
        System.out.println("Enter the number of stairs: ");
        m = sc.nextInt();
        System.out.println("Enter the number of steps: ");
        n = sc.nextInt();

        int total_steps = 0;

        if(n>m)
            total_steps = 1;
        else
        {
            int res = m%n;
            total_steps = (m/n) + (res>0 ? 1:0);
        }
        System.out.println("Total Steps: " + total_steps);
    }
}
