package tema01_estrutura_sequencial;

import java.util.Locale;
import java.util.Scanner;

/*
Fazer um programa que leia o número de um funcionário, seu número de horas trabalhadas, o valor que recebe por
hora e calcula o salário desse funcionário. A seguir, mostre o número e o salário do funcionário, com duas casas
decimais.
 */

public class exercicio04 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double numeroFuncionario = sc.nextDouble();
        double horasTrabalhadas = sc.nextDouble();
        double valorPorHora = sc.nextDouble();

        double salario = horasTrabalhadas * valorPorHora;

        System.out.println("Número do funcionario: " + numeroFuncionario);
        System.out.printf("Seu salario é de: %.2f%n", salario);

        sc.close();
    }
}
