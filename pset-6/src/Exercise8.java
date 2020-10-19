import java.util.Scanner;

public class Exercise8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int htInput = 0;
        while (htInput <= 0 || htInput > 24){
            System.out.print("Height: ");
            htInput = input.nextInt();
        }
        input.close();
        int height = htInput;
        String[] array = new String[height];
        for (int i = 0; i < height; i++){
            array[i] = "#";
        }
        System.out.println();
        int stack = 2;
        for(int i = 1; i < htInput; i++){
            int intervals = htInput - stack;

            for (int j = 0; j <= intervals; j++){
                System.out.print(" ");
            }
            for (int k = 0; k < stack; k++){
                System.out.print(array[k]);
            }
            stack++;
            System.out.println();
        }
    }
}