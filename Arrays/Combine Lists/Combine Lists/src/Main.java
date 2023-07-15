import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] arrayOne = scanner.nextLine().split(",");
        String[] arrayTwo = scanner.nextLine().split(",");
        String[] result = new String[arrayOne.length + arrayTwo.length];

        int position = 0;
        for (int i = 0; i < result.length; i+=2) {
            result[i] = arrayOne[position];
            result[i + 1] = arrayTwo[position];
            position++;
        }
        System.out.println(String.join(",",result));
    }
}