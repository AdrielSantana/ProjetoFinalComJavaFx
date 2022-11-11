package livraria.backend;

import java.util.ArrayList;
import java.util.List;

import livraria.backend.produtos.Livro;

public class CarrinhoDeCompras {
    private double total;
    private List<Livro> produtos;

    public CarrinhoDeCompras() {
        this.produtos = new ArrayList<Livro>();
    }

    public boolean adiciona(Livro livro){
        this.produtos.add(livro);

        if(!produtos.isEmpty()){
            return true;
        }else {
            return false;
        }
    }

    public boolean remove(Livro livro){
        this.produtos.remove(livro);

        if(produtos.isEmpty()){
            return true;
        }else {
            return false;
        }

    }

    public double getTotal() {
        double soma = 0;
        for (Livro produto : produtos) {
            soma += produto.getValor();
        };
        this.total = soma;
        return this.total;
    }

    public List<Livro> getProdutos(){
        return produtos;
    }

    public int getQtdLivros(){
        return produtos.size();
    }
}
