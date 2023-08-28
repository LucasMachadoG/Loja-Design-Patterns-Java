package desconto;

import orcamento.Orcamento;

import java.math.BigDecimal;

public class DescontoCincoIntes extends Desconto {
    public DescontoCincoIntes(Desconto proximo) {
        super(proximo);
    }

    @Override
    protected BigDecimal efetuarCalculo(Orcamento orcamento) {
        return orcamento.getValor().multiply(new BigDecimal("0.1"));
    }

    @Override
    public boolean deveAplicar(Orcamento orcamento) {
        return orcamento.getQuantidadeItens() > 5;
    }
}
