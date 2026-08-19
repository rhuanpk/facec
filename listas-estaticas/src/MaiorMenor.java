public class MaiorMenor {
    public static void main(String[] args) {
        // criação de array com tamanho dinâmico
        int[] numeros = {27, -14, -2, 7, 42, 10, -5, 30, 0, 8};

        // criação de variáveis para guardar maior e menor valor do array
        int maior = 0, menor = 0;
        // loop iterando sobre o tamanho do array
        for (int index = 0; index < numeros.length; index++) {
            // por questões de praticidade
            // cria uma variável com o valor atual do array
            // com base no índice do loop
            int numero = numeros[index];
            // logica para determinar o maior numero do array
            // utilizando if blockless
            if (numero > maior) maior = numero;
            // logica para determinar o menor numero do array
            // utilizando if blockless
            if (numero < menor) menor = numero;
        }

        // loop iterando sobre o tamanho do array
        // para impressão dos valores do array
        System.out.print("Array de números: ");
        for (int index = 0; index < numeros.length; index++) {
            System.out.print(numeros[index]);
            if (index < (numeros.length - 1)) {
                System.out.print(", ");
            }
        }
        System.out.println();

        // mensagens de encerramento do programa
        System.out.println("Maior número: " + maior);
        System.out.println("Menor número: " + menor);
    }
}
