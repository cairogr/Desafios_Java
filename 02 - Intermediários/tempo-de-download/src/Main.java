import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double tmhMB = sc.nextDouble();
        double tmhMbps = sc.nextDouble();

        double timeDownload= (tmhMB/tmhMbps)/60;

        System.out.printf("%.2f", timeDownload);





    }
}
