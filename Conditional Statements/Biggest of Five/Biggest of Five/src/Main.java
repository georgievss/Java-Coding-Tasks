import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int d = scanner.nextInt();
        int e = scanner.nextInt();

        if (a > b && a > c && a > d && a > e) {
            System.out.println(a);
        }
        else if (b > a && b > c && b > d && b > e) {
            System.out.println(b);
        }
        else if (c > a && c > b && c > d && c > e) {
            System.out.println(c);
        }
        else if (d > a && d > b && d > c && d > e) {
            System.out.println(d);
        } else {
            System.out.println(e);
        }
    }
}