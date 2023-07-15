import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int m = scanner.nextInt();
        double gallon = 4.54;
        double mile = 1.6;
        double kpl = 283/m;

        System.out.printf("%.0f litres per 100 km", kpl);

    }
}