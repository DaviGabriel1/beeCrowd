package String.loianegroner;

public class Aula75 {
    public static void main(String[] args) {
        String vazia = new String(); //""
        System.out.println(vazia);

        String java = new String("JAVA");
        System.out.println(java);

        String java1 = new String(java);
        System.out.println(java1);

        char[] cadeiaChar = {'J','A','V','A'};
        String java2 = new String(cadeiaChar);
        System.out.println(java2);

        char[] abcdef = {'A','B','C','D','E','F'};
        String abc = new String(abcdef,0,3);
        System.out.println(abc);

        byte[] ascii = {65,66,67,68,69};
        String abcde = new String(ascii);
        System.out.println(abcde);

        String bcd = new String(ascii,1,3);
        System.out.println(bcd);

        String java3 = "JAVA";

        //quando criamos instancia da String (new), cada String
        // ocupará um espaço diferente na memória, ou seja, não serão iguais (ids diferentes), apenas os valores
        // mas quando atribui diretamente (linha 29) todas as variaveis com os mesmo valores serao iguais (incluindo maiusculos e minusculos)
    }
}
