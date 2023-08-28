package pedido;

import orcamento.Orcamento;

import java.time.LocalDateTime;

public class GeraPedidoHandler {
//    Construtor com injecao de dependencias

    public void execute(GeraPedido dados){
        Orcamento orcamento = new Orcamento(dados.getValorPedido(), dados.getQuantidadesPedido());
        Pedido pedido = new Pedido(dados.getCliente(), LocalDateTime.now(), orcamento);

        System.out.println("Salvar pedido no Banco de Dados");
        System.out.println("Enviar email com dados do novo pedido");
    }
}
