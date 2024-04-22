package estruturaDeDados.URI1068;
import java.util.Scanner;
import java.util.Stack;

public class URI1068 {
    public static void main(String[] args) {
        Stack<Character> letra = new Stack<>();
        Scanner scan = new Scanner(System.in);
        String expressao = scan.nextLine();
        for(int i = 0;i<expressao.length();i++){
            if(expressao.charAt(i) == '('){
                letra.add('(');
            }
            else if(expressao.charAt(i) == ')'){
                if(!letra.isEmpty()){
                    letra.pop();
                }
                else{
                    letra.add(')');
                }
            }
        }
        if(letra.isEmpty()){
            System.out.println("correct");
        }
        else{
            System.out.println("incorrect");
        }

    }
}
