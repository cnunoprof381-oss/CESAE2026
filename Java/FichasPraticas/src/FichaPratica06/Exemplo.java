package FichaPratica06;

public class Exemplo {

    public static void main(String[] args) {

        System.out.println(diferenca(1,2));

    }
    public static int diferenca(int a, int b){
        int resultado;
        if(a > b){
            resultado = a - b;
        }
        if(b > a){
            resultado = b - a;
        }
        else resultado = 0;
        return resultado;
    }
}
