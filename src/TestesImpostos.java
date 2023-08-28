import desconto.CalculadoraDeDescontos;
import imposto.CalculadoraDeImpostos;
import imposto.ISS;
import orcamento.Orcamento;

import java.math.BigDecimal;

public class TestesImpostos {
    public static void main(String[] args) {
        Orcamento orcamento = new Orcamento(new BigDecimal("1000"), 2);
//        CalculadoraDeImpostos calculadora = new CalculadoraDeImpostos();
//        System.out.println(calculadora.calcular(orcamento, new ISS()));
        CalculadoraDeDescontos caluladora = new CalculadoraDeDescontos();
        System.out.println(caluladora.calcular(orcamento));
    }
}
