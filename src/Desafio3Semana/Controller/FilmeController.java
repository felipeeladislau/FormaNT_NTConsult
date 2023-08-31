package Desafio3Semana.Controller;

import Desafio3Semana.Modelo.Filmes;

import java.util.ArrayList;
import java.util.List;

import Desafio3Semana.Modelo.Filmes;

import java.util.ArrayList;
import java.util.List;

public class FilmeController {
    private List<Filmes> filmes;

    public FilmeController() {
        this.filmes = new ArrayList<>();
    }

    public void cadastrarFilme(int id, String titulo, String genero, int idadeMinima, int tempo, double valor, String tecnologia, int poltronasDisponiveis) {
        Filmes filme = new Filmes(id, titulo, genero, idadeMinima, tempo, valor, tecnologia, poltronasDisponiveis);
        filmes.add(filme);
    }

    public void reservarPoltronas(int idFilme, int quantidade) {
        for (Filmes filme : filmes) {
            if (filme.getId() == idFilme) {
                int poltronasDisponiveis = filme.getPoltronasDisponiveis();
                if (quantidade <= poltronasDisponiveis) {
                    filme.setPoltronasDisponiveis(poltronasDisponiveis - quantidade);
                    System.out.println("Poltronas reservadas com sucesso!");
                } else {
                    System.out.println("Não há poltronas disponíveis suficientes.");
                }
                return;
            }
        }
        System.out.println("Filme não encontrado.");
    }

    public String atualizarInformacoes(int idFilme, String titulo, String genero, int idadeMinima, int tempo, double valor, String tecnologia, int poltronasDisponiveis) {
        for (Filmes filme : filmes) {
            if (filme.getId() == idFilme) {
                filme.setTitulo(titulo);
                filme.setGenero(genero);
                filme.setIdadeMinima(idadeMinima);
                filme.setTempo(tempo);
                filme.setValor(valor);
                filme.setTecnologia(tecnologia);
                filme.setPoltronasDisponiveis(poltronasDisponiveis);
                return "Informações do filme atualizadas com sucesso!";
            }
        }
        return "Filme não encontrado.";
    }

    public String exibirInformacoes(int idFilme) {
        for (Filmes filme : filmes) {
            if (filme.getId() == idFilme) {
                return "Título: " + filme.getTitulo() + "\nGênero: " + filme.getGenero() + "\nIdade Mínima: " + filme.getIdadeMinima() + "\nTempo: " + filme.getTempo() + " minutos\nValor do Ingresso: R$" + filme.getValor() + "\nTecnologia: " + filme.getTecnologia() + "\nPoltronas Disponíveis: " + filme.getPoltronasDisponiveis();
            }
        }
        return "Filme não encontrado.";
    }

    public double calcularValorTotal(int idFilme, int quantidade) {
        for (Filmes filme : filmes) {
            if (filme.getId() == idFilme) {
                return filme.getValor() * quantidade;
            }
        }
        return 0;
    }
}