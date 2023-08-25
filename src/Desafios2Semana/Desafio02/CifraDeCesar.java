package Desafios2Semana.Desafio02;


    import java.util.Scanner;

    public class CifraDeCesar {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Digite o texto: ");
            String texto = scanner.nextLine();

            System.out.print("Digite o número de deslocamento: ");
            int numeroDeslocamento = scanner.nextInt();

            System.out.print("Digite 1 para criptografar ou 2 para descriptografar: ");
            int opcao = scanner.nextInt();

            if (opcao == 1) {
                String textoCriptografado = criptografar(texto, numeroDeslocamento);
                System.out.println("Texto criptografado: " + textoCriptografado);
            } else if (opcao == 2) {
                String textoDescriptografado = descriptografar(texto, numeroDeslocamento);
                System.out.println("Texto descriptografado: " + textoDescriptografado);
            } else {
                System.out.println("Opção inválida!");
            }

            scanner.close();
        }

        public static String criptografar(String texto, int numeroDeslocamento) {
            StringBuilder textoCriptografado = new StringBuilder();

            for (int i = 0; i < texto.length(); i++) {
                char caractere = texto.charAt(i);

                if (Character.isLetter(caractere)) {
                    char novoCaractere = (char) (((int) caractere + numeroDeslocamento - 65) % 26 + 65);
                    textoCriptografado.append(novoCaractere);
                } else {
                    textoCriptografado.append(caractere);
                }
            }

            return textoCriptografado.toString();
        }

        public static String descriptografar(String texto, int numeroDeslocamento) {
            return criptografar(texto, 26 - numeroDeslocamento);
        }
    }

