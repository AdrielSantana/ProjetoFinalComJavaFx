package br.com.casadocodigo.livraria.produtos;

import br.com.casadocodigo.livraria.Autor;
import br.com.casadocodigo.livraria.produtos.Produto;

public abstract class Livro implements Produto {
    private String nome;
    private String descricao;
    private double valor;
    private String isbn;
    private Autor autor;
    private boolean impresso;

    public Livro(Autor autor) {
        this();
        this.autor = autor;
        this.impresso = true;
    }

    public  Livro(){
        this.isbn = "000-00-0000-00-0";
    }

    public void mostrarDetalhes() {
        System.out.println("Mostrando detalhes do livro");
        System.out.println("Nome: " + nome);
        System.out.println("Descrição: " + descricao);
        System.out.println("Valor: " + valor);
        System.out.println("ISBN: " + isbn);
        if(this.temAutor()){
            autor.mostrarDetalhes();
        }
        System.out.println("---");
    }



                                       // A palavra reservada this é usada para mostrar que valor é um atributo
                                      // da classe , é sempre usar para mostrar o que é um atributo da classe e
                                      // não parecer uma simples variavel


    boolean temAutor(){
        return this.autor !=null;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    public boolean isImpresso() {
        return impresso;
    }

    public void setImpresso(boolean impresso) {
        this.impresso = impresso;
    }
}
