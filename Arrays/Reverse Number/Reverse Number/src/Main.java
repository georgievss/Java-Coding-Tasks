import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] element = scanner.nextLine().split("");

        for (int i = element.length - 1; i >= 0; i--) {
            System.out.print(element[i]);

        }
    }
}