package Desafios2Semana.Desafio03;

import java.util.Scanner;

public class Vigenere {
    private static String texto;
    private static String chave;
    private static int opcao;

    public static String cifraVigenere(String texto, String chave, int opcao) {
        Vigenere.texto = texto;
        Vigenere.chave = chave;
        Vigenere.opcao = opcao;
        String alfabeto = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        int tamanhoChave = chave.length();
        StringBuilder resultado = new StringBuilder();

        for (int i = 0; i < texto.length(); i++) {
            char letra = texto.charAt(i);
            if (!Character.isLetter(letra)) {
                resultado.append(letra);
                continue;
            }

            int indiceLetra = alfabeto.indexOf(Character.toUpperCase(letra));
            int indiceChave = alfabeto.indexOf(Character.toUpperCase(chave.charAt(i % tamanhoChave)));

            int indiceResultado;
            if (opcao == 1) {  // Criptografar
                indiceResultado = (indiceLetra + indiceChave) % alfabeto.length();
            } else {  // Descriptografar
                indiceResultado = (indiceLetra - indiceChave + alfabeto.length()) % alfabeto.length();
            }

            if (Character.isUpperCase(letra)) {
                resultado.append(alfabeto.charAt(indiceResultado));
            } else {
                resultado.append(Character.toLowerCase(alfabeto.charAt(indiceResultado)));
            }
        }

        return resultado.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o texto: ");
        String texto = scanner.nextLine();

        System.out.print("Digite a palavra chave: ");
        String chave = scanner.nextLine();

        System.out.print("Digite 1 para criptografar ou 2 para descriptografar: ");
        int opcao = scanner.nextInt();

        String resultado = cifraVigenere(texto, chave, opcao);
        System.out.println("Resultado: " + resultado);
    }}