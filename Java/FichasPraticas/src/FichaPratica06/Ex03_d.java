package FichaPratica06;

import java.util.Scanner;

public class Ex03_d {

    public static boolean numeroPerfeito(int a){

        boolean perfeito = false;
        int soma = 0;

        for(int i = 1; i < a; i++){
            if(a % i == 0){
                soma+=i;
            }
        }
        return soma == a;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Insira um numero: ");
        int numero = input.nextInt();
        if(numeroPerfeito(numero))  System.out.print(numero + " é um numero perfeito.");
        else System.out.print(numero + " não é um numero perfeito");
    }
}
