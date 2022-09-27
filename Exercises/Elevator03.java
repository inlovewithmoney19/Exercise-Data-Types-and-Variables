import java.util.Scanner;

public class Elevator03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int capacity = Integer.parseInt(scanner.nextLine());
        int capacityByRice = Integer.parseInt(scanner.nextLine());

        double runs = Math.ceil(capacity * 1.0 / capacityByRice) ;

        System.out.printf("%.0f",runs);
        }
    }

