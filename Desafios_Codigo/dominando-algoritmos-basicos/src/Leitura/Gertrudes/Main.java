package Leitura.Gertrudes;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int paginas = leitor.nextInt();
        int paginasLidasPorDia = 3;
        // caso o numero de paginas for multpilo de 3, temos uma divisao exata
        //caso nao, por exmplo 10, teremos (10/3) + (10%3) -> 3 +1 -> 4 dias
        int resultado = (paginas/paginasLidasPorDia) + (paginas%paginasLidasPorDia);
        System.out.println(resultado + " dias");
    }
}
