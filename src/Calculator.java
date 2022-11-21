import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        int option;


            Scanner sc = new Scanner(System.in);
            System.out.println("Choose your option : 1. Addition \n 2. Substraction \n 3. Multiplication \n 4. Division\n 5. Exit");
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
    public static void Addition{
        int a=0,b=0,c=0;
        System.out.println("Enter first number");
        Scanner add= new Scanner(System.in);
        a= add.nextInt();
        System.out.println("Enter second number");
        b= add.nextInt();
        c=a+b;
        System.out.println("Sum="+c);

    }
    public static void Substraction{
        int a=0,b=0,c=0;
        System.out.println("Enter first number");
        Scanner add= new Scanner(System.in);
        a= add.nextInt();
        System.out.println("Enter second number");
        b= add.nextInt();
        c=a-b;
        System.out.println("Difference="+c);

    }
    public static void Multiplication{
        int a=0,b=0,c=0;
        System.out.println("Enter first number");
        Scanner add= new Scanner(System.in);
        a= add.nextInt();
        System.out.println("Enter second number");
        b= add.nextInt();
        c=a*b;
        System.out.println("Product="+c);

    }
    public static void Division{
        int a=0,b=0,c=0;
        System.out.println("Enter first number");
        Scanner add= new Scanner(System.in);
        a= add.nextInt();
        System.out.println("Enter second number");
        b= add.nextInt();
        c=a/b;
        System.out.println("Quotient="+c);

    }

}
