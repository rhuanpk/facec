public class Nomes {
    public static void main(String[] args) {
        // criação de array com inferência de tamanho
        String[] nomes = {"Mateus", "Marcos", "Lucas", "João"};

        // loop iterando sobre o tamanho do array
        for (int index = 0; index < nomes.length; index++) {
            // soma +1 ao índice somente para impressão
            // acessa os valores do array de forma dinâmica pela variável do loop
            System.out.println("Nome " + (index + 1) + ": " + nomes[index]);
        }
    }
}
