package Desafios1Semana.Desafio01.Desafio04;
public class Funcionario extends Pessoa {
    private String cargo;
    private double salario;

    public Funcionario(String nome, String cpf, String rg, int idade, String cargo, double salario) {
        super(nome, cpf, rg, idade);
        this.cargo = cargo;
        this.salario = salario;
    }

    public String getCargo() {
        return cargo;
    }

    public double getSalario() {
        return salario;
    }
}