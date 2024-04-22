package interfatec.buscaBinaria;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class BuscaBinaria {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<Integer> lista = new ArrayList<>();
        for(int i = 0; i<10;i++){
            lista.add(scan.nextInt());
        }
        Collections.sort(lista);
        System.out.println("insira o numero que deseja procurar: ");
        int num = scan.nextInt();
        int index=-1;
        boolean numeroEncontrado = false;
        for(int i = 0;i< lista.size();i++){
            if(num == lista.get(i)){
                if(index==-1) {
                    index = i;
                }
                numeroEncontrado=true;
            }
        }
        if(numeroEncontrado){
            System.out.println("o numero "+num+" está na posição "+index+" na lista");
        }
        else{
            System.out.println("o numero "+num+" não está na lista");
        }
    }
}
