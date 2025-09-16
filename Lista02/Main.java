package Lista02;

public class Main {
  public static void main(String[] args) {
    ListaEncadeada lista = new ListaEncadeada(5);

    lista.inserirFim(10);
    lista.inserirFim(20);
    lista.inserirFim(30);
    lista.exibir(); 

    lista.inserirInicio(5);
    lista.exibir(); 

    lista.inserirPosicao(2, 15);
    lista.exibir();

    lista.removerInicio();
    lista.exibir(); 

    lista.removerFim();
    lista.exibir();

    lista.removerPosicao(1);
    lista.exibir(); 

    lista.removerElemento(20);
    lista.exibir(); 

    System.out.println("Posição do 10: " + lista.pesquisar(10)); // 0
    System.out.println("Tamanho: " + lista.numeroElementos()); // 1
  }
}
