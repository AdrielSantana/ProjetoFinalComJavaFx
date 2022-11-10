package livraria.backend.produtos;

import livraria.backend.Autor;

public class Ebook extends Livro implements Promocional {

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

    @Override
    public boolean aplicaDescontoDe (double porcentagem){
        if(porcentagem > 0.15){
            return false;
        }
        double desconto = this.getValor() * porcentagem;
        this.setValor(this.getValor() - desconto);
        System.out.println("aplicando desconto " + getValor());
        return true;
    }

    public int compareTo(Produto outro){
        if(this.getValor() < outro.getValor()){
            return -1;
        }
        if(this.getValor() > outro.getValor()){
            return 1;
        }
        return 0;
    }
}
