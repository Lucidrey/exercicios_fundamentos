package tema04_estrutura_for;

import java.util.Locale;
import java.util.Scanner;

/*
Ler um número inteiro N e calcular todos os seus divisores.
 */

public class exercicio04_06 {
    public static void main(String[] agrs) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();

        for (int i=1; i<=x; i++) {

            if (x % i == 0) {
                System.out.println(i);
            }
        }
        sc.close();
    }
}
