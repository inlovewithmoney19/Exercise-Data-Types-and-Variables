
import java.util.Scanner;

public class SpiceMustFlow09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int yields = Integer.parseInt(scanner.nextLine());

        int clearYield = 0;
        int daysWorking = 0;
        while (yields >= 100){
            clearYield  = clearYield + (yields - 26);
            yields -= 10;
            daysWorking++;
        }
        System.out.println(daysWorking);
        if (clearYield >=26){
            clearYield -=26;
        }
        System.out.println(clearYield);
    }
}
