package iniciante.esfera;

import java.util.Scanner;

public class Esfera {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        final double pi = 3.14159;
        double r = scan.nextDouble();
        System.out.printf("VOLUME = %.3f",(4.0/3*pi*Math.pow(r,3)));
        System.out.println();
    }
}
