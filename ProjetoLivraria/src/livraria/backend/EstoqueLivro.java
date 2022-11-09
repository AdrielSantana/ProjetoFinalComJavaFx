package livraria.backend;

import java.util.HashMap;
import java.util.Map;

import livraria.backend.produtos.Livro;

public class EstoqueLivro {
    private Map<String, Livro> livros;

    public EstoqueLivro() {
        this.livros = new HashMap<>(0);
    }

    public boolean adicionaLivro(String nome, Livro livro) {
        if (livros.containsKey(nome)) {
            return false;
        } else {
            livros.put(nome, livro);
            return true;
        }
    }

    public boolean removeLivro(String nome) {
        if (livros.containsKey(nome)) {
            livros.remove(nome);
            return true;
        } else {
            return false;
        }
    }

    public Livro achaLivro(String nome) {
        return this.livros.get(nome);
    }
}
