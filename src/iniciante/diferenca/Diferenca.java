package iniciante.diferenca;
import java.util.Scanner;
public class Diferenca {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int v1 = scan.nextInt();
        int v2 = scan.nextInt();
        int v3 = scan.nextInt();
        int v4 = scan.nextInt();
        System.out.println("DIFERENCA = "+ ((v1*v2)-(v3*v4)));
        System.out.println();
    }
}
