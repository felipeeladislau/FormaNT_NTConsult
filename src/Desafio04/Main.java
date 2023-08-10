package Desafio04;

public class Main {
    public static void main(String[] args) {
        Motorista motorista1 = new Motorista("Lucas", "11122233344", "987654321", 30, "Motorista", 2500.0, "123456789", "ABC1234");
        Motorista motorista2 = new Motorista("Samuel", "987654321", "123456789", 25, "Motorista", 2200.0, "987654321", "DEF5678");
        motorista1.imprimir();
        motorista2.imprimir();

    }}