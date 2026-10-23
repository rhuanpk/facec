public class Fila {
    int[] dados;
    int fim, tamanho, capacidade;

    void enqueue(int item) {
        if (!check()) {
            return;
        }
        if (cheio()) {
            System.out.println("[FILA]: nao inserido (" + item + "), fila cheia");
            return;
        }

        System.out.println("[FILA]: inserindo item (" + item + ") na fila");
        dados[++fim] = item;
        tamanho++;
    }

    void dequeue() {
        if (!check()) {
            return;
        }
        if (vazio()) {
            System.out.println("[FILA]: nao removido, fila vazia");
            return;
        }

        System.out.println("[FILA]: removendo item (" + dados[0] + ") da fila");
        for (int indice = 0; indice < fim; indice++) {
            dados[indice] = dados[indice + 1];
        }
        dados[fim--] = 0;
        tamanho--;
    }

    boolean check() {
        if (capacidade <= 0) {
            System.out.println("[FILA]: capacidade nao definida ou menor que zero");
            return false;
        }

        if (dados == null) {
            dados = new int[capacidade];
            fim = -1;
            tamanho = 0;
        }

        return true;
    }

    boolean vazio() {
        return tamanho <= 0;
    }

    boolean cheio() {
        return fim >= (capacidade - 1);
    }

    public String toString() {
        String string = "";
        if (check()) {
            string = "[FILA]: ";
            for (int dado : dados) {
                string += dado + ", ";
            }
        }
        return string;
    }
}
