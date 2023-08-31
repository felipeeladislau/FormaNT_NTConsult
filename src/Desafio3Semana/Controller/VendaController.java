package Desafio3Semana.Controller;

import Desafio3Semana.Modelo.Filmes;

import java.util.ArrayList;
import java.util.List;

public class VendaController {
    private List<Filmes> filmesVendidos;

    public VendaController() {
        this.filmesVendidos = new ArrayList<>();
    }

    public void realizarVenda(Filmes filme) {
        if (filme.getPoltronasDisponiveis() > 0) {
            filme.setPoltronasDisponiveis(filme.getPoltronasDisponiveis() - 1);
            filmesVendidos.add(filme);
            System.out.println("Venda realizada com sucesso!");
        } else {
            System.out.println("Não há poltronas disponíveis para esse filme.");
        }
    }

    public void cancelarVenda(Filmes filme) {
        if (filmesVendidos.contains(filme)) {
            filme.setPoltronasDisponiveis(filme.getPoltronasDisponiveis() + 1);
            filmesVendidos.remove(filme);
            System.out.println("Venda cancelada com sucesso!");
        } else {
            System.out.println("Esse filme não foi vendido.");
        }
    }

    public List<Filmes> getFilmesVendidos() {
        return filmesVendidos;
    }
}