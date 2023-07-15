import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int humanYears = scanner.nextInt();


        if (humanYears <= 2){
            System.out.println(humanYears*10);
        } else {
            System.out.println((humanYears-2)*4+20);
        }
    }

}