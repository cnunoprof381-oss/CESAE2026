package FichaPratica06;

import java.util.Scanner;

import static FichaPratica06.Ex05.*;

public class Ex06 {

    public static int[] createArray(){

        Scanner input = new Scanner(System.in);
        int a;
        System.out.println("Insira o tamanho do array: ");
        a = input.nextInt();
        int[] array = new int[a];

        for (int i = 0; i < array.length; i++) {
            System.out.println("Insira um valor: ");
            array[i] = input.nextInt();
        }
        return array;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int opcao;
        int[] array = createArray();

        do {
            System.out.println("Selecione uma opçâo:\n1. Maior Elemento\n2.Menor Elemento\n3.Crescente ou não Crescente\n4.Trocar de array");
            opcao = input.nextInt();
            switch (opcao) {
                case 1:
                    System.out.println(arrayMax(array));
                    break;
                case 2:
                    System.out.println(arrayMin(array));
                    break;
                case 3:
                    if (arrayCres(array)) System.out.println("O array é crescente");
                    else System.out.println("O array não é crescente");
                    break;
                case 4:
                    array = createArray();
                    break;
                case 0:
                    System.out.println("Até à proxima!!!");
                    break;
                default:
                    System.out.println("Insere uma opção valida");
            }
        } while (opcao != 0);
    }
}
