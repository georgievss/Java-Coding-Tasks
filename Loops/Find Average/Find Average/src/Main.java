import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        double sum = 0;

        for (int i = 1; i <= n; i++) {
            sum += scanner.nextDouble();
        }
        double result = sum/n;
        System.out.printf("%.2f", result);

    }
}