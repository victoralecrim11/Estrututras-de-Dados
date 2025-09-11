import java.util.Random;

public class Ex01{
  public static void main(String[] args){
    //Vetores de 10 posições
    int[] vet1 = new int[10];
    int[] vet2 = new int[10];
    int[] vet3 = new int[10];

    //Gerando numeros aleatorios
    Random gerador = new Random();

    //For pra percorrer e preencher com valores aleatorios
    for(int i = 0; i < 10; i++){
      vet1[i] = gerador.nextInt(100);
      vet2[i] = gerador.nextInt(100);
      vet3[i] = gerador.nextInt(100);
    }

    //Imprimindo os vetores
    System.out.println("Vetor 1: ");
    for(int i = 0; i < 10; i++){
      System.out.print(vet1[i] + " ");
    }
    System.out.println("\nVetor 2: ");
    for(int i = 0; i < 10; i++){
      System.out.print(vet2[i] + " ");
    }

    //Fazendo o calculo da divisão entre os indices do vetor 1 e 2 e atribuindo ao vetor 3
    System.out.println("\nVetor 3: ");
    for (int i = 0; i < vet3.length; i++) {
        vet3[i] = (vet1[i] + vet2[i]) / 2;
        System.out.print(vet3[i]);
    }



  }
}