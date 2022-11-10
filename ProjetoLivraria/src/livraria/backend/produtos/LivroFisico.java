package livraria.backend.produtos;

import livraria.backend.Autor;

public class LivroFisico extends Livro{
    public LivroFisico(Autor autor) {
        super(autor);
    }

    public double getTaxaImpressao(){
        return this.getValor() * 0.05;
    }
}
