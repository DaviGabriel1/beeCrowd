package interfatec.somadedigitos;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

public class SomaDeDigitos {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        int soma = 0;
        while(num != 0){
            int resto = num%10;
            num/=10;
            soma+=resto;
        }
        System.out.println(soma);

        //////////////INVERTER NUMEROS
        ArrayList<Integer> listaDigitos = new ArrayList<>();
        int num2 = scan.nextInt();
        int resultado = 0;
        while(num2 !=0){
            listaDigitos.add(num2%10);
            num2/=10;
        }
        for(int i = 0;i< listaDigitos.size();i++){
            int v = (int) (listaDigitos.get(i)*Math.pow(10,-(i-listaDigitos.size()+1)));
            listaDigitos.set(i,v);
            resultado+=listaDigitos.get(i);
        }
        System.out.println(resultado);


    }
}
