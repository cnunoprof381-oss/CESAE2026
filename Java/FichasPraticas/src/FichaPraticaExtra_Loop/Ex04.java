package FichaPraticaExtra_Loop;

public class Ex04 {
    public static void main(String[] args) {
        for (int i = 0; i <= 4; i++) {
            for (int j = 0; j < 12; j++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }

        System.out.println("\n_________________________________________\n");
        for (int i = 0; i <= 5; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }

        System.out.println("\n_________________________________________\n");

        for (int linha = 0; linha <= 5; linha++) {
            for (int espaco = 5-linha; espaco >= 0; espaco--) {
                System.out.print(" ");
            }

            for (int ast = 0; ast < linha * 2 + 1; ast++) {

                System.out.print("*");

            }
            System.out.print("\n");
        }
    }
}

