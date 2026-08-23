public class Tipagem {
    public static void main(String[] args) {
        // TIPOS PRIMITIVOS
        byte    b = 100;                  //  8 bits, -128 a 127
        short   s = 10000;                // 16 bits, -32.768 a 32.767
        int     i = 1000000000;           // 32 bits, -2.147.483.648 a 2.147.483.647 (padrão para inteiros)
        long    l = 1000000000000000000L; // 64 bits, -9.223.372.036.854.775.808 a 9.223.372.036.854.775.807 (precisa do sufixo "L")
        float   f = 3.14f;                // 32 bits, ~ +-1,4*10^-45 a +-3,4*10^38 (precisa do sufixo "f")
        double  d = 3.14159;              // 64 bits, ~ +-4,9*10^-324 a +-1,7*10^308 (padrão para decimais)
        char    c = 'A';                  // 16 bits, um caractere Unicode
        boolean z = true;                 // true ou false

        // INFERÊNCIA DE TIPO
        var numero = 42;     // inferido "int"
        var  texto = "xpto"; // inferido "String"

        // CASTING EXPLÍCITO
        float x1 = 4.2f;
        int   y1 = (int) x1;

        // CASTING IMPLÍCITO
        int   x2 = 42;
        float y2 = x2;
    }
}
