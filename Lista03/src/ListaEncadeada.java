public class ListaEncadeada {
    private Nó head; // referência para o primeiro nó

    // 2. Criar lista vazia
    public void criarListaVazia() {
        head = null;
    }

    // 3. Inserir no início
    public void inserirInicio(int valor) {
        Nó novo = new Nó(valor);
        novo.prox = head;
        head = novo;
    }

    // 4. Inserir no fim
    public void inserirFim(int valor) {
        Nó novo = new Nó(valor);
        if (head == null) {
            head = novo;
            return;
        }
        Nó temp = head;
        while (temp.prox != null) {
            temp = temp.prox;
        }
        temp.prox = novo;
    }

    // 5. Inserir em posição específica
    public void inserirPosicao(int pos, int valor) {
        if (pos < 0) {
            System.out.println("Posição inválida");
            return;
        }
        if (pos == 0) {
            inserirInicio(valor);
            return;
        }

        Nó temp = head;
        for (int i = 0; i < pos - 1 && temp != null; i++) {
            temp = temp.prox;
        }
        if (temp == null) {
            System.out.println("Posição inválida");
            return;
        }

        Nó novo = new Nó(valor);
        novo.prox = temp.prox;
        temp.prox = novo;
    }

    // 6. Remover início
    public void removerInicio() {
        if (head != null) {
            head = head.prox;
        }
    }

    // 7. Remover fim
    public void removerFim() {
        if (head == null) return;
        if (head.prox == null) {
            head = null;
            return;
        }
        Nó temp = head;
        while (temp.prox.prox != null) {
            temp = temp.prox;
        }
        temp.prox = null;
    }

    // 8. Remover em posição específica
    public void removerPosicao(int pos) {
        if (pos < 0 || head == null) {
            System.out.println("Posição inválida");
            return;
        }
        if (pos == 0) {
            removerInicio();
            return;
        }

        Nó temp = head;
        for (int i = 0; i < pos - 1 && temp != null; i++) {
            temp = temp.prox;
        }
        if (temp == null || temp.prox == null) {
            System.out.println("Posição inválida");
            return;
        }
        temp.prox = temp.prox.prox;
    }

    // 9. Remover elemento específico
    public void removerElemento(int valor) {
        if (head == null) return;
        if (head.valor == valor) {
            head = head.prox;
            return;
        }

        Nó temp = head;
        while (temp.prox != null && temp.prox.valor != valor) {
            temp = temp.prox;
        }
        if (temp.prox != null) {
            temp.prox = temp.prox.prox;
        }
    }

    // 10. Exibir lista
    public void exibir() {
        Nó temp = head;
        System.out.print("[");
        while (temp != null) {
            System.out.print(temp.valor);
            if (temp.prox != null) System.out.print(", ");
            temp = temp.prox;
        }
        System.out.println("]");
    }

    // 11. Pesquisar elemento
    public int pesquisar(int valor) {
        Nó temp = head;
        int pos = 0;
        while (temp != null) {
            if (temp.valor == valor) return pos;
            temp = temp.prox;
            pos++;
        }
        return -1;
    }

    // 12. Número de elementos
    public int numeroElementos() {
        int cont = 0;
        Nó temp = head;
        while (temp != null) {
            cont++;
            temp = temp.prox;
        }
        return cont;
    }
}
