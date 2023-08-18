package Desafios1Semana.Desafio01.Desafio05;

public class MatrizIdentidade {

    public static int[][] gerarMatrizIdentidade(int numero) {
        int[][] matrizIdentidade = new int[numero][numero];

        for (int i = 0; i < numero; i++) {
            for (int j = 0; j < numero; j++) {
                if (i == j) {
                    matrizIdentidade[i][j] = 1;
                } else {
                    matrizIdentidade[i][j] = 0;
                }
            }
        }

        return matrizIdentidade;
    }

    public static void main(String[] args) {
        int numero = 3;
        int[][] matrizIdentidade = gerarMatrizIdentidade(numero);

        System.out.println("Número: " + numero);
        System.out.println("Matriz:");

        for (int i = 0; i < numero; i++) {
            for (int j = 0; j < numero; j++) {
                System.out.print(matrizIdentidade[i][j] + "    ");
            }
            System.out.println();
        }
    }
}