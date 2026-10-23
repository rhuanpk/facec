public class Main {
    public static void main(String[] args) {
        Fila fila = new Fila();
        fila.capacidade = 3;

        System.out.println(fila);

        fila.enqueue(100);
        System.out.println(fila);
        fila.enqueue(200);
        System.out.println(fila);
        fila.enqueue(300);
        System.out.println(fila);
        fila.enqueue(400);
        System.out.println(fila);

        fila.dequeue();
        System.out.println(fila);
        fila.dequeue();
        System.out.println(fila);
        fila.dequeue();
        System.out.println(fila);
        fila.dequeue();
        System.out.println(fila);
    }
}
