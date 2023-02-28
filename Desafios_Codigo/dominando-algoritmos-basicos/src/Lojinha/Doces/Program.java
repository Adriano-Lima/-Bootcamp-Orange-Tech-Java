package Lojinha.Doces;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int dinheiro = leitor.nextInt();
        System.out.println("O cliente obteve "+dinheiro*2+" doces");
    }
}