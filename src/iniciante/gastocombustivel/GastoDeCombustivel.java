package iniciante.gastocombustivel;

import java.util.Scanner;

public class GastoDeCombustivel {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double tempoViagem = scan.nextInt();
        double velocidadeMedia = scan.nextInt();
        System.out.println(String.format("%.3f",(tempoViagem*velocidadeMedia)/12));
    }
}
