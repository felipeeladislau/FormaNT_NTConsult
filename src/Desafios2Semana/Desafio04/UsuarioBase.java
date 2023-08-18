package Desafios2Semana.Desafio04;

public class UsuarioBase implements Usuario {
    @Override
    public double getValorDesconto(double valorProduto) {
        if (valorProduto > 300) {
            return valorProduto * 0.05;
        } else {
            return 0;
        }
    }
    @Override
    public String getTipoUsuario() {
        return "BASE";
    }
    @Override
    public String getValorFreteDesconto(double valorFrete, double valorProduto) {
        if (valorProduto > 300) {
            return Double.toString(valorFrete * 0.95);
        } else {
            return Double.toString(valorFrete);
        }

    }
}
