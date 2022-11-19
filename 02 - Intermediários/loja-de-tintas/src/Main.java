import java.util.Scanner;

import static java.lang.Math.abs;
import static java.lang.Math.round;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double areaCoberta = scanner.nextDouble();


        double quantidadeLatas= round((areaCoberta/6)/18);
        double quantidadeGaloes= round(abs((areaCoberta/6)/3.6));
        double valorGalao=25;
        double valorLata=80;

        System.out.println("Quantidade(s) de lata(s) de tinta necessaria(s): " + (int) quantidadeLatas + " no valor R$ "  + quantidadeLatas * valorLata );
        System.out.println("Quantidade(s) de galao(oes) de tinta necessaria(s): " + (int) quantidadeGaloes + " no valor R$ "  + quantidadeGaloes * valorGalao);
    }
}
