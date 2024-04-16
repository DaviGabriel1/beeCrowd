package iniciante.consumo;

import java.util.Scanner;

public class Consumo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int distanciaTotal = scan.nextInt();
        double combustivelGasto = scan.nextDouble();
        System.out.println((String.format("%.3f",distanciaTotal/combustivelGasto)+" km/l"));
    }
}
