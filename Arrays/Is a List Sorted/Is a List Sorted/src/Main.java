import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < n; i++) {
            String[] elements = scanner.nextLine().split(",");
            int[] numbers = new int[elements.length];
            for (int j = 0; j < numbers.length; j++) {
                numbers[j] = Integer.parseInt(elements[j]);
            }

            boolean isSorted = true;
            for (int j = 0; j < numbers.length-1; j++) {
                if (numbers[j]>numbers[j+1]){
                    isSorted = false;
                    break;
                }
            }
            System.out.println(isSorted);
        }
    }
}