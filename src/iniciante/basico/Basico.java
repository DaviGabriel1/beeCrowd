package iniciante.basico;
import java.util.Scanner;
public class Basico {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        int v1 = scan.nextInt();
        int v2 = scan.nextInt();
        System.out.println("X = "+(v1+v2));
    }
}
