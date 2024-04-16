package String.loianegroner;

public class Aula80 {
    public static void main(String[] args) {
        String teste = "isso é um teste...";
        System.out.println(teste);
        System.out.println(teste.substring(10,15)); //imprime a partir do index 10 da String teste
        System.out.println();

        String ola = "ola ";
        String mundo = "mundo";
        System.out.println(ola.concat(mundo));
        System.out.println();

        String espaco = "i s p a ç o";
        System.out.println(espaco);
        String espacoCorrig = espaco.replace("i","e");
        System.out.println(espacoCorrig);
        String semEspaco = espacoCorrig.replaceAll(" ","");
        System.out.println(semEspaco);
        System.out.println();

        String nome = " meu nome é: ";
        System.out.println(nome);
        System.out.println(nome.trim());//retira os espaços em branco antes e dps dos caracteres


    }
}
