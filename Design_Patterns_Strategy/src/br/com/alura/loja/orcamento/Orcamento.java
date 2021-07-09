package br.com.alura.loja.orcamento;

import java.math.BigDecimal;

public class Orcamento {
    private BigDecimal valor;
    private int quant_intem;

    public Orcamento(BigDecimal valor, int quant_intem) {
        this.valor = valor;
        this.quant_intem=quant_intem;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public  int getQuantidadeItens(){
        return quant_intem;
    }
}
