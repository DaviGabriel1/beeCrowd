package interfatec.mdc;

import java.util.Scanner;
public class MaximoDivisorComum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        int mdc = 1;
        do{
            for(int i = 1;i<10;i++){
                if(num1%i==0 && num2%i!=0){
                    num1/=i;
                }
                else if(num1%i!=0 && num2%i==0){
                    num2/=i;
                }
                else if(num1%i==0 && num2%i==0){
                    mdc*=i;
                    num1/=i;
                    num2/=i;
                }
            }
        }while(num1!=1 || num2!=1);
        System.out.println(mdc);
    }
}
