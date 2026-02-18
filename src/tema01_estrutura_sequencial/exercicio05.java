package tema01_estrutura_sequencial;

import java.util.Locale;
import java.util.Scanner;

/*
Fazer um programa para ler o código de uma peça 1, o número de peças 1, o valor unitário de cada peça 1, o
código de uma peça 2, o número de peças 2 e o valor unitário de cada peça 2. Calcule e mostre o valor a ser pago.
 */

public class exercicio05 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        //Peça 1

        int codigoPeca1 = sc.nextInt();
        int numerosDePecas1 = sc.nextInt();
        double valorUnitarioPeca1 = sc.nextDouble();

        //Peça 2

        int codigoPeca2 = sc.nextInt();
        int numerosDePecas2 = sc.nextInt();
        double valorUnitarioPeca2 = sc.nextDouble();

        //Preço a pagar

        double pago = (double) (numerosDePecas1 * valorUnitarioPeca1) + (numerosDePecas2 * valorUnitarioPeca2);

        System.out.printf("Valor a pagar: %.2f%n", pago);

        sc.close();
    }
}
