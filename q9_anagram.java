import java.util.Arrays;
import java.util.Scanner;

public class q9_anagram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next();
        String s2 = sc.next();

        char[] charr1 = s1.toCharArray();
        char[] charr2 = s2.toCharArray();

        Arrays.sort(charr1);
        Arrays.sort(charr2);

        if(Arrays.equals(charr1,charr2))
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}
