import java.util.Random;

//Escreva um programa que carregue um vetor inteiro de cem posições com números aleatórios entre 0 e 100. Percorrendo o vetor criado 
//apenas uma vez, imprima a posição onde ocorre o menor valor, a soma dos números armazenados e preencha os valores de um novo vetor 
//com metade do tamanho do vetor original onde a primeira posição do novo vetor é igual à soma da primeira e da última posição do vetor 
//original. A segunda posição do novo vetor é a soma da segunda e da penúltima posição do vetor original e assim em diante
public class Ex02 {
    public static void main(String[] args) {
        int[] vetorOriginal = new int[100];
        int[] vetorNovo = new int[50];
        Random rand = new Random();

        int menorValor = Integer.MIN_VALUE;
        int posicaoMenor = -1;
        int somaTotal = 0;

        // Percorre o vetor original uma única vez
        for (int i = 0; i < vetorOriginal.length; i++) {
            vetorOriginal[i] = rand.nextInt(101); // números entre 0 e 100
            somaTotal += vetorOriginal[i];

            // Verifica menor valor
            if (vetorOriginal[i] < menorValor) {
                menorValor = vetorOriginal[i];
                posicaoMenor = i;
            }

            // Preenche o novo vetor com soma dos elementos simétricos
            if (i < vetorNovo.length) {
                vetorNovo[i] = vetorOriginal[i] + vetorOriginal[vetorOriginal.length - 1 - i];
            }
        }

        // Exibe os resultados
        System.out.println("Posição do menor valor: " + posicaoMenor);
        System.out.println("Menor valor encontrado: " + menorValor);
        System.out.println("Soma total dos elementos: " + somaTotal);

        System.out.println("\nNovo vetor (50 posições):");
        for (int i = 0; i < vetorNovo.length; i++) {
            System.out.print("vetorNovo[" + i + "] = " + vetorNovo[i]);
        }
    }
}
