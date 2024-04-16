package iniciante.media2;
import java.util.Scanner;
public class Media2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double v1 = scan.nextDouble();
        double v2 = scan.nextDouble();
        double v3 = scan.nextDouble();
        System.out.printf("MEDIA = %.1f", (v1*2+v2*3+v3*5)/10);
        System.out.println();
    }
}
