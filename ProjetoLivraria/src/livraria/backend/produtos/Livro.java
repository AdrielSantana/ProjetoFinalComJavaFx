package livraria.backend.produtos;

import livraria.backend.Autor;

public abstract class Livro{
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
