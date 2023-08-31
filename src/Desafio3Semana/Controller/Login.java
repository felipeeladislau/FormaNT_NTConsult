package Desafio3Semana.Controller;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Scanner;

import static Desafio3Semana.Controller.Cadastro.criptografarSenha;

public class Login {
    private static final Cadastro cadastro = new Cadastro();

    public static String realizarLogin() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o nome de usuário: ");
        String usuario = scanner.nextLine();

        System.out.print("Digite a senha: ");
        String senha = scanner.nextLine();

        String senhaCriptografada = criptografarSenha(senha);

        boolean loginValido = cadastro.verificarLogin(usuario, senhaCriptografada);

        if (loginValido) {
            if (cadastro.isCliente(usuario)) {
                // Redirecionar para a tela do cliente
            } else {
                // Redirecionar para a tela do funcionário
            }
        } else {
            System.out.println("Nome de usuário ou senha incorretos. Por favor, tente novamente.");
        }
        return usuario;
    }

    private static String criptografarSenha(String senha) {
        try {
            MessageDigest digest = MessageDigest.getInstance("SHA-256");
            byte[] hash = digest.digest(senha.getBytes());
            StringBuilder hexString = new StringBuilder();

            for (byte b : hash) {
                String hex = Integer.toHexString(0xff & b);
                if (hex.length() == 1) {
                    hexString.append('0');
                }
                hexString.append(hex);
            }

            return hexString.toString();
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
            return null;
        }
    }
}