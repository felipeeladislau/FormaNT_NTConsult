package Desafios2Semana.Desafio01;

import java.util.Scanner;

public class Fatorial {
    private static int anInt;

    public static void main(String[] args) {
        int numero;
        System.out.println("Bem-vindo a calculadora de fatorial");
        System.out.println("\nInforme o numero para calcular o fatorial:");
        Scanner scanner = new Scanner(System.in);
        numero = scanner.nextInt();
        long fatorial = 1;
        int i=1;
        while (i <= numero) {
            fatorial = fatorial*i;
            i++;
        }
        System.out.println("O fatorial de "+ numero+ "\nResultado: " + fatorial);
    }
}
