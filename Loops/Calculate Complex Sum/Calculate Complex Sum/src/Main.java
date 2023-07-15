import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double n = scanner.nextDouble();
        double x = scanner.nextDouble();
        double fact = 1;
        double S = 1;

        for (int i = 1; i <= n; i++) {
            fact = fact * i;
            S = S + fact/Math.pow(x, i);

        }
        System.out.printf("%.5f", S);
    }
}