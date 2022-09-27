import java.util.Scanner;

public class PrintAsciiTable05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int startNumber = Integer.parseInt(scanner.nextLine());
        int stopNumber = Integer.parseInt(scanner.nextLine());

        for (int i = startNumber; i <=stopNumber ; i++) {
            System.out.print((char) i  + " ");
        }
    }
}
