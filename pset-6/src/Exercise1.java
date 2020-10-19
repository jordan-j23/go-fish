import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int lowBound = 0;
        int upBound = -1;

        while(upBound < lowBound) {
            System.out.print("Lower bound: ");
            lowBound = input.nextInt();
            System.out.print("Upper bound: ");
            upBound = input.nextInt();
        }
        input.close();
        int sum = 0;
        for(int i = lowBound; i <= upBound; i++){
            if (i % 2 == 0){
                sum += i;
            }
        }
        System.out.printf("%n%,d." , sum );
    }
}