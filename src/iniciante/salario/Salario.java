package iniciante.salario;

import java.util.Scanner;

public class Salario {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String nome = scan.nextLine();
        double salarioBase = scan.nextDouble();
        double vendas = scan.nextDouble();
        System.out.printf("TOTAL = R$ %.2f",(salarioBase+(vendas*15/100)));
        System.out.println();
    }
}
