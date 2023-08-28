package desconto;

import orcamento.Orcamento;

import java.math.BigDecimal;
//Aqui nos vamos fazer um encadeamento dos descontos, caso nao seja o primeiro, passa para o segundo e caso n seja o segundo
//é pq nao tem desconto, ai retorna o SemDesconto
public class CalculadoraDeDescontos {
    public BigDecimal calcular(Orcamento orcamento){
        Desconto desconto = new DescontoCincoIntes(new DescontoPrecoMaior(new SemDesconto()));

        return desconto.calcular(orcamento);
    }
}
