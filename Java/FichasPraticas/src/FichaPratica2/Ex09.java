package FichaPratica2;

import java.util.Scanner;

public class Ex09 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int A, B, C;
        System.out.print("Introduza três numeros: ");
        A = input.nextInt();
        B = input.nextInt();
        C = input.nextInt();

      if(A < B && A < C){
          System.out.println("O menor numero é o: " + A);
      }
      else if(B < A && B < C){
          System.out.println("O menor numero é o: " + B);
      }
      else{
          System.out.println("O menor numero é o: " + C);
      }
    }
}
