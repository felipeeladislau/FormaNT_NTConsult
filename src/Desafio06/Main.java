import java.text.DecimalFormat;

public class Main {
    public static void calcularTroco(double custo, double pagamento) {
        double troco = pagamento - custo;
        DecimalFormat df = new DecimalFormat("#0.00");

        System.out.println("Valor do troco: R$" + df.format(troco));
        System.out.println("Menor troco possível:");

        int[] notas = {100, 50, 20, 10, 5, 2, 1};
        double[] moedas = {0.5, 0.25, 0.1, 0.05, 0.01};

        for (int nota : notas) {
            int quantidade = (int) (troco / nota);
            troco %= nota;
            if (quantidade > 0) {
                System.out.println(quantidade + " - nota de " + nota);
            }
        }

        for (double moeda : moedas) {
            int quantidade = (int) (troco / moeda);
            troco %= moeda;
            if (quantidade > 0) {
                System.out.println(quantidade + " - moeda de " + df.format(moeda));
            }
        }
    }

    public static void main(String[] args) {
        calcularTroco(17.35, 20.00);
    }
}