package pedido;

import orcamento.Orcamento;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class GeraPedido {
    private String cliente;
    private BigDecimal valorPedido;
    private int quantidadesPedido;

    public GeraPedido(String cliente, BigDecimal valorPedido, int quantidadesPedido) {
        this.cliente = cliente;
        this.valorPedido = valorPedido;
        this.quantidadesPedido = quantidadesPedido;
    }

    public String getCliente() {
        return cliente;
    }

    public BigDecimal getValorPedido() {
        return valorPedido;
    }

    public int getQuantidadesPedido() {
        return quantidadesPedido;
    }


}
