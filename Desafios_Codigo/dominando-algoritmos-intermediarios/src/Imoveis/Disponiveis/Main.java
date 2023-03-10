package Imoveis.Disponiveis;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        String frase = leitor.nextLine();
        String array[] = new String[3];
        array = frase.split("/");
        System.out.printf( "Imovel: %s R$%s %s\n",array[0],array[1],array[2] );
        leitor.close();
    }
}
