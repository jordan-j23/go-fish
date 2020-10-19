import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num = -1;
        while (num <= 0) {
            System.out.print("Enter an integer: ");
            num = input.nextInt();
        }
        int sum = 0;
        String numString = String.valueOf(num);
        int length = numString.length();
        for (int i = 0; i < length; i++){
            String intSub = numString.substring(i, i+1);
            int intAtString = Integer.parseInt(intSub);
            if (intAtString % 2 != 0){
                sum+= intAtString;
            }
        }
        System.out.println("\n" + sum + ".");
        input.close();
    }
}