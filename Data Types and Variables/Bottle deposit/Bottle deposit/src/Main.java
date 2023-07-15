import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int halfLiter = scanner.nextInt();
        int oneLiter = scanner.nextInt();
        double sum = (halfLiter*0.1)+(oneLiter*0.25);

        System.out.printf("%.2f", sum);
    }
}