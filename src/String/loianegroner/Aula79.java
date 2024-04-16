package String.loianegroner;



public class Aula79 {
    public static void main(String[] args) {
        String banana = "banana";
        String ana = "ana";
        System.out.println(banana.indexOf("x")); //retorna -1 pois não tem x
        System.out.println(banana.indexOf("b")); //retorna apenas a primeira vez que aparece
        System.out.println(banana.indexOf("a"));
        System.out.println(banana.indexOf(ana));
        System.out.println(banana.lastIndexOf("a"));//mostra a ultima vez que aparece
        System.out.println();

        System.out.println(banana.contains(ana));
        System.out.println(banana.contains("ceu"));

        System.out.println();
    }
}
