package Desafio3Semana.Modelo;

public abstract class Usuario {
    private final String nome;
    private final TipoUsuario tipoUsuario;
    private final int idade;
    private final String usuario;
    private final String senha;

    public Usuario(String nome, TipoUsuario tipoUsuario, int idade, String usuario, String senha) {
        this.nome = nome;
        this.tipoUsuario = tipoUsuario;
        this.idade = idade;
        this.usuario = usuario;
        this.senha = senha;
    }

    public String getNome() {
        return nome;
    }



    public TipoUsuario getTipoUsuario() {
        return tipoUsuario;
    }



    public int getIdade() {
        return idade;
    }



    public String getUsuario() {
        return usuario;
    }



    public String getSenha() {
        return senha;
    }



    // outros métodos comuns a todos os usuários
}