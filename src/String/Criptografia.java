package String;

import java.util.Scanner;

public class Criptografia {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String senha = scan.nextLine();
        String[] novaSenha = senha.split("");
        byte[] letraASCII = new byte[senha.length()];
        senha.getBytes(0,senha.length(),letraASCII,0);
        for(int i = 0 ;i<senha.length();i++){
            if(letraASCII[i]>64 && letraASCII[i]<91 || letraASCII[i]>96 && letraASCII[i]<123){
                char novaLetra= (char) (letraASCII[i]+=3);
                novaSenha[i] = String.valueOf(novaLetra);
            }
        }
        StringBuffer senhaNew = new StringBuffer();
        for(int i =0; i <novaSenha.length;i++){
            senhaNew.append(novaSenha[i]);
        }
        senhaNew.reverse();
        System.out.println(senhaNew);
        senhaNew.toString().getBytes(senhaNew.length()/2,senhaNew.length(),letraASCII,0);
        novaSenha = senhaNew.toString().split("");
        for(int i = senhaNew.length()/2 ;i<senhaNew.length();i++){
                char novaLetra= (char) (letraASCII[i]--);
                novaSenha[i] = String.valueOf(novaLetra);
            }
        for(int j = 0; j<senhaNew.length();j++){
            System.out.print(novaSenha[j]);
        }

    }
}
