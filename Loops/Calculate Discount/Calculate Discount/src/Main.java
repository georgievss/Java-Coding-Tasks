import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        double[] price = new double[n];

        for (int i = 0; i < n; i++) {
            price[i] = scanner.nextDouble();
        }
        for (int i = 0; i < n; i++) {
            System.out.printf("%.2f \n",price[i]*0.35);
        }


    }

}