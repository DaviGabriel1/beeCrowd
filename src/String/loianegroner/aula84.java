package String.loianegroner;

import java.util.StringTokenizer;

public class aula84 {
    public static void main(String[] args) {
        String info = "1;antonio;30";
        StringTokenizer st = new StringTokenizer(info,";");

        while(st.hasMoreTokens()){
            System.out.println(st.nextToken());
        }
    }
}
