import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        double sum = 0;
        double maxNum = -10000;
        double minNum = 10000;

        for (int i = 1; i <= n; i++) {
            double input = scanner.nextDouble();
            sum += input;
            minNum = Math.min(minNum, input);
            maxNum = Math.max(maxNum, input);
        }

        double average = sum/n;

        System.out.printf("min=%.2f\n", minNum);
        System.out.printf("max=%.2f\n", maxNum);
        System.out.printf("sum=%.2f\n", sum);
        System.out.printf("avg=%.2f\n", average);

    }
}