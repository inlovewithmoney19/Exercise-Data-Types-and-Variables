import java.util.Scanner;

public class WaterOverflow07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numAddWater = Integer.parseInt(scanner.nextLine());

        int litres = 0;
        for (int i = 1; i <=numAddWater ; i++) {
            int addWater = Integer.parseInt(scanner.nextLine());
            litres +=addWater;
            if (litres > 255){
                System.out.println("Insufficient capacity!");
                litres -= addWater;
            }
        }
        System.out.println(litres);
    }
}
