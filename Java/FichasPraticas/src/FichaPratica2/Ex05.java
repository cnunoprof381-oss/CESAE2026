package FichaPratica2;

import java.util.Scanner;

public class Ex05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double A, B;
        System.out.print("Introduza dois numeros: ");
        A = input.nextDouble();
        B = input.nextDouble();

        if(A > B){
            System.out.print(B + " " + A);
            System.out.print("\n" + A + " " + B);
        }
        else{
            System.out.println(A + " " + B);
            System.out.print("\n" + B + " " + A);
        }
    }
}
