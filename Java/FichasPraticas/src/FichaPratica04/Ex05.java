package FichaPratica04;

import java.util.Scanner;

public class Ex05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int opcao;
        boolean perms = true;
        while(perms){
            System.out.print("Escolha a opção que deseja:\n1. Criar\n2. Atualizar\n3. Eliminar\n4. Sair\n");
            opcao = input.nextInt();
            switch(opcao){
                case 1:
                    System.out.println("Criar\n");
                    break;
                case 2:
                    System.out.println("Atualizar\n");
                    break;
                case 3:
                    System.out.println("Eliminar\n");
                    break;
                case 4:
                    perms = false;
                    break;
                default:
                    System.out.println("Opção invalida");
            }
        }
    }
}
