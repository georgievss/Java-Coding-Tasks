import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(",");
        String[] noDuplicates = new String[input.length];

        int position = 0;
        for (int i = 0; i < input.length; i++) {
            boolean isDuplicated = false;
            for (int j = 0; j < input.length; j++) {
                if (noDuplicates[j] != null && noDuplicates[j].equals(input[i])) {
                    isDuplicated = true;
                    break;
                }
            }
            if (isDuplicated == false) {
                noDuplicates[position] = input[i];
                position++;
            }
        }
        StringBuilder result = new StringBuilder();
        for (String str : noDuplicates) {
            if (str != null){
                result.append(str).append(",");
            }
        }
        if (result.charAt(result.length()-1) == ','){
            result.deleteCharAt(result.length()-1);
        }
        System.out.println(result);
    }
}