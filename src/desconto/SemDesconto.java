package desconto;

import orcamento.Orcamento;

import java.math.BigDecimal;

//Essa classe vai ter um retorno null, dizendo que eh o fim da linha dos descontos
public class SemDesconto extends Desconto{

    public SemDesconto() {
        super(null);
    }

    @Override
    public BigDecimal efetuarCalculo(Orcamento orcamento) {
        return BigDecimal.ZERO;
    }

    @Override
    public boolean deveAplicar(Orcamento orcamento) {
        return true;
    }
}
