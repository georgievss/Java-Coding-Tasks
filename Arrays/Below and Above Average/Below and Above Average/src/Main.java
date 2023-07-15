import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] elements = scanner.nextLine().split(",");
        int[] numbers = new int[elements.length];

        double average = 0;
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = Integer.parseInt(elements[i]);
            average += numbers[i];
        }

        average /= numbers.length;

        StringBuilder below = new StringBuilder();
        StringBuilder above = new StringBuilder();

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < average) {
                below.append(numbers[i]).append(",");
                continue;
            }

            if (numbers[i] > average) {
                above.append(numbers[i]).append(",");
            }
        }
        if (below.charAt(below.length()-1)==','){
            below.deleteCharAt(below.length()-1);
        }
        if (above.charAt(above.length()-1)==','){
            above.deleteCharAt(above.length()-1);
        }
        System.out.printf("avg: %.2f\n", average);
        System.out.printf("below: %s\n", below);
        System.out.printf("above: %s\n", above);
    }
}