package livraria.backend;

import java.util.ArrayList;
import java.util.List;

import livraria.backend.produtos.Produto;

public class CarrinhoDeCompras {
    private double total;
    private List<Produto> produtos;

    public CarrinhoDeCompras() {
        this.produtos = new ArrayList<Produto>();
    }

    public boolean adiciona(Produto produto){
        this.produtos.add(produto);

        if(!produtos.isEmpty()){
            return true;
        }else {
            return false;
        }
    }

    public boolean remove(Produto produto){
        this.produtos.remove(produto);

        if(produtos.isEmpty()){
            return true;
        }else {
            return false;
        }

    }

    public double getTotal() {
        return total;
    }

    public List<Produto> getProdutos(){
        return produtos;
    }

    public int getQtdLivros(){
        return produtos.size();
    }
}
