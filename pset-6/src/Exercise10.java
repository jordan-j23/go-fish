import java.util.Scanner;

public class Exercise10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter credit card number: ");
        String cardNum = input.nextLine();
        input.close();
        boolean valid = false;
        int sum = 0;

        for (int j = cardNum.length()-2; j >= 0; j -= 2) {
            int digit = 2 * Integer.parseInt(Character.toString(cardNum.charAt(j)));
            int first = digit / 10;
            int second = digit - first * 10;
            int total = first + second;
            sum += total;
        }
        for (int k = cardNum.length() - 1; k >= 0; k -= 2) {
            sum += Integer.parseInt(Character.toString(cardNum.charAt(k)));
        }
        String sumStr = Integer.toString(sum);
        if (Character.toString(sumStr.charAt(sumStr.length()-1)).equals("0")) {
            valid = true;
        }
        if (sum % 10 == 0) {
            if (cardNum.length() == 15 && (cardNum.startsWith("34") || cardNum.startsWith("37")) && valid) {
                System.out.print("\n" + "American Express.");
            }
            else if (cardNum.length() == 16 && (cardNum.startsWith("51") || cardNum.startsWith("52") || cardNum.startsWith("53") || cardNum.startsWith("54") || cardNum.startsWith("55")) && valid) {
                System.out.print("\n" + "MasterCard.");
            }
            else if ((cardNum.length() == 13 || cardNum.length() == 16) && cardNum.startsWith("4") && valid) {
                System.out.print("\n" + "Visa.");
            }
            else if (!valid){
                System.out.print("\n" + "Invalid.");
            }
        }
        else {
            System.out.print("\n" + "Invalid.");
        }
    }
}