package FichaPratica2;

import java.util.Scanner;

public class Ex07 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int numero = 0;
        System.out.print("Selecione um numero: ");
        numero = input.nextInt();
        numero = numero % 2;
        if(numero == 0){
            System.out.println("O numero é par!");
        }
        else{
            System.out.println("O numero é impar!");
        }
    }
}
