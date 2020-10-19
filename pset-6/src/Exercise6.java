import java.util.Scanner;

public class Exercise6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int intInput;
        double fibonacci  = 0;
        double a = 0;
        double b = 1;

        do {
            System.out.print("Enter an integer: ");
            intInput = in.nextInt();
        }
        while (intInput < 1 || intInput > 92);

        if (intInput == 1) {
            fibonacci  = 0;
        }
        else if (intInput == 2) {
            fibonacci  = 1;
        }
        else {
            for (int i = 2; i < intInput; i++) {
                fibonacci  = a + b;
                a = b;
                b = fibonacci ;
            }
        }
        System.out.printf("\n%,.0f", fibonacci );
        System.out.println(".");
        in.close();
    }
}