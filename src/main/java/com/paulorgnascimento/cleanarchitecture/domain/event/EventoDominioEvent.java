/*
De acordo com a DDD, um evento de domínio é uma representação de um evento significativo para o domínio de negócio.
Por exemplo, em um sistema de comércio eletrônico, eventos de domínio poderiam incluir "PedidoCriado", "PagamentoRecebido", "ProdutoEnviado", entre outros.
*/
package com.paulorgnascimento.cleanarchitecture.domain.event;

import org.springframework.context.ApplicationEvent;

public class EventoDominioEvent extends ApplicationEvent {

    private final Long orderId;

    public EventoDominioEvent(Object source, Long orderId) {
        super(source);
        this.orderId = orderId;
    }

    public Long getOrderId() {
        return orderId;
    }
}