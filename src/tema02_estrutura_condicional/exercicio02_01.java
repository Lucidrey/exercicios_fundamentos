package tema02_estrutura_condicional;

import java.util.Locale;
import java.util.Scanner;

/*Fazer um programa para ler um número inteiro, e depois dizer se este número é negativo ou não.*/

public class exercicio02_01 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int numero = sc.nextInt();

        if (numero < 0) {
            System.out.print("NEGATIVO");
        } else {
            System.out.print("NÃO NEGATIVO");
        }

        sc.close();
    }
}
