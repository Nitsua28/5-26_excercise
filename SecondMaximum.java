import java.util.Scanner;

public class SecondMaximum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        int n = scanner.nextInt();

        
        for (int i = 0; i < n; i++) {
            int first = scanner.nextInt();
            int second = scanner.nextInt();
            int third = scanner.nextInt();

            int secondMax = 0;
            if ((first > second && first < third) || (first > third && first < second)) {
                secondMax = first;
            } else if ((second > first && second < third) || (second > third && second < first)) {
                secondMax = second;
            } else {
                secondMax = third;
            }

            
            System.out.println(secondMax);
        }

        scanner.close();
    }
}
