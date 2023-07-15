import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String month = scanner.nextLine();
        int date = scanner.nextInt();

        if (month.equals("December") && date >=21 && date <= 31) {
            System.out.printf("Winter");
        }
        if (month.equals("January") || month.equals("February")){
            System.out.println("Winter");
        }
        if (month.equals("March") && date >=1 && date <= 19) {
            System.out.printf("Winter");
        }
        if (month.equals("March") && date >=20 && date <= 31) {
            System.out.printf("Spring");
        }
        if (month.equals("April") || month.equals("May")) {
            System.out.println("Spring");
        }
        if (month.equals("June") && date >=1 && date <= 20) {
            System.out.printf("Spring");
        }
        if (month.equals("June") && date >=21 && date <= 30) {
            System.out.printf("Summer");
        }

        if (month.equals("September") && date >=1 && date <= 21) {
            System.out.printf("Summer");
        }
        if (month.equals("September") && date >=22 && date <= 30) {
            System.out.printf("Autumn");
        }
        if (month.equals("October") || month.equals("November")) {
            System.out.println("Autumn");
        }
        if (month.equals("December") && date >=1 && date <= 20) {
            System.out.printf("Autumn");
        }

    }
}