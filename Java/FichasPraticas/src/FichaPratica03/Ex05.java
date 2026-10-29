package FichaPratica03;

import java.util.Scanner;

public class Ex05 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in); // Scanner creation

        // Variavels
        int num = 0;
        String mensagem = "";

        // input reading
        System.out.print("Escreva uma mensagem: ");
        mensagem = input.nextLine();
        System.out.print("Introduza o numero de vezes que voce quer que a mensagem se repita: ");
        num = input.nextInt();

        // loop
        for(int i = 0; i < num; i++) System.out.println(mensagem);

    }
}
