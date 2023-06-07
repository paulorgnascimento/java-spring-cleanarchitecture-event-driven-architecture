package com.paulorgnascimento.cleanarchitecture.domain.event;

import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class EventoDominioEventListener {

    @EventListener
    public void handleOrderCreatedEvent(EventoDominioEvent event) {
        System.out.println("Pedido criado com ID: " + event.getOrderId());

        
    }
}