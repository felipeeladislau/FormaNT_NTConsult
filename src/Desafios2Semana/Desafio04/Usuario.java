package Desafios2Semana.Desafio04;

public interface Usuario {
    double getValorDesconto(double valorProduto);
    String getTipoUsuario();
    String getValorFreteDesconto(double valorFrete, double valorProduto);
}

