import orcamento.Orcamento;
import pedido.GeraPedido;
import pedido.GeraPedidoHandler;
import pedido.Pedido;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class TestesPedidos {
    public static void main(String[] args) {
        String cliente = args[0];
        BigDecimal valorOrcamento = new BigDecimal(args[1]);
        int quantidadesItens = Integer.parseInt(args[2]);

        GeraPedido gerarPedido = new GeraPedido(cliente, valorOrcamento, quantidadesItens);
        GeraPedidoHandler handler = new GeraPedidoHandler(/*dependencias*/);
        handler.execute(gerarPedido);

    }
}
