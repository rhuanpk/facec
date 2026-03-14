package net.rhuanpk.sistema;

public class Main {
    public static void main(String[] args) {
        // Não precisamos instânciar nenhum objeto
        // para conseguir escrever na saída padrão do sistema,
        // pois o Java já trás isso de forma _built-in_.
        // Usamos as funções print* do atributo estático _out_ da classe System para isso.

        // Escreve na saída padrão e NÃO quebra linha no final:
        System.out.print("Frase escrita com 'print'!");

        // Escreve na saída padrão e quebra linha no final:
        System.out.println("Frase escrita com 'println'!");

        // Escreve na saída padrão formatando a saída:
        System.out.printf("Posiciona argumentos aqui (%s) ou aqui (%d)!\nQuebrando linha no meio da linha.", "string", 42);
    }
}
