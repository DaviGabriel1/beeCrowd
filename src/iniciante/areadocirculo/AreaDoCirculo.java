package iniciante.areadocirculo;
import java.util.Scanner;
public class AreaDoCirculo {
    public static void main(String[] args) {
        final double pi = 3.14159;
        Scanner scan = new Scanner(System.in);
        double r = scan.nextDouble();
        System.out.printf("A=%.4f",(pi*(r*r)));
        System.out.println();
    }
}
