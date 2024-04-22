package interfatec.primalidade;

import java.util.Scanner;

public class Primalidade {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        boolean ePrimo = true;
        for(int i = 2; i<10;i++){
            if(num%i ==0 && num !=i){
                ePrimo=false;
            }
        }
        if(ePrimo){
            System.out.println("o numero "+num+" é primo");
        }
        else{
            System.out.println("o numero "+num+" não é primo");
        }
    }
}
