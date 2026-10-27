package FichaPratica2;

import java.util.Scanner;

public class Ex11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double saldo, montante;
        System.out.print("Introduza o saldo da sua conta bancaria: ");
        saldo = input.nextDouble();
        System.out.print("Introduza um valor: ");
        montante = input.nextDouble();
        if(montante > 0){
            System.out.print("Voce vai receber" + montante + " para um valor total de: " + (montante + saldo) + " €");
        }else if(saldo + montante < 0){
            System.out.print("Credito insuficiente");
        }else{
            System.out.print("O seu saldo agora é: " + (saldo + montante) + " €");
        }


    }
}
