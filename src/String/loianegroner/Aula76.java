package String.loianegroner;

public class Aula76 {
    public static void main(String[] args) {
        String string2com2 =  "resultado de 2+2 = "+2+2;
        System.out.println(string2com2);

        String string2com2Certo =  "resultado de 2+2 = "+(2+2);
        System.out.println(string2com2Certo);

        String um = String.valueOf(1); // valueOf transforma valores em String
        System.out.println(um);

        String texto = "olá, ";
        texto += "pessoal";
        System.out.println(texto);
        //em java,as String são imutaveis, ou seja, quando alteramos com concatenação estamos criando outra
        //variavel em outro espaço na memória (id diferente)
    }
}
