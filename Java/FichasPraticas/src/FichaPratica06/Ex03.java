package FichaPratica06;

public class Ex03 {
    public static boolean parImpar(int a){
        if(a % 2 == 0) return true;
        else return false;
    }

    public static boolean posNeg(int a){
        return (a >=0);
    }

    public static boolean numeroPrimo(int a){

        boolean primo = true;

        for(int i = 2; i < a; i++){
            if(a % i == 0){
                primo = false;
            }
        }
        return primo;
    }

    public static boolean numeroPerfeito(int a){

        boolean perfeito = false;
        int soma = 0;

        for(int i = 1; i < a; i++){
            if(a % i == 0){
                soma+=i;
            }
        }
        return soma == a;
    }
    public static boolean triangular(int a){

        boolean tri = false;
        int soma = 0;

        for(int i = 0; soma <= a; i++){
            soma += i;
            if(soma == a){
                tri = true;
            }
        }
        return tri;
    }
}
