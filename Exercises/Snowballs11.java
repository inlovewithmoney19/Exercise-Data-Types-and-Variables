import java.util.Scanner;

public class Snowballs11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        double snowBallValue = Integer.MIN_VALUE;
        int snow = 0 ;
        int time = 0 ;
        int quality = 0;
        for (int i = 1; i <= n ; i++) {
            int snowballSnow = Integer.parseInt(scanner.nextLine());
            int snowballTime = Integer.parseInt(scanner.nextLine());
            int snowballQuality = Integer.parseInt(scanner.nextLine());

            double value = Math.pow(snowballSnow / snowballTime,snowballQuality) ;

            if (value > snowBallValue){
                snow = snowballSnow;
                time = snowballTime;
                quality = snowballQuality;
                snowBallValue = value;
            }
        }
        System.out.printf("%d : %d = %.0f (%d)",snow,time,snowBallValue,quality);
    }
}
