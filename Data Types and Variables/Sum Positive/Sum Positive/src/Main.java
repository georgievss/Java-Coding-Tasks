import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        int n = scanner.nextInt();
        sum = n*(n+1)/2;

        System.out.println(sum);
    }
}