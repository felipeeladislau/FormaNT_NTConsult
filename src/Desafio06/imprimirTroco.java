package Desafio06;




public class imprimirTroco {
    public static void imprimirTroco(double custo, double pagamento) {
        double troco = pagamento - custo;
        System.out.println("Valor do troco: R$" + troco);

        int[] notasMoedas = {100, 50, 20, 10, 5, 2, 1, 50, 25, 10, 5, 1};
        int[] quantidadeNotasMoedas = new int[notasMoedas.length];

        for (int i = 0; i < notasMoedas.length; i++) {
            quantidadeNotasMoedas[i] = (int) (troco / notasMoedas[i]);
            troco %= notasMoedas[i];
        }

        System.out.println("Troco em menor quantidade de notas e moedas possíveis:");
        for (int i = 0; i < notasMoedas.length; i++) {
            if (quantidadeNotasMoedas[i] > 0) {
                if (notasMoedas[i] >= 1) {
                    System.out.println(quantidadeNotasMoedas[i] + " nota(s) de R$" + notasMoedas[i]);
                } else {
                    System.out.println(quantidadeNotasMoedas[i] + " moeda(s) de R$" + notasMoedas[i]);
                }
            }
        }
    }
}