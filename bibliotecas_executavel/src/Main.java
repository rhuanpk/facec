public class Main {
    void main() {
        String phrase = IO.readln("Frase: ");
        IO.println("Invertido: " + new StringBuilder(phrase).reverse());
    }
}
