import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int messages = scanner.nextInt();
        int minutes = scanner.nextInt();
        double taxes = 0.2;
        double total = 0;

        if (messages <= 20 && minutes <= 60) {
            System.out.println("0 additional messages for 0.00 levas\n" +
                    "0 additional minutes for 0.00 levas\n" +
                    "0.00 additional taxes\n" +
                    "12.00 total bill");
        }
        if (messages > 20 && minutes > 60) {
            int extraMessages = messages - 20;
            int extraMinutes = minutes - 60;
            double priceMessages = extraMessages * 0.06;
            double priceMinutes = extraMinutes * 0.1;
            double fullTaxes = 1.2;

            System.out.printf("%d additional messages for %.2f levas\n", extraMessages, priceMessages);
            System.out.printf("%d additional minutes for %.2f levas\n", extraMinutes, priceMinutes);
            System.out.printf("%.2f additional taxes\n", (priceMessages + priceMinutes) * taxes);
            System.out.printf("%.2f total bill", (12 + (priceMessages + priceMinutes) * fullTaxes));
        }
        if (messages > 20 && minutes <= 60){
            int extraMessages = messages - 20;
            double priceMessages = extraMessages * 0.06;
            double fullTaxes = 1.2;

            System.out.printf("%d additional messages for %.2f levas\n", extraMessages, priceMessages);
            System.out.printf("0 additional minutes for 0.00 levas\n");
            System.out.printf("%.2f additional taxes\n", (priceMessages * taxes));
            System.out.printf("%.2f total bill", (12 + (priceMessages * fullTaxes)));
        }
        if (messages <=20 && minutes > 60){
            int extraMinutes = minutes - 60;
            double priceMinutes = extraMinutes * 0.1;
            double fullTaxes = 1.2;

            System.out.printf("0 additional messages for 0.00 levas\n");
            System.out.printf("%d additional minutes for %.2f levas\n", extraMinutes, priceMinutes);
            System.out.printf("%.2f additional taxes\n", (priceMinutes * taxes));
            System.out.printf("%.2f total bill", (12 + priceMinutes * fullTaxes));
        }
    }
}