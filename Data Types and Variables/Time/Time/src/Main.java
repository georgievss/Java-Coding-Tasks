import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int d = scanner.nextInt();
        int h = scanner.nextInt();
        int m = scanner.nextInt();
        int s = scanner.nextInt();

        System.out.println(d*86400+h*3600+m*60+s);
    }
}