package MoreExercises;
import java.util.Scanner;

public class FloatingEquality03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double numOne = Double.parseDouble(scanner.nextLine());
        double numTwo = Double.parseDouble(scanner.nextLine());

        String diff = "";
        if (numOne > numTwo && (numOne - numTwo > 0.000001) ) {
            diff = "False";
        }else if ( numOne < numTwo && (numTwo - numOne > 0.000001) ) {
            diff = "False" ;
        }else if (numOne < numTwo && (numTwo - numOne <= 0.0000099) ){
            diff = "True";
        }else if (numOne > numTwo && (numOne - numTwo <= 0.0000099) ) {
            diff = "True";
        }
        System.out.println(diff);
    }
}
