package br.com.alura.loja;

import br.com.alura.loja.desconto.CalculadoraDeDesconto;
import br.com.alura.loja.imposto.CalculadoraDeImpostos;
import br.com.alura.loja.imposto.ISS;
import br.com.alura.loja.orcamento.Orcamento;

import java.math.BigDecimal;

public class TestesDescontos {
    public static void main(String[] args) {
        Orcamento orcamento1 = new Orcamento( new BigDecimal("200"), 7);
        CalculadoraDeDesconto calculadora = new CalculadoraDeDesconto();
        System.out.println(calculadora.calcular(orcamento1));

        Orcamento orcamento2 = new Orcamento( new BigDecimal("600"), 1);
        calculadora = new CalculadoraDeDesconto();
        System.out.println(calculadora.calcular(orcamento2));


    }
}
