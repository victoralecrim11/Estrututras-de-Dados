package Lista02;

public class ListaEncadeada {
    private int[] elementos;
    private int tamanho;

    public ListaEncadeada(int capacidade) {
        elementos = new int[capacidade];
        tamanho = 0;
    }

    // 2. Criar lista vazia
    public void criarListaVazia() {
        tamanho = 0;
    }

    // Método auxiliar para expandir o tamanho da lista
    private void garantirCapacidade() {
        if (tamanho == elementos.length) {
            int[] novo = new int[elementos.length * 2];
            for (int i = 0; i < elementos.length; i++) {
                novo[i] = elementos[i];
            }
            elementos = novo;
        }
    }

    // 3. Inserir no início
    public void inserirInicio(int valor) {
        garantirCapacidade();
        for (int i = tamanho; i > 0; i--) {
            elementos[i] = elementos[i - 1];
        }
        elementos[0] = valor;
        tamanho++;
    }

    // 4. Inserir no fim
    public void inserirFim(int valor) {
        garantirCapacidade();
        elementos[tamanho] = valor;
        tamanho++;
    }

    // 5. Inserir em posição específica
    public void inserirPosicao(int pos, int valor) {
        if (pos < 0 || pos > tamanho) {
            System.out.println("Posição inválida");
            return;
        }
        garantirCapacidade();
        for (int i = tamanho; i > pos; i--) {
            elementos[i] = elementos[i - 1];
        }
        elementos[pos] = valor;
        tamanho++;
    }

    // 6. Remover início
    public void removerInicio() {
        if (tamanho == 0) return;
        for (int i = 0; i < tamanho - 1; i++) {
            elementos[i] = elementos[i + 1];
        }
        tamanho--;
    }

    // 7. Remover fim
    public void removerFim() {
        if (tamanho == 0) return;
        tamanho--;
    }

    // 8. Remover em posição específica
    public void removerPosicao(int pos) {
        if (pos < 0 || pos >= tamanho) {
            System.out.println("Posição inválida");
            return;
        }
        for (int i = pos; i < tamanho - 1; i++) {
            elementos[i] = elementos[i + 1];
        }
        tamanho--;
    }

    // 9. Remover elemento específico
    public void removerElemento(int valor) {
        int pos = pesquisar(valor);
        if (pos != -1) {
            removerPosicao(pos);
        }
    }

    // 10. Exibir lista
    public void exibir() {
        System.out.print("[");
        for (int i = 0; i < tamanho; i++) {
            System.out.print(elementos[i]);
            if (i < tamanho - 1) System.out.print(", ");
        }
        System.out.println("]");
    }

    // 11. Pesquisar elemento
    public int pesquisar(int valor) {
        for (int i = 0; i < tamanho; i++) {
            if (elementos[i] == valor) {
                return i;
            }
        }
        return -1;
    }

    // 12. Número de elementos
    public int numeroElementos() {
        return tamanho;
    }
}
