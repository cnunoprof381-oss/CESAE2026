package FichaPratica2;

import java.util.Scanner;

public class Ex12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1;
        System.out.print("Selecione das seguintes opções:\n1. Criar\n2. Atualizar\n3. Eliminar\n4. Sair\n\n");
        num1 = input.nextInt();


        switch(num1){
            case 1:
                System.out.print("Voce escolheu a opção Criar.");
                break;
            case 2:
                System.out.print("Voce escolheu a opção Atualizar.");
                break;
            case 3:
                System.out.print("Voce escolheu a opção Eliminar.");
                break;
            case 4:
                break;
            default:
                System.out.print("Operação invalida.");

        }
    }
}
