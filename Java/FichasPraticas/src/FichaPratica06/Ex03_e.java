package FichaPratica06;

import java.util.Scanner;

public class Ex03_e {
    public static boolean triangular(int a){

        boolean tri = false;
        int soma = 0;

        for(int i = 0; soma <= a; i++){
            soma += i;
            if(soma == a){
                tri = true;
            }
        }
        return tri;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Insira um numero: ");
        int numero = input.nextInt();
        if(triangular(numero)) System.out.print(numero + " é um numero triangular");
        else System.out.print(numero + " não é um numero triangular");

    }
}
