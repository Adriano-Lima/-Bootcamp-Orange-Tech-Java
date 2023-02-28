package Camarote.BlueColdIceCubes;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int tamanhoDaFila = leitor.nextInt();
        int pessoasNoCamarote = 0;
        for (var i = 1; i <=tamanhoDaFila ; i++) {
            if(i%2 != 0)
                pessoasNoCamarote++;
        }
        System.out.println(pessoasNoCamarote+" pessoas no camarote");
    }
}
