package Desafio03;

import Desafio03.Palindromo;

import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean desejaContinuar = true;

        while (desejaContinuar){
        System.out.println("Digite uma palavra:");
        String texto = scanner.nextLine();

        Palindromo palindromo = new Palindromo();
        boolean resultado = palindromo.analisarPalindromo(texto);

        if (resultado) {
            System.out.println("O texto é um palíndromo!");
        } else {
            System.out.println("O texto não é um palíndromo.");
        }

        System.out.println("Deseja continuar? (S/N)");
        String opcao = scanner.nextLine();

        if (!opcao.equalsIgnoreCase("S")) {
            desejaContinuar = false;
        }}
        scanner.close();
    }

}
