import java.util.Scanner;

public class DigitSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int t = scanner.nextInt();

        for (int i = 0; i < t; i++) {
            
            String s = scanner.next();

            int sum = 0;

            for (int k = 0; k < s.length(); k++) {
                char ch = s.charAt(k);

                if (Character.isDigit(ch)) {
                    
                    sum += Character.getNumericValue(ch);
                }
            }

            System.out.println(sum);
        }

        scanner.close();
    }

}
