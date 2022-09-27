import java.util.Scanner;

public class BeerKegs08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());


        String biggestKeg = " ";
        double biggestResult = Double.MIN_VALUE;
        for (int i = 1; i <= n; i++) {
            String kegName = scanner.nextLine();
            double radius = Double.parseDouble(scanner.nextLine());
            int height = Integer.parseInt(scanner.nextLine());

            double result = Math.PI * Math.pow(radius, 2) * height;

            if (result > biggestResult) {
                biggestKeg = kegName;
                biggestResult = result;
            }
        }
        System.out.println(biggestKeg);
    }
}