public class Main {
    public static void main(String[] args) {
        ListaEncadeada lista = new ListaEncadeada();

        lista.inserirFim(10);
        lista.inserirFim(20);
        lista.inserirFim(30);
        lista.exibir(); // [10, 20, 30]

        lista.inserirInicio(5);
        lista.exibir(); // [5, 10, 20, 30]

        lista.inserirPosicao(2, 15);
        lista.exibir(); // [5, 10, 15, 20, 30]

        lista.removerInicio();
        lista.exibir(); // [10, 15, 20, 30]

        lista.removerFim();
        lista.exibir(); // [10, 15, 20]

        lista.removerPosicao(1);
        lista.exibir(); // [10, 20]

        lista.removerElemento(20);
        lista.exibir(); // [10]

        System.out.println("Posição do 10: " + lista.pesquisar(10)); // 0
        System.out.println("Tamanho: " + lista.numeroElementos());   // 1
    }
}
