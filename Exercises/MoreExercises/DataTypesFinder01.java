package MoreExercises;
import java.util.Scanner;

public class DataTypesFinder01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        while (!input.equals("END")){

            String type = "";
            if (input.equalsIgnoreCase("true") || input.equalsIgnoreCase("false")){
                type = "boolean";                     // Намираме дали е boolean

            }else if (input.length() == 1){           // намиране на Char от STRING !!!!!

                char symbol = input.charAt(0);
                if (symbol <= 47 || symbol >= 58){    // спорез ASCII Table стойностите на символи
                    type = "character";
                }else {                               // от 48 и 57 стойностите са числа от 0 до 9
                    type = "integer";
                }

            }else {                                   // проверка за String или floating point number

                boolean isString = false ;
                boolean isFloatingPoint = false ;
                for (int i = 0; i <input.length() ; i++) {
                    char currentSymbol = input.charAt(i);
                    if (currentSymbol < 45 || currentSymbol > 57){
                        isString = true;
                    }
                    if (currentSymbol == 46){          // ASCII номера на floating point (точка, " . ")
                        isFloatingPoint = true;
                    }
                }

                if (isString){
                    type = "string";
                }else {
                    if (isFloatingPoint){
                        type = "floating point";
                    }else {
                        type = "integer";
                    }
                }
            }
            System.out.printf("%s is %s type%n",input,type);
            input = scanner.nextLine();
        }
    }
}
