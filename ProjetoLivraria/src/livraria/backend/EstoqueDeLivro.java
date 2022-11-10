package livraria.backend;

import java.util.HashMap;
import java.util.Map;

import livraria.backend.produtos.Livro;

public class EstoqueDeLivro {
    private static Map<String, Livro> livros = new HashMap<>(0);

    public static boolean adicionaLivro(String nome, Livro livro) {
        if (livros.containsKey(nome)) {
            return false;
        } else {
            livros.put(nome, livro);
            return true;
        }
    }

    public static boolean removeLivro(String nome) {
        if (livros.containsKey(nome)) {
            livros.remove(nome);
            return true;
        } else {
            return false;
        }
    }

    public static Livro achaLivro(String nome) {
        return livros.get(nome);
    }
}
