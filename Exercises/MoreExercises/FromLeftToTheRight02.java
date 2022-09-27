package MoreExercises;

import java.util.Scanner;

public class FromLeftToTheRight02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= n ; i++) {
            String number = scanner.nextLine();

            String leftNumber = "";
            for (int firstNum = 0; firstNum <= number.length() ; firstNum++) {// вземане на чаровете постепенно

                char firstNumSymbols = number.charAt(firstNum);
                if (firstNumSymbols == 32 ){
                    break;
                }else {
                    leftNumber += firstNumSymbols;
                }
            }

            String rightNumberReverse = "";
            for (int secondNum = number.length() -1; secondNum >= 0 ; secondNum--) {

                char secondNumSymbol = number.charAt(secondNum);
                if(secondNumSymbol == 32){
                    break;
                }else {
                    rightNumberReverse += secondNumSymbol;
                }
            }

            String rightNumber = "";
            for (int secondNumReversed = rightNumberReverse.length() -1; secondNumReversed >= 0 ; secondNumReversed--) {
                char symbol = rightNumberReverse.charAt(secondNumReversed);
                rightNumber += symbol;
            }
            double leftNum = Double.parseDouble(leftNumber);
            double rightNum = Double.parseDouble(rightNumber);

            int digitsSUm = 0 ;
            if(leftNum > rightNum){
                for (int j = 0; j <= leftNumber.length() -1 ; j++) {

                    char leftSymbol = leftNumber.charAt(j);
                    if (leftSymbol >= 48 && leftSymbol <= 57){
                        String letter = "" + leftSymbol;
                        int digit = Integer.parseInt(letter);
                        digitsSUm += digit;
                    }
                }
            } else {
                for (int j = 0; j <= rightNumber.length()-1 ; j++) {

                    char rightSymbol = rightNumber.charAt(j);
                    if (rightSymbol >= 48 && rightSymbol <=57){
                        String letter = "" + rightSymbol;
                        int digit = Integer.parseInt(letter);
                        digitsSUm +=digit;
                    }
                }
            }
            System.out.println(digitsSUm);
        }
    }
}
