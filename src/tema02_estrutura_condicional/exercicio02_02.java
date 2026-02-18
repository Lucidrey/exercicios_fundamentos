package tema02_estrutura_condicional;

import java.util.Locale;
import java.util.Scanner;

/*
Fazer um programa para ler um número inteiro e dizer se este número é par ou ímpar.
 */

public class exercicio02_02 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int numero = sc.nextInt();

        if ( numero % 2 == 0) {
            System.out.print("NÚMERO PAR");
        } else {
            System.out.print("NÚMERO IMPAR");
        }

        sc.close();
    }
}
