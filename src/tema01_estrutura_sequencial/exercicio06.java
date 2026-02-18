package tema01_estrutura_sequencial;

import java.util.Locale;
import java.util.Scanner;

/*
Fazer um programa que leia três valores com ponto flutuante de dupla precisão: A, B e C. Em seguida, calcule e
mostre:
a) a área do triângulo retângulo que tem A por base e C por altura.
b) a área do círculo de raio C. (pi = 3.14159)
c) a área do trapézio que tem A e B por bases e C por altura.
d) a área do quadrado que tem lado B.
e) a área do retângulo que tem lados A e B.
 */

public class exercicio06 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        //Valores

        double A = sc.nextDouble();
        double B = sc.nextDouble();
        double C = sc.nextDouble();

        //Calculos

        double areaDoTriangulo = 0.5 * A * C;
        double areaDoCiruculo = 3.1415 * Math.pow(C, 2);
        double areaDoTrapezio = (A + B) * C/2;
        double areaDoQuadrado = Math.pow(B, 2);
        double areaDoRetangulo = A * B;

        //Saídas

        System.out.println("A área do triângulo retângulo que tem A por base e C por altura é = " + areaDoTriangulo);
        System.out.printf("A área do círculo de raio C é = %.2f%n", areaDoCiruculo);
        System.out.println("A área do trapézio que tem A e B por bases e C por altura é = " + areaDoTrapezio);
        System.out.println("A área do quadrado que tem lado B é = " + areaDoQuadrado);
        System.out.println("A área do retângulo que tem lados A e B é = " + areaDoRetangulo);

        sc.close();
    }
}
