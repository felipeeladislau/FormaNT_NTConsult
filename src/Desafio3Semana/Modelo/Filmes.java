package Desafio3Semana.Modelo;

public class Filmes {

    private int id;
    private String titulo;
    private String genero;
    private int idadeMinima;
    private int tempo;
    private double valor;
    private String tecnologia;
    private int poltronasDisponiveis ;

    public Filmes(int id, String titulo, String genero, int idadeMinima, int tempo, double valor, String tecnologia, int poltronasDisponiveis) {
        this.id = id;
        this.titulo = titulo;
        this.genero = genero;
        this.idadeMinima = idadeMinima;
        this.tempo = tempo;
        this.valor = valor;
        this.tecnologia = tecnologia;
        this.poltronasDisponiveis = 100;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getIdadeMinima() {
        return idadeMinima;
    }

    public void setIdadeMinima(int idadeMinima) {
        this.idadeMinima = idadeMinima;
    }

    public int getTempo() {
        return tempo;
    }

    public void setTempo(int tempo) {
        this.tempo = tempo;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getTecnologia() {
        return tecnologia;
    }

    public void setTecnologia(String tecnologia) {
        this.tecnologia = tecnologia;
    }

    public int getPoltronasDisponiveis() {
        return poltronasDisponiveis;
    }

    public void setPoltronasDisponiveis(int poltronasDisponiveis) {
        this.poltronasDisponiveis = poltronasDisponiveis;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public double calcularValorTotal(int quantidade) {
        return valor * quantidade;
    }






}