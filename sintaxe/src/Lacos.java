public class Lacos {
    public static void main(String[] args) {
        // FOR/SEQUENCIAL
        for (int i = 0; i < 10; i++) {
            // ...
        }

        // FOR/EACH (ARRAYS/COLEÇÕES)
        int[] numeros = {1, 2, 3, 4, 5};
        for (int n : numeros) {
            // ...
        }

        // WHILE
        while (true) {
            // ...
            if (true) {
                break;
            }
        }

        // DO/WHILE
        do {
            // ...
            if (true) {
                break;
            }
        } while (true);

        // ESCAPE
        for (int i = 0; i < 10; i++) {
            if (i < 5) {
                // continue imediatamente para o próximo step do loop
                continue;
            }
            if (i == 7) {
                // quebra o loop mais próximo
                break;
            }
        }
    }
}
