import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String label = scanner.nextLine();
        int rank = scanner.nextInt();

        if (rank % 2 == 0) {
            if (label.equals("a") || label.equals("c") || label.equals("e") || label.equals("g")) {
                System.out.println("ligt");
            } else {
                System.out.println("dark");
            }
        } else {
            if (label.equals("a") || label.equals("c") || label.equals("e") || label.equals("g")) {
                System.out.println("dark");
            } else {
                System.out.println("light");
            }
        }
    }
}