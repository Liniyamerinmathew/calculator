import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        int a=0,b=0,c=0,option;


            Scanner sc = new Scanner(System.in);
            System.out.println("Choose your option : 1. Addition \n 2. Substraction \n 3. Multiplication \n 4. Division\n");
            option = sc.nextInt();
        switch (option) {
            case 1:
                Addition();
            case 2:
                Substraction();
            case 3:
                Multiplication();
            case 4:
                Division();
            default:
                System.out.println("Invalid choice");
        }


    }
}
