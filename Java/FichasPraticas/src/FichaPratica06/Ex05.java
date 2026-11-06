package FichaPratica06;

public class Ex05 {
    public static int arrayMin(int[] a){
        int min = a[0];
        for(int i = 0; i < a.length; i++){
            if(a[i] < min){
                min = a[i];
            }
        }
        return min;
    }

    public static int arrayMax(int[] a){

        int max = a[0];
        for(int i = 0; i < a.length; i++){
            if(a[i] > max){
                max = a[i];
            }
        }
        return max;

    }
    public static boolean arrayCres(int[] a){
        boolean cres = false;
        for(int i = 1; i < a.length; i++){
            if(a[i - 1] < a[i]){
                cres = true;
            }
        }
        return cres;
    }
 }
