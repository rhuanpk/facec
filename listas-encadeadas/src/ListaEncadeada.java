public class ListaEncadeada {
    No inicio;

    void adicionar(String valor) {
        if (inicio == null) {
            inicio = new No();
            inicio.valor = valor;
            return;
        }

        No no = new No();
        no.valor = valor;

        No ultimo = ultimo();
        ultimo.proximo = no;
    }

    No ultimo() {
        No atual = inicio;
        while (atual.proximo != null) {
            atual = atual.proximo;
        }
        return atual;
    }

    // public String toString() {
    //     No no = inicio;
    //     String string = "";
    //
    //     int index = 0;
    //     while (no != null) {
    //         string += "[" + index + "] " + no + "\n";
    //         no = no.proximo;
    //         index++;
    //     }
    //
    //     string = string.trim();
    //     if (string.isEmpty()) {
    //         string = "[LIST]: EMPTY";
    //     }
    //
    //     return string;
    // }
}
