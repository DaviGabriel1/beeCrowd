package String.loianegroner;

public class Aula83 {
    public static void main(String[] args) {
        //o StringBuffer é a melhor forma de fazer concatenação de Strings, pois tem uma mehor performace
        String[] letras = {"B","C","D","E","F"};
        String alfabeto = "";

        for(String letra : letras){ //ESSE MODO TEM PERDA DE PERFORMACE
            alfabeto +=letra;
        }
        System.out.println(alfabeto);

        StringBuffer sb = new StringBuffer();
        for(String letra : letras){ //MELHOR PERFORMACE
            sb.append(letra);
        }
        alfabeto = sb.toString();
        System.out.println(alfabeto);
        System.out.println(sb.reverse());
        System.out.println();
        StringBuilder sb_ = new StringBuilder();
        for(String letra : letras){ //MELHOR PERFORMACE
            sb_.append(letra);
        }
        System.out.println(sb_.toString());

        //TODO A DIFERENÇA ENTRE STRINGBUILDER E STRING BUFFER É SUA AÇÃO EM THREADS, SE FOR EM THREAD: STRINGBUFFER, JÁ QUE O STRINGBUILDER NÃO É THREAD SAFE E PODE CAUSAR ERRO SE OS MÉTODOS NÃO ESTAREM SINCRONIZADOS


    }
}
