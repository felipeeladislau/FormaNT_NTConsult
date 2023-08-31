package Desafio3Semana.Controller;

import Desafio3Semana.Modelo.TipoUsuario;
import Desafio3Semana.Modelo.cliente.Cliente;
import Desafio3Semana.Modelo.funcionario.Funcionario;


import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Cadastro{
    private static List<Cliente> listaClientes = new ArrayList<>();
    private static List<Funcionario> listaFuncionarios = new ArrayList<>();



    public static void cadastrarUsuario() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o nome do usuário: ");
        String nome = scanner.nextLine();

        System.out.print("Digite o tipo de usuário (1 - Cliente, 2 - Funcionário): ");
        int tipoUsuario = scanner.nextInt();
        scanner.nextLine(); // Limpar o buffer do scanner

        System.out.print("Digite a idade do usuário: ");
        int idade = scanner.nextInt();
        scanner.nextLine(); // Limpar o buffer do scanner

        System.out.print("Digite o nome de usuário: ");
        String usuario = scanner.nextLine();

        System.out.print("Digite a senha do usuário: ");
        String senha = scanner.nextLine();

        String senhaCriptografada = criptografarSenha(senha);



        if (tipoUsuario == 1) {
            Cliente cliente = new Cliente(nome, TipoUsuario.Cliente, idade, usuario, senhaCriptografada);
            listaClientes.add(cliente);
            System.out.println("Cadastro de cliente realizado com sucesso!");
            System.out.println("Dados do cliente cadastrado:");
            System.out.println("Nome: " + cliente.getNome());
            System.out.println("Tipo de usuário: " + cliente.getTipoUsuario());
            System.out.println("Idade: " + cliente.getIdade());
            System.out.println("Nome de usuário: " + cliente.getUsuario());
            System.out.println("Senha: " + cliente.getSenha());

        } else if (tipoUsuario == 2) {
            Funcionario funcionario = new Funcionario(nome, TipoUsuario.Funcionario, idade, usuario, senhaCriptografada);
            listaFuncionarios.add(funcionario);
            System.out.println("Cadastro de funcionário realizado com sucesso!");
            System.out.println("Dados do funcionário cadastrado:");
            System.out.println("Nome: " + funcionario.getNome());
            System.out.println("Tipo de usuário: " + funcionario.getTipoUsuario());
            System.out.println("Idade: " + funcionario.getIdade());
            System.out.println("Nome de usuário: " + funcionario.getUsuario());
            System.out.println("Senha: " + funcionario.getSenha());

        } else {
            System.out.println("Tipo de usuário inválido!");
        }
    }
    public boolean verificarLogin(String usuario, String senhaCriptografada) {
        for (Cliente cliente : listaClientes) {
            if (cliente.getUsuario().equals(usuario) && cliente.getSenha().equals(senhaCriptografada)) {
                return true;
            }
        }

        for (Funcionario funcionario : listaFuncionarios) {
            if (funcionario.getUsuario().equals(usuario) && funcionario.getSenha().equals(senhaCriptografada)) {
                return true;
            }
        }

        return false;
    }

    public String getNomeUsuario(String usuario) {
        for (Cliente cliente : listaClientes) {
            if (cliente.getUsuario().equals(usuario)) {
                return cliente.getNome();
            }
        }

        for (Funcionario funcionario : listaFuncionarios) {
            if (funcionario.getUsuario().equals(usuario)) {
                return funcionario.getNome();
            }
        }

        return "";
    }

    static String criptografarSenha(String senha) {
        try {
            MessageDigest md = MessageDigest.getInstance("SHA-256");
            byte[] hash = md.digest(senha.getBytes());
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

    public boolean isCliente(String usuario) {
        return false;
    }
}

