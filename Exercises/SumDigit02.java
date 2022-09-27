import java.util.Scanner;

public class SumDigit02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());

        int sumNumbers= 0;
       while (number > 0){
           int currentNumber = number % 10;
           sumNumbers += currentNumber;
           number = number / 10;
       }
        System.out.println(sumNumbers);
    }
}
