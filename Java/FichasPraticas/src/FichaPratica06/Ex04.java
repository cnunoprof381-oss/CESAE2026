package FichaPratica06;

import java.util.Scanner;

import static FichaPratica06.Ex03.*;

public class Ex04 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numero = 0, opcao = 0;
        while(numero != -1){
            System.out.print("Insira um numero: ");
            numero = input.nextInt();
            do{
                System.out.println("Selecione uma opçâo:\n1. Par ou Impar\n2.Pos ou Neg\n3.Primo\n4.Perfeito\n5.Triangular\n6.Trocar de numero");
                opcao = input.nextInt();
                switch(opcao){
                    case 1:
                        if(posNeg(numero)) System.out.println(numero + " é positivo");
                        else System.out.println(numero + " é negativo");
                        break;
                    case 2:
                        if(parImpar(numero)) System.out.println(numero + " é par");
                        else System.out.println(numero + " é impar");
                        break;
                    case 3:
                        if(numeroPrimo(numero)) System.out.println(numero + " é primo");
                        else System.out.println(numero + " não é primo");
                        break;
                    case 4:
                        if(numeroPerfeito(numero)) System.out.println(numero + " é perfeito");
                        else System.out.println(numero + " não é perfeito");
                        break;
                    case 5:
                        if(triangular(numero)) System.out.println(numero + " é triangular");
                        else System.out.println(numero + " não é triangular");
                        break;
                    case 6:
                        break;
                }
            }while(opcao != 6);

        }
        System.out.println("insira um numero");
        numero = input.nextInt();

    }
}
