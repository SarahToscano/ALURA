package br.com.alura.loja.desconto;

import br.com.alura.loja.orcamento.Orcamento;

import java.math.BigDecimal;

public class DescontoMaisDe5Itens extends Desconto{
    public DescontoMaisDe5Itens (Desconto proximo){
        super(proximo);
    }
    public BigDecimal calcular (Orcamento orcamento){
        if(orcamento.getQuantidadeItens()>5){
            return  orcamento.getValor().multiply(new BigDecimal("0.1"));
        }
        else{
            return  proximo.calcular(orcamento);
        }
    }
}
