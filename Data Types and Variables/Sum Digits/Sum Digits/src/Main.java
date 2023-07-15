import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner user_input = new Scanner(System.in);



        int N = user_input.nextInt();
        int sum = 0;
        int rem = 0;

        while(N > 0) {
            rem = N % 10;
            sum = sum + rem;
            N = N / 10;
        }
        System.out.println(sum);

    }
}