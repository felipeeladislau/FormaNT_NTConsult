package Desafios2Semana.Desafio04;

import java.util.Scanner;

public class DescontosUsuario {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Entre com o valor do produto");
        double valorProduto = scanner.nextDouble();

        System.out.print("Insira o valor do frete: ");
        double shippingValue = scanner.nextDouble();

        UsuarioBase usuarioBase = new UsuarioBase();
        UsuarioStandart usuarioStandart = new UsuarioStandart();
        UsuarioPremium usuarioPremium = new UsuarioPremium();

        System.out.println("\n\nUsuario Tipo: " + usuarioBase.getTipoUsuario() + ",\nValor Desconto: " + usuarioBase.getValorDesconto(valorProduto) + ",\nValor Frete Desconto: " + usuarioBase.getValorFreteDesconto(shippingValue, valorProduto));
        System.out.println("\n\nUsuario Tipo: " + usuarioStandart.getTipoUsuario() + ",\nValor Desconto: " + usuarioStandart.getValorDesconto(valorProduto) + ",\nValor Frete Desconto: " + usuarioStandart.getValorFreteDesconto(shippingValue, valorProduto));
        System.out.println("\n\nUsuario Tipo: " + usuarioPremium.getTipoUsuario() + ",\nValor Desconto: " + usuarioPremium.getValorDesconto(valorProduto) + ",\nValor Frete Desconto: " + usuarioPremium.getValorFreteDesconto(shippingValue, valorProduto));
    }
}
