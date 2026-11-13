package FichaPratica07;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Ex09 {

    public static String[][] getInfo(String path){
        String[][] matriz = new String[getLineNum(path)][4];
        try{
           File file = new File(path);
           Scanner sc = new Scanner(file);
           sc.nextLine();
           int counter = 0;
           while(sc.hasNext()){
               String line = sc.nextLine();
               String[] split = line.split(",");
               for(int i = 0; i < split.length; i++){
                   matriz[counter][i] = split[i];
               }
               counter++;
           }
           for(int i = 0; i < matriz.length; i++){
               for(int j = 0; j < 4; j++){
                   System.out.print(matriz[i][j] + " ");
               }
               System.out.println();
           }

       }catch(FileNotFoundException exc){
           System.out.println("File not found");
       }
        return matriz;

    }

    public static int getLineNum(String path){
        int n = 0;
        try{
            File file = new File(path);
            Scanner sc = new Scanner(file);
            sc.nextLine();
            while(sc.hasNext()){
                sc.nextLine();
                n++;
            }


        }catch(FileNotFoundException exc){
            System.out.println("File not found.");
        }
        return n;
    }

    public static void getCategory(String[][] a) {
        Scanner input = new Scanner(System.in);
        boolean musicaDoGeneroCerto=false;

        System.out.print("Select the genre you wish to look for: ");
        String opcao = input.nextLine();
        for(int i = 0; i < a.length; i++){
            for(int j = 0; j < a[0].length; j++){
                if(opcao.equalsIgnoreCase(a[i][2])){
                    musicaDoGeneroCerto=true;
                    System.out.print(a[i][j] + " ");
                }
            }
            if(musicaDoGeneroCerto){
                System.out.println();
            }

            musicaDoGeneroCerto=false;

        }
    }

    public static void getArtist(String[][] a) {
        Scanner input = new Scanner(System.in);
        boolean musicaDoArtistaCerto=false;

        System.out.print("Select the genre you wish to look for: ");
        String opcao = input.nextLine();
        for(int i = 0; i < a.length; i++){
            for(int j = 0; j < a[0].length; j++){
                if(opcao.equalsIgnoreCase(a[i][1])){
                    musicaDoArtistaCerto=true;
                    System.out.print(a[i][j] + " ");
                }
            }
            if(musicaDoArtistaCerto){
                System.out.println();
            }
            musicaDoArtistaCerto=false;

        }
    }

    public static void main(String[] args) {
        String[][] music = getInfo("src/Files/exercicio_09.csv");
        getCategory(music);
        getArtist(music);
    }
}
