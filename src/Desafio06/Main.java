import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor do custo: R$");
        double custo = scanner.nextDouble();

        System.out.print("Digite o valor do pagamento: R$");
        double pagamento = scanner.nextDouble();

        double troco = pagamento - custo;
        System.out.println("Valor do troco: R$" + formatarValor(troco));

        int[] notas = {200, 100, 50, 20, 10, 5, 2};
        int[] moedas = {100, 50, 25, 10, 5, 1};

        System.out.println("Menor troco possível:");

        for (int nota : notas) {
            int quantidadeNotas = (int) (troco / nota);
            if (quantidadeNotas > 0) {
                System.out.println(quantidadeNotas + " - nota(s) de R$" + formatarValor(nota / 100.0));
                troco %= nota;
            }
        }

        for (int moeda : moedas) {
            int quantidadeMoedas = (int) (troco * 100 / moeda);
            if (quantidadeMoedas > 0) {
                System.out.println(quantidadeMoedas + " - moeda(s) de R$" + formatarValor(moeda / 100.0));
                troco %= (moeda / 100.0);
            }
        }
        scanner.close();
    }

    private static String formatarValor(double valor) {
        DecimalFormat decimalFormat = new DecimalFormat("#,##0.00");
        return decimalFormat.format(valor);
    }
}