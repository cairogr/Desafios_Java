import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double A, B;
        Scanner input = new Scanner(System.in);
        A = input.nextInt();
        B = input.nextInt();

        int anos = 0;

        while (A<B){
            A=A*1.03;
            B=B*1.015;
            anos++;
        }

        //TODO: retornar o número de anos necessários para que a população do país A ultrapasse ou iguale a população B

        System.out.println(anos + " anos");
    }
}
