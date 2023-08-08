    public class NumerosPrimos {


            public static boolean Primo(int numero) {
                if (numero <= 1) {
                    return false;
                }
                for (int i = 2 ; i < numero; i++) {
                    if (numero % i == 0) {
                        return false;
                    }
                }
                return true;
            }

            public static void main(String[] args) {
                for (int i = 0; i <= 1000; i++) {
                    if (Primo(i)) {
                        System.out.println(i + " é primo.");
                    }
                }
            }
        }