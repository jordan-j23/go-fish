import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double user = 0.0;
        while (user <= 0) {
            System.out.print("Enter an Integer: ");
            user = input.nextDouble();
        }
        input.close();
        System.out.println(" ");

        int userInput = (int) user;
        String rString = String.valueOf(userInput);

        int length = rString.length();
        for (int i = length-1; i > -1; i--) {
            String subInput = rString.substring(i, i+1);

            if (i == 0){
                System.out.print(subInput + ". ");
            }
            else {
                System.out.print(subInput + ", ");
            }
        }
    }
}