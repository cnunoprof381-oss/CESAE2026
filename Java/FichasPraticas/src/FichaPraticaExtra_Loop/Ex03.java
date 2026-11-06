package FichaPraticaExtra_Loop;

public class Ex03 {
    public static void main(String[] args) {
        for(int i = 1 ; i < 11; i++){
            System.out.println("\nTabuada do " + i + ":");
            for(int j = 1; j <= 10; j++){
                System.out.println(i + " * " + j + " = " + (i*j));
            }
        }
    }
}
