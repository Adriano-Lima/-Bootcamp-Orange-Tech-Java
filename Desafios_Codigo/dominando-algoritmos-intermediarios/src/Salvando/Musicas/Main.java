package Salvando.Musicas;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        String arquivoDoPc = leitor.next();

       if(arquivoDoPc.endsWith(".mp3")){
           System.out.println("Salvar");
       } else {
           System.out.println("Deletar" );
       }
    }
}
