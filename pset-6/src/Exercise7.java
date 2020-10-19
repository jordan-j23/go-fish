import java.util.Scanner;

public class Exercise7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int userInput = 0;
        while (userInput <= 0){
            System.out.print("Enter an integer: ");
            userInput = input.nextInt();
        }
        input.close();

        int[] factorArray = new int[0];
        int size = 0;
        for (int i = userInput; i >0; i--){
            if(userInput % i == 0){
                int factor = userInput/i;

                if (size <= 0){
                    size+= 2;
                    factorArray = new int[size];
                    factorArray[0] = factor;
                    factorArray[1] = i;
                }
                else {
                    int[] tempArray = new int[size];
                    for (int j = 0; j < size; j++){
                        tempArray[j] = factorArray[j];
                    }
                    size+= 2;
                    factorArray = new int[size];
                    for (int k = 0; k < size - 2; k++) {
                        factorArray[k] = tempArray[k];
                    }
                    factorArray[size-2] = factor;
                    factorArray[size-1] = i;
                }
            }
        }
        System.out.println();
        for (int i = 0; i < size/2; i++){
            if(i == size/2 - 1){
                System.out.print(factorArray[i] + ".");
            }
            else {
                System.out.print(factorArray[i] + ", ");
            }
        }
        System.out.print("\n");
    }
}