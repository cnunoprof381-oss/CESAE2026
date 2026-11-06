package FichaPratica06;

import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String animal = "";
        System.out.println("Introduza o nome do animal: ");
        animal = input.next();
        fazerBarulho(animal);
    }

    public static void fazerBarulho(String animal){
        switch(animal.toLowerCase()){
            case "cão":
                System.out.print("Au au");
                break;
            case "gato":
                System.out.print("Miau");
                break;
            case "peixe":
                System.out.println("Glub Glub");
                break;
            case "vaca":
                System.out.println("Muuuu");
                break;
            case "porco":
                System.out.println("Oinc Oinc");
                break;
            default:
                System.out.println("Som não encontrado.");

        }

    }
}
