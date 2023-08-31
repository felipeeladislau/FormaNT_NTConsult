package Desafio3Semana.Modelo.cliente;

import Desafio3Semana.Modelo.Filmes;
import Desafio3Semana.Modelo.TipoUsuario;
import Desafio3Semana.Modelo.Usuario;

import java.util.ArrayList;
import java.util.List;

public class Cliente extends Usuario {
    private static List<Filmes> ingressosComprados;

    public Cliente(String nome, TipoUsuario tipoUsuario, int idade, String usuario, String senha) {
        super(nome, tipoUsuario, idade, usuario, senha);

        ingressosComprados = new ArrayList<>();
    }

    public List<Filmes> getIngressosComprados() {
        return ingressosComprados;
    }

    public void setIngressosComprados(List<Filmes> ingressosComprados) {
        this.ingressosComprados = ingressosComprados;
    }

    public static void comprarIngresso(Filmes filme) {
        if (filme.getPoltronasDisponiveis() > 0) {
            ingressosComprados.add(filme);
            filme.setPoltronasDisponiveis(filme.getPoltronasDisponiveis() - 1);
            System.out.println("Ingresso comprado com sucesso para o filme: " + filme.getTitulo());
        } else {
            System.out.println("Desculpe, não há mais poltronas disponíveis para o filme: " + filme.getTitulo());
        }

    }

    public static void visualizarIngressosComprados() {
        if (ingressosComprados.isEmpty()) {
            System.out.println("Você ainda não comprou nenhum ingresso.");
        } else {
            System.out.println("Ingressos comprados:");
            for (Filmes filme : ingressosComprados) {
                System.out.println(filme.getTitulo());
            }
        }

    }

    @Override
    public String toString() {
        return "Cliente []";
    }

}


