package interfatec.ordenacaoCrecente;

import java.util.*;

public class Ordenacao {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] nums = {4,7,2,34,7,9,2};
        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));
        ///////////////////////////////////////////////////
        ArrayList<Integer> numeros = new ArrayList<>();
        for(int i = 0; i<10;i++){
            int n = scan.nextInt();
            numeros.add(n);
        }
        Collections.sort(numeros);

        for(Integer i : numeros){
            System.out.print(i+" ");
        }
        System.out.println();

        Collections.reverse(numeros);
        for(Integer i : numeros){
            System.out.print(i+" ");
        }
    }
}
