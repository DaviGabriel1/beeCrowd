package interfatec.ordenacaoClasse;

import java.util.ArrayList;
import java.util.Collections;

public class Comparacao {
    public static void main(String[] args) {
        ArrayList<Produto> produtos = new ArrayList<>();
        produtos.add(new Produto("camisa",65.99));
        produtos.add(new Produto("calça",89.90));
        produtos.add(new Produto("oculos",177.00));
        produtos.add(new Produto("colar",19.99));
        produtos.add(new Produto("tênis",99.99));
        produtos.add(new Produto("camisa original",149.90));
        produtos.add(new Produto("meia",9.99));
        Collections.sort(produtos);
        for(Produto p : produtos){
            System.out.println(p.toString());
        }



    }
}
