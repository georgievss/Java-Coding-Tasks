import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int firstNumber = scanner.nextInt();
        int secondNumber = scanner.nextInt();

        int maxNumber = Math.max(firstNumber, secondNumber);


        for (int i = 2; i < n; i++) {
            int currentNumber = scanner.nextInt();
            if (currentNumber>maxNumber){
                maxNumber = currentNumber;
                continue;
            }
        }
        System.out.println(maxNumber);
    }
}