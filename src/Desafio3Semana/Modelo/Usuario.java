package Desafio3Semana.Modelo;

public abstract class Usuario {
    private String nome;
    private TipoUsuario tipoUsuario;
    private int idade;
    private String usuario;
    private String senha;

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

    public void setNome(String nome) {
        this.nome = nome;
    }

    public TipoUsuario getTipoUsuario() {
        return tipoUsuario;
    }

    public void setTipoUsuario(TipoUsuario tipoUsuario) {
        this.tipoUsuario = tipoUsuario;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    // outros métodos comuns a todos os usuários
}