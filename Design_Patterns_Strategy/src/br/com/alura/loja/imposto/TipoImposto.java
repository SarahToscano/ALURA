package br.com.alura.loja.imposto;

import br.com.alura.loja.orcamento.Orcamento;

import java.math.BigDecimal;

public interface TipoImposto {

    BigDecimal calcular(Orcamento orcamento);
}
