package FichaPratica2;

import java.util.Scanner;

public class Ex08 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double nota1, nota2, nota3, mediaPonderada;
        System.out.print("Indique 3 notas: ");
        nota1 = input.nextDouble();
        nota2 = input.nextDouble();
        nota3 = input.nextDouble();
        if (nota1 > 20.0 || nota2 > 20.0 || nota3 > 20.0) {
            System.out.println("Erro a nota é de 0-20!");
        } else {

            mediaPonderada = nota1 * 0.25 + nota2 * 0.35 + nota3 * 0.40;
            System.out.println("A media do aluno é: " + mediaPonderada);
            if (mediaPonderada > 9.5) {
                System.out.println("O aluno foi aprovado!");
            } else {
                System.out.println("O aluno reprovou!");
            }
        }
    }

}
