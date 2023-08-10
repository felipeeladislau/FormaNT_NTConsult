package Desafio04;

    public class Motorista extends Funcionario {
        private String cnh;
        private String placaCarro;

        public Motorista(String nome, String cpf, String rg, int idade, String cargo, double salario, String cnh, String placaCarro) {
            super(nome, cpf, rg, idade, cargo, salario);
            this.cnh = cnh;
            this.placaCarro = placaCarro;
        }

        public String getCnh() {
            return cnh;
        }

        public String getPlacaCarro() {
            return placaCarro;
        }

        public void imprimir() {
            System.out.println("Nome: " + getNome());
            System.out.println("CPF: " + getCpf());
            System.out.println("RG: " + getRg());
            System.out.println("Idade: " + getIdade());
            System.out.println("Cargo: " + getCargo());
            System.out.println("Salário: " + getSalario());
            System.out.println("CNH: " + getCnh());
            System.out.println("Placa do Carro: " + getPlacaCarro());
            System.out.println("---------------------------------");
        }

    }
