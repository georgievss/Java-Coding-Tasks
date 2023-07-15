import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] elements = scanner.nextLine().split(" ");
        int[] numbers = new int[elements.length];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = Integer.parseInt(elements[i]);
        }
        for (int celsius : numbers) {
            double farenheit = (celsius*1.8)+32;
            System.out.printf("%.0f\n", farenheit);
        }
    }
}