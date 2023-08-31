package Desafio3Semana;

import Desafio3Semana.Controller.Cadastro;
import Desafio3Semana.Controller.Login;

import java.util.Scanner;

public class main {
        public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);
            boolean continuar = true;

            while (continuar) {
                System.out.println("MENU INICIAL");
                System.out.println("1. ENTRAR");
                System.out.println("2. CADASTRAR");
                System.out.println("3. SAIR");

                System.out.print("Escolha uma opção: ");
                int opcao = scanner.nextInt();

                switch (opcao) {
                    case 1:
                        telaLogin();
                        break;
                    case 2:
                        telaCadastro();
                        break;
                    case 3:
                        continuar = false;
                        break;
                    default:
                        System.out.println("Opção inválida!");
                        break;
                }
            }

            scanner.close();
        }

        public static void telaLogin() {
            Login login = new Login();
            login.realizarLogin();
            System.out.println("Você está na tela de login!");
        }

        public static void telaCadastro() {
            Cadastro cadastro = new Cadastro();
            cadastro.cadastrarUsuario();
            System.out.println("Você está na tela de cadastro!");
        }
    }
    

