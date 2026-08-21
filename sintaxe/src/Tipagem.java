public class Tipagem {
    public static void main(String[] args) {
        // TIPOS PRIMITIVOS
        byte    b = 10;           // 8 bits, -128 a 127
        short   s = 1000;         // 16 bits
        int     i = 100000;       // 32 bits (padrão para inteiros)
        long    l = 10000000000L; // 64 bits (precisa do sufixo "L")
        float   f = 3.14f;        // 32 bits (precisa do sufixo "f")
        double  d = 3.14159;      // 64 bits (padrão para decimais)
        char    c = 'A';          // 16 bits, um caractere Unicode
        boolean z = true;         // true ou false

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
