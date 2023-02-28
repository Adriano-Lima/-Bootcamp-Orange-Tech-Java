package Download.Pacotes;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int tamanho = leitor.nextInt();
        var output = "";
        for (var i = 0; i < tamanho ; i++) {
            output +="/";
        }
        System.out.println(output);
    }
}
