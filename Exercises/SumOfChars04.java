import java.util.Scanner;

public class SumOfChars04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());

        int sum = 0;
        for (int i = 1; i <=number ; i++) {
            char currentSymbol = scanner.nextLine().charAt(0);
            sum += currentSymbol;
        }
        System.out.printf("The sum equals: %d",sum);
    }
}
