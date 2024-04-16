package iniciante.area;

import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        final double pi = 3.14159;
        double a = scan.nextDouble();
        double b = scan.nextDouble();
        double c = scan.nextDouble();
        System.out.println("TRIANGULO: "+String.format("%.3f",((a*c)/2)));
        System.out.println("CIRCULO: "+String.format("%.3f",pi*Math.pow(c,2)));
        System.out.println("TRAPEZIO: "+String.format("%.3f",((a+b)*c/2)));
        System.out.println("QUADRADO: "+String.format("%.3f",Math.pow(b,2)));
        System.out.println("RETANGULO: "+String.format("%.3f",a*b));

    }
}
