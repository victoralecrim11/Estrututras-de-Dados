// Escreva um programa que carregue dois vetores inteiros com 5 posições, sendo um com números pares e o outro com números ímpares. O 
// usuário pode digitar os números em qualquer sequência e o programa deverá armazená-los no vetor correto na ordem em que foram 
// informados pelo usuário.

import java.util.Scanner;

public class Ex03 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int vetPar[] = new int[5];
    int vetImpar[] = new int[5];
    int num = 0;
    int posicaoPar = 0;
    int posicaoImpar = 0;

    for (int j = 0; j < 5; j++) {
      System.out.println("Digite um numero:");
      num = input.nextInt();

      if (num % 2 == 0) {
        vetPar[posicaoPar] = num;
        posicaoPar++;
      } else if (num % 2 != 0) {
        vetImpar[posicaoImpar] = num;
        posicaoImpar++;
      } else{
        System.out.println("Esse vetor ja esta cheio!");
      }

    }

    System.out.println("\nVetor de Pares:");
    for (int i = 0; i < vetPar.length; i++) {
      System.out.print(vetPar[i] + " ");
    }

    System.out.println("\nVetor de Ímpares:");
    for (int i = 0; i < vetImpar.length; i++) {
      System.out.print(vetImpar[i] + " ");
    }
    
    input.close();
  }
}
