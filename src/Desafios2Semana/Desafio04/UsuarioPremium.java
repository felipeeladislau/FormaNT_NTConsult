package Desafios2Semana.Desafio04;

public class UsuarioPremium implements Usuario {
    @Override
    public double getValorDesconto(double valorProduto) {

        if (valorProduto > 200) {
            return valorProduto * 0.30;
        } else {
            return 0;
        }
    }
    @Override
    public String getTipoUsuario() {
        return "PREMIUM";
    }
    @Override
    public String getValorFreteDesconto(double valorFrete, double valorProduto) {
        if (valorProduto > 100) {
            return "FRETE GRÁTIS";
        } else {
            return Double.toString(valorFrete);
        }
    }
}
