import java.util.Scanner;

public class PokeMon10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int power = Integer.parseInt(scanner.nextLine());
        int distance = Integer.parseInt(scanner.nextLine());
        int factor = Integer.parseInt(scanner.nextLine());

        int totalPower = power;
        int countPokes = 0;
        while (totalPower >= distance){
            totalPower -=distance;
            countPokes++;

            if (totalPower == power /2 ) {
                if (factor > 0) {
                    totalPower /= factor;
                }
            }
        }
        System.out.println(totalPower);
        System.out.println(countPokes);
    }
}
