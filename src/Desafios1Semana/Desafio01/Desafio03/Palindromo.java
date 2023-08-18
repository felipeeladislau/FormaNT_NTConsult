package Desafios1Semana.Desafio01.Desafio03;

public class Palindromo {
    public boolean analisarPalindromo(String texto) {
        texto = texto.replaceAll("\\s+", "").toLowerCase();

        // Verifica se o texto é igual ao seu inverso
        return texto.equals(new StringBuilder(texto).reverse().toString());
    }
}
