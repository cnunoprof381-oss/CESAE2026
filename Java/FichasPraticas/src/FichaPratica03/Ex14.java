package FichaPratica03;

import java.util.Scanner;

public class Ex14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int qtd, num, last;
        boolean crescente = true;
        System.out.print("Insira o numero de repeticoes: ");
        qtd = input.nextInt();
        last = 0;
        num = 0;
        for(int i = 0; i < qtd; i++){
            last = num;
            System.out.println("Insira um numero: ");
            num = input.nextInt();
            if(num < last)
            {
                crescente = false;
            }

        }
        if(crescente){
            System.out.println("Ordem crescente");
        }
        else
            System.out.println("Ordem não crescente");
    }
}