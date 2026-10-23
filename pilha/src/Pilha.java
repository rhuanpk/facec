public class Pilha {
    int[] elementos;
    int capacidade;
    int topo;

    void push(int item) {
        if (!check()) {
            return;
        }
        if (cheio()) {
            System.out.println("[PILHA]: nao inserido (" + item + "), estouro de pilha");
            return;
        }

        System.out.println("[PILHA]: inserindo item (" + item + ") na pilha");
        elementos[++topo] = item;
    }

    void pop() {
        if (!check()) {
            return;
        }
        if (vazio()) {
            System.out.println("[PILHA]: nao removido, pilha vazia");
            return;
        }

        System.out.println("[PILHA]: removido item (" + elementos[topo] + ") da pilha");
        elementos[topo] = 0;
        topo--;
    }

    boolean check() {
        if (capacidade <= 0) {
            System.out.println("[PILHA]: capacidade nao definida ou menor que zero");
            return false;
        }

        if (elementos == null) {
            elementos = new int[capacidade];
            topo = -1;
        }

        return true;
    }

    boolean vazio() {
        return topo < 0;
    }

    boolean cheio() {
        return topo >= (capacidade - 1);
    }

    public String toString() {
        String string = "";
        if (check()) {
            for (int indice = elementos.length - 1; indice >= 0; indice--) {
                string += "[PILHA]: " + indice + ") " + elementos[indice] + "\n";
            }
        }
        return string;
    }
}
