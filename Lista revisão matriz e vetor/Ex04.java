//4. Escreva um programa que ordene um vetor de tamanho arbitrário preenchido com números aleatórios e 
// execute a pesquisa por um valor passado como parâmetro utilizando o algoritmo da busca binária.

import java.util.Scanner;
import java.util.Random;

public class Ex04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        
        // Solicita o tamanho do vetor
        System.out.print("Digite o tamanho do vetor: ");
        int tamanho = scanner.nextInt();
        
        // Cria e preenche o vetor com números aleatórios
        int[] vetor = new int[tamanho];
        System.out.println("\nVetor original:");
        for (int i = 0; i < tamanho; i++) {
            vetor[i] = random.nextInt(100); // Números de 0 a 99
            System.out.print(vetor[i] + " ");
        }
        
        // Ordena o vetor 
        for (int i = 0; i < tamanho - 1; i++) {
            int indiceMenor = i;
            
            // Encontra o menor elemento no restante do vetor
            for (int j = i + 1; j < tamanho; j++) {
                if (vetor[j] < vetor[indiceMenor]) {
                    indiceMenor = j;
                }
            }
            
            // Troca o menor elemento com o primeiro elemento não ordenado
            if (indiceMenor != i) {
                int temp = vetor[i];              // Armazena temporariamente o valor da posição atual
                vetor[i] = vetor[indiceMenor];    // Move o menor elemento para a posição correta
                vetor[indiceMenor] = temp;        // Coloca o elemento original na posição do menor
            }
        }
        
        System.out.println("\n\nVetor ordenado:");
        for (int i = 0; i < tamanho; i++) {
            System.out.print(vetor[i] + " ");
        }
        
        
        System.out.print("\n\nDigite o valor para buscar: ");
        int valorBuscado = scanner.nextInt();
        
        // Executa a busca binária
        int inicio = 0;
        int fim = tamanho - 1;
        int posicao = -1;
        
        while (inicio <= fim) {
            int meio = (inicio + fim) / 2;
            
            if (vetor[meio] == valorBuscado) {
                posicao = meio; // Valor encontrado
                break;
            } else if (vetor[meio] < valorBuscado) {
                inicio = meio + 1; // Busca na metade direita
            } else {
                fim = meio - 1; // Busca na metade esquerda
            }
        }
        
        if (posicao != -1) {
            System.out.println("Valor " + valorBuscado + " encontrado na posição " + posicao);
        } else {
            System.out.println("Valor " + valorBuscado + " não encontrado no vetor");
        }
        
        scanner.close();
    }
}