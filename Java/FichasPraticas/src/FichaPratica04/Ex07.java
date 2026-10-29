package FichaPratica04;

import java.util.Scanner;

public class Ex07 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num, div;
        div = 0;
        System.out.println("Escolha um numero: ");
        num = input.nextInt();
        for(int i = 1; i <= num; i++){
            if(num % i == 0){
                div++;
            }
        }
        if(div == 2){
            System.out.println("É um numero primo.");
        }else{
            System.out.println("Não é numero primo.");
        }
    }
}
