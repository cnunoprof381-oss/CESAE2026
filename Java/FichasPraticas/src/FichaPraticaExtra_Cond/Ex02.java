package FichaPraticaExtra_Cond;

import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean exit = false;
        while (!exit) {
            double peso = -1;
            while (peso < 0) {
                System.out.print("Insira o seu peso em KG: ");
                peso = input.nextDouble();
            }
            System.out.println("O seu peso na lua é: " + (peso*0.16) + "kg");
            exit = true;
        }
    }
}
