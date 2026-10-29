package FichaPratica03;

import java.util.Scanner;

public class Ex11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int limite, salto;
        System.out.print("Insira um numero limite: ");
        limite = input.nextInt();
        System.out.print("Insira um numero: ");
        salto = input.nextInt();
        for (int i = 0; i < limite; i++) {
            if(i % salto == 0){
                System.out.println(i);
            }
        }
    }
}