import java.util.Scanner;

public class q11_carry {
    static int NumberOfCarries(int num1,int num2){
        int noc = 0;    // number of carries
        int temp = 0;   // carry number which is added in next digit

        while(num1 > 0 || num2>0){
            int res =  num1%10 + num2% 10 + temp; // digit from num1, num2 and carry from last.
            if(res/10 >= 1) {
                temp = res/10;
                noc++;
            }
            num1 = num1/10;
            num2 = num2/10;
        }
        return noc;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a,b;
        a = sc.nextInt();
        b = sc.nextInt();

        System.out.println(NumberOfCarries(a,b));
    }
}
