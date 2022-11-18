import java.sql.Array;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String palavra = scanner.next();

        for (int i=0; i<=palavra.length(); i++){
            int x=0;
            System.out.println();
            while (x<i){
                System.out.print(palavra.charAt(x));
                x++;
            }
        }
    }
}
