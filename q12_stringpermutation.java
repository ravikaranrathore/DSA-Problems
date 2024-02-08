import java.util.Arrays;
import java.util.Scanner;

public class q12_stringpermutation {
    // Function to calculate factorial of a number
    static int fact(int num){
        int res = 1;
        while(num > 0) {
            res *= num;
            num--;
        }
        return res;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int len = s.length();
        char[] ch = s.toCharArray();
        Arrays.sort(ch);
        // checking duplicate characters
        int numerator = 1;
        int denomenator = 1;

        int count = 0;
        char[] a = ch;
        for (int i=0; i<ch.length; i++) {
            for (int j=0; j<a.length; j++) {
                if (ch[i]==a[j]) {
                    count=count+1;
                }
            }
            i = i+count-1;      // to skip duplicates characters in sorted array
            denomenator *= fact(count);
            count=0;
        }

        numerator = fact(len);
        // permutation is factorial of length / fact of no of dupilates
        int per = numerator / denomenator;
        System.out.println(per);
    }
}
