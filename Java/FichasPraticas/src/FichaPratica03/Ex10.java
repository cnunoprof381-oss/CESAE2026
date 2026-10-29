package FichaPratica03;

import java.util.Scanner;

public class Ex10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = 0, inicial;
        System.out.print("Introduza um numero: ");
        num = input.nextInt();

        for (inicial = 2; num >= inicial; inicial++) {
            if(inicial % 2 == 0){
                System.out.println(inicial);
            }

        }

    }
}