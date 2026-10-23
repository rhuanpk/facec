public class Main {
    public static void main(String[] args) {
        Pilha pilha = new Pilha();
        pilha.capacidade = 3;

        System.out.println(pilha);

        pilha.push(100);
        System.out.println(pilha);
        pilha.push(200);
        System.out.println(pilha);
        pilha.push(300);
        System.out.println(pilha);
        pilha.push(400);
        System.out.println(pilha);

        pilha.pop();
        System.out.println(pilha);
        pilha.pop();
        System.out.println(pilha);
        pilha.pop();
        System.out.println(pilha);
        pilha.pop();
        System.out.println(pilha);
    }
}
