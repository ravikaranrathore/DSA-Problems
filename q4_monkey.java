import java.util.Scanner;

public class q4_monkey {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n; // number of monkeys
        int k,j; // every monkey can eat k banana and j peanut

        int m,p; // m banana and p peanut are offered by traveller to monkeys

        n = sc.nextInt();
        k = sc.nextInt();
        j = sc.nextInt();
        m = sc.nextInt();
        p = sc.nextInt();

        int c = m/k;            // m banana / k banana monkey can eat gives banana eating monkeys
        int d = p/j;            // p peanuts / j peanuts gives peanut eating monkey

        int sol = n - (c + d);
        System.out.println("Number of monkeys left on tree: " + sol);
    }
}
