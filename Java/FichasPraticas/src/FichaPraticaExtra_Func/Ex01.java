package FichaPraticaExtra_Func;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex01 {

    public static void numSmallestBiggest(int a, int b, int c){
       int[] array = new int[3];
       int smallest = Integer.MAX_VALUE;
       int biggest = Integer.MIN_VALUE;
       array[0] = a;
       array[1] = b;
       array[2] = c;
       for(int i = 0; i < 3; i++){
           if(array[i] < smallest){
               smallest = array[i];
           }
           if(array[i] > biggest){
               biggest = array[i];
           }
       }
        System.out.println(biggest + " " + smallest);
    }

    public static void mediaArit(){
        Scanner input = new Scanner(System.in);
        boolean exit = false;
        double soma = 0;
        double div = 0;
        double numero = 0;
        while(!exit){
            try{
                System.out.println("Introduza um numero: ");
                numero = input.nextInt();
                soma += numero;
                if(numero == 0){
                    exit = true;
                }else{
                    div++;
                }

            }catch(InputMismatchException exc){
                System.out.println("Insira um numero valido.");
            }
        }
        System.out.println(soma / div);

    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        numSmallestBiggest(3, 1 , 2);
        mediaArit();
    }
}


