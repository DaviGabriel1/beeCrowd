package String.loianegroner;

public class Aula78 {
    public static void main(String[] args) {
        String ola = "Ola";
        String ola2 = "OLA";
        String ola3 = "Ola";
        String ola4 = new String(ola);

        System.out.println("ola equals ola2 : "+ ola.equals(ola2));
        System.out.println("ola equals ola3 : "+ ola.equals(ola3));
        System.out.println("ola == ola2 : "+ (ola == ola2)); //compara os IDs, como n tem instancia a referencia de memória será a mesma
        System.out.println("ola == ola3 : "+ (ola == ola3));
        System.out.println("ola == ola4 : "+ (ola == ola4));
        System.out.println("ola equals ola4 : "+ola.equals(ola4));
        //equals compara valor, "==" compara referencia

        String banana = "banana";
        String ban = "ban";
        String ana = "ana";
        System.out.println(banana.regionMatches(1,ana,0,3)); //compara a partir do index 1 se há a String ana(length 3)
        System.out.println(banana.regionMatches(3,ana,0,3));
        System.out.println(banana.regionMatches(2,ana,1,2)); //vê se tem "na" a partir do index 2
        System.out.println(banana.regionMatches(true,1,ana,0,3)); // o true seria um "equalsIgnoreCase()"
        System.out.println();

        System.out.println(banana.startsWith(ban));
        System.out.println(banana.endsWith(ana));
        System.out.println();

        String a = "a";
        String b = "b";
        String aMaisculo = "A";
        System.out.println(a.compareTo(b)); //pode ser usado para comparar objetos a>b => -1/a==b => 0/a<b => 1 ou mais
        System.out.println(b.compareTo(a));
        System.out.println(a.compareTo(a));
        System.out.println(a.compareTo(aMaisculo)); //mostra a diferença na tabela ASCII
    }
}
