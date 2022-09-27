import java.util.Scanner;

public class TriplesOfLatinLetters06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberRows = Integer.parseInt(scanner.nextLine());

        for (char letter1 = 'a'; letter1 < 'a'  + numberRows; letter1++) {
            for (char letter2 = 'a'; letter2 < 'a' + numberRows ; letter2++) {
                for (char letter3 = 'a'; letter3 < 'a' +  numberRows; letter3++) {
                    System.out.printf("%c%c%c%n",letter1,letter2,letter3);
                }
            }
        }
    }
}
