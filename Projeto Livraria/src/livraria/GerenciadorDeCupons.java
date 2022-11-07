package livraria;

import java.util.HashMap;
import java.util.Map;

public class GerenciadorDeCupons {
    private Map<String, Double> cupons;

    public GerenciadorDeCupons() {

        this.cupons = new HashMap<>(0);
        
        cupons.put("off13", 13.0);
    }

    public boolean adicionaCupom(String cupom, Double valor) {
        if (cupons.containsKey(cupom)) {
            return false;
        } else {
            cupons.put(cupom, valor);
            return true;
        }
    }

    public Double validaCupom(String cupom) {
        return this.cupons.get(cupom);
    }

}
