import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] elements = scanner.nextLine().split(", ");
        int[] numbers = new int[elements.length];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = Integer.parseInt(elements[i]);
        }
        Arrays.sort(numbers);


        for (int i = numbers.length - 1; i >= 0 ; i--) {
            System.out.print(numbers[i]);
            if (i != 0){
                System.out.print(", ");
            }


        }

    }
}