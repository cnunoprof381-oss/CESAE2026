package FichaPratica07;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Ex08 {
    public static void main(String[] args){
        try{
            File file = new File("src/Files/exercicio_08.csv");
            Scanner sc = new Scanner(file);
            sc.nextLine();
            double qtd, valor, total = 0;
            String produtoTipo, produto;
            while(sc.hasNext()){
                String line = sc.nextLine();
                String[] split = line.split(",");
                produtoTipo = split[0];
                produto = split[1];
                qtd = Double.parseDouble(split[2]);
                valor = Double.parseDouble(split[3]);
                total += Double.parseDouble(split[2]) * Double.parseDouble(split[3]);
                System.out.println(produtoTipo + ", " + produto + " " + qtd + " " + valor + " " + total);
            }
        }catch(FileNotFoundException exc){
            System.out.println("File not found.");
        }

    }
}
