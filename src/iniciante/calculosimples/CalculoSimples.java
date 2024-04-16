package iniciante.calculosimples;
import java.util.Scanner;
public class CalculoSimples {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int codigo1 = scan.nextInt();
        int quantidade1 = scan.nextInt();
        double valorUnitario1 = scan.nextDouble();
        int codigo2 = scan.nextInt();
        int quantidade2 = scan.nextInt();
        double valorUnitario2 = scan.nextDouble();
        System.out.printf("VALOR A PAGAR: R$ %.2f",((quantidade1*valorUnitario1)+(quantidade2*valorUnitario2)));
        System.out.println();
    }
}
