package livraria.backend.produtos;

import livraria.backend.Autor;

public class Ebook extends Livro{

    private String waterMark;

    public Ebook(Autor autor) {
        super(autor);
        this.setImpresso(false);
    }

    public String getWaterMark() {
        return waterMark;
    }

    public void setWaterMark(String waterMark) {
        this.waterMark = waterMark;
    }
}
