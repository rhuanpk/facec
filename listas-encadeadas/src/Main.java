public class Main {
    public static void main(String[] args) {
        ListaEncadeada listaEncadeada = new ListaEncadeada();
        System.out.println(listaEncadeada);

        listaEncadeada.adicionar("hello");
        listaEncadeada.adicionar("world");
        listaEncadeada.adicionar("xpto");
        System.out.println(listaEncadeada);
    }
}
