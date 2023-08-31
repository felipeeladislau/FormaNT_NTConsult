package Desafios3Semana;

import java.util.ArrayList;
import java.util.List;

public class Cliente extends Usuario {
    private List<Filmes> ingressosComprados;

    public List<Filmes> getIngressosComprados() {
        return ingressosComprados;
    }

    public void setIngressosComprados(List<Filmes> ingressosComprados) {
        this.ingressosComprados = ingressosComprados;
    }

    public Cliente(String nome, TipoUsuario tipoUsuario, int idade, String usuario, String senha) {
        super(nome, tipoUsuario, idade, usuario, senha);

        ingressosComprados = new ArrayList<>();
    }

    public void comprarIngresso(Filmes filme) {
        if (filme.getPoltronasDisponiveis() > 0) {
            ingressosComprados.add(filme);
            filme.setPoltronasDisponiveis(filme.getPoltronasDisponiveis() - 1);
            System.out.println("Ingresso comprado com sucesso para o filme: " + filme.getTitulo());
        } else {
            System.out.println("Desculpe, não há mais poltronas disponíveis para o filme: " + filme.getTitulo());
        }

    }

    /**
     * 
     */
    public void listarFilmes() {
        
    }

    public void visualizarIngressosComprados() {
        if (ingressosComprados.isEmpty()) {
            System.out.println("Você ainda não comprou nenhum ingresso.");
        } else {
            System.out.println("Ingressos comprados:");
            for (Filmes filme : ingressosComprados) {
                System.out.println(filme.getTitulo());
            }
        }
    
    }

    public void login() {
        System.out.println("Login efetuado como cliente: " + getNome());
        // Lógica para efetuar login como cliente
    }

    public void logout() {
        System.out.println("Logout efetuado como cliente: " + getNome());
        // Lógica para efetuar logout como cliente
    }

    @Override
    public String toString() {
        return "Cliente []";
    }

}
