package br.com.alura.loja.imposto;

import br.com.alura.loja.orcamento.Orcamento;

import java.math.BigDecimal;

public class CalculadoraDeImpostos {
    public BigDecimal calcular(Orcamento  orcamento, TipoImposto tipoImposto){
        return tipoImposto.calcular(orcamento);
    }
}

