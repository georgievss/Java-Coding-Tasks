import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        double firstYear = n*1.05;
        double secondYear = firstYear*1.05;
        double thirdYear = secondYear*1.05;

        System.out.printf("%.2f\n", firstYear);
        System.out.printf("%.2f\n", secondYear);
        System.out.printf("%.2f\n", thirdYear);
    }
}