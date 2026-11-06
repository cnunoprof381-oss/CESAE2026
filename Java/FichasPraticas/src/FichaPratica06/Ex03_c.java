package FichaPratica06;

import java.util.Scanner;

public class Ex03_c {

    public static boolean numeroPrimo(int a){

        boolean primo = true;

        for(int i = 2; i < a; i++){
            if(a % i == 0){
                primo = false;
            }
        }
        return primo;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Insira um numero: ");
        int numero = input.nextInt();
        if(numeroPrimo(numero)) System.out.println("O numero é primo");
        else System.out.println("O numero não é primo");
    }
}
