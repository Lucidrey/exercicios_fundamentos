package tema02_estrutura_condicional;

import java.util.Locale;
import java.util.Scanner;

/*
Leia a hora inicial e a hora final de um jogo. A seguir calcule a duração do jogo, sabendo que o mesmo pode
começar em um dia e terminar em outro, tendo uma duração mínima de 1 hora e máxima de 24 horas.
*/

public class exercicio02_04 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int horaInicial = sc.nextInt();
        int horaFinal = sc.nextInt();
        int duracao;

        if (horaInicial < horaFinal ) {
            duracao = horaInicial - horaFinal;
        }
        else {
            duracao = 24 - horaInicial + horaFinal;
        }
        System.out.print("Você jogou durante: " + duracao + " horas.");

        sc.close();
    }
}
