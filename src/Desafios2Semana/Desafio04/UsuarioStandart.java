package Desafios2Semana.Desafio04;

public class UsuarioStandart implements Usuario {
    @Override
    public double getValorDesconto(double valorProduto) {

        if (valorProduto > 200) {
            return valorProduto * 0.15;
        } else {
            return 0;
        }
    }
    @Override
    public String getTipoUsuario() {
        return "STANDART";
    }
    @Override
    public String getValorFreteDesconto(double valorFrete, double valorProduto) {
        if (valorProduto > 200) {
            return Double.toString(valorFrete * 0.10);
        } else {
            return Double.toString(valorFrete);
        }
    }
}
