public class ImprimaPares {
    public static void main(String[] args) {
        System.out.println("Imprimindo os numeros pares com o metodo FOR");
            for (int numero = 0; numero < 100; numero++) {
                if (numero % 2 == 0) {
                    System.out.print( numero + ",");
                }
            }

        System.out.println("\nImprimindo os numeros pares com metodo WHILE ");
        int numero =0;
        while (numero < 100) {
            if (numero % 2 == 0) {
                System.out.print( numero+",");
            }
            numero++;
        }
    }}