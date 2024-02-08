import java.util.Arrays;
import java.util.Scanner;

public class q10_pelindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        // replace all is used to ignore spaces and symbols and to lower to change full to lowercase
        s = s.toLowerCase().replaceAll("\\W", "");

        char[] ch = s.toCharArray();
        int size = ch.length;
        char[] ch2 = new char[size];
        // reverse array
        for (int i = ch.length-1, j=0; i >= 0 ; i--,j++)
            ch2[j] = ch[i];
        // check if both arrays equal
        if(Arrays.equals(ch2,ch))
            System.out.println("YES");
        else
            System.out.println("NO");

        }
}
