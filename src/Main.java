import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        StringBuffer sb = new StringBuffer(scan.nextLine());
        System.out.println(sb.reverse());
    }
}