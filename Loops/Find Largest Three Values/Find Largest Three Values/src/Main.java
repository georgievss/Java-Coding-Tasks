import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int firstNumber = scanner.nextInt();
        int secondNumber = scanner.nextInt();
        int thirdNumber = scanner.nextInt();

        int maxNumber = Math.max(Math.max(firstNumber, secondNumber), thirdNumber);
        int minNumber = Math.min(Math.min(firstNumber, secondNumber), thirdNumber);
        int mediumNumber = (firstNumber+secondNumber+thirdNumber) - maxNumber-minNumber;

        for (int i = 3; i < n; i++) {
            int currentNumber = scanner.nextInt();
            if (currentNumber>maxNumber){
                minNumber = mediumNumber;
                mediumNumber = maxNumber;
                maxNumber = currentNumber;
                continue;
            }
            if (currentNumber > mediumNumber){
                minNumber = mediumNumber;
                mediumNumber = currentNumber;
                continue;
            }
            if (currentNumber > minNumber){
                minNumber = currentNumber;
            }
        }
        System.out.printf("%d, %d and %d", maxNumber, mediumNumber, minNumber);
    }
}