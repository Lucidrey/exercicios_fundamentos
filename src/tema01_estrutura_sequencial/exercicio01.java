package tema01_estrutura_sequencial;

import java.util.Locale;
import java.util.Scanner;

/* Faça um programa para ler dois valores inteiros, e depois mostrar na tela a soma desses números com uma
mensagem explicativa, conforme exemplos. */

public class exercicio01 {
    public static void main (String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double valor01 = sc.nextDouble();
        double valor02 = sc.nextDouble();

        double soma = valor01 + valor02;

        System.out.printf("SOMA = %.2f%n", soma);

        sc.close();
    }
}
