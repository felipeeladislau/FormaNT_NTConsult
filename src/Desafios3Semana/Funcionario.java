package Desafios3Semana;

public class Funcionario extends Usuario {

        public Funcionario(String nome, TipoUsuario tipoUsuario, int idade, String usuario, String senha) {
        super(nome, tipoUsuario, idade, usuario, senha);
        //TODO Auto-generated constructor stub
    }

        public void cadastrarFilme(Filmes filme) {
            // Lógica para cadastrar um novo filme no sistema
        }
    
        public void excluirFilme(Filmes filme) {
            // Lógica para excluir um filme do cartaz (se nenhum ingresso tiver sido vendido)
        }
    
        public void listarFilmes() {
            // Lógica para listar os filmes em cartaz
        }
    
        public void login() {
            // Lógica para efetuar login como funcionário
        }
    
        public void logout() {
            // Lógica para efetuar logout como funcionário
        }

        @Override
        public String toString() {
            return "Funcionario []";
        }
    }

    

