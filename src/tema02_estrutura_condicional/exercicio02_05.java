package tema02_estrutura_condicional;

import java.util.Locale;
import java.util.Scanner;

/*
Com base na tabela abaixo, escreva um programa que leia o código de um item e a quantidade deste item. A
seguir, calcule e mostre o valor da conta a pagar.
 */

public class exercicio02_05 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int codigo = sc.nextInt();
        int quantidade = sc.nextInt();
        double preco = 0;
        double total = preco * quantidade;

        switch (codigo) {
            case 1: preco = 4.00; break;
            case 2: preco = 4.50; break;
            case 3: preco = 5.00; break;
            case 4: preco = 2.00; break;
            case 5: preco = 1.50; break;
            default: System.out.print("Código inválido");
        }

        System.out.printf("Total: R$%.2f%n", total);

        sc.close();
    }
}
