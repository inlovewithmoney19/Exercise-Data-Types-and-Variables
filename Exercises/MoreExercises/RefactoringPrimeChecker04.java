package MoreExercises;

import java.util.Scanner;

public class RefactoringPrimeChecker04 {
    public static void main(String[] args) {
        Scanner chetec = new Scanner(System.in);

        int rows = Integer.parseInt(chetec.nextLine());

        for (int NumberOne = 2; NumberOne <= rows; NumberOne++) {

            boolean isValid = true;
            for (int divide = 2; divide < NumberOne; divide++) {
                if (NumberOne % divide == 0) {
                    isValid = false;
                    break;
                }
            }
            System.out.printf("%d -> %b%n", NumberOne, isValid);
        }
    }
}
