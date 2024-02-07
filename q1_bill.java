import java.util.Scanner;

public class q1_bill {
    public static void main(String[] args) {

        //price of cold drink pizza and puff
        int colddrink = 10;
        int puff = 20;
        int pizza = 100;

        // for input
        int nof_colddrink;
        int nof_puff;
        int nof_pizza;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no of pizza bought: ");
        nof_pizza = sc.nextInt();
        System.out.println("Enter the no of puffs bought: ");
        nof_puff = sc.nextInt();
        System.out.println("Enter the no of cool drinks bought: ");
        nof_colddrink = sc.nextInt();

        System.out.println("Bill Details\n");
        System.out.println("No of Pizzas: " + nof_pizza);
        System.out.println("No of Puffs: " + nof_puff);
        System.out.println("No of Cool Drinks: " + nof_colddrink);

        int total = 0;
        total = (nof_pizza * 100) + (nof_colddrink*10) + (nof_puff*20);

        System.out.println("Total price: " + total);

    }
}