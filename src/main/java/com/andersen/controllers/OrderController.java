package com.andersen.controllers;

import java.util.List;

import com.andersen.models.BookOrder;

public interface OrderController {
    
    void list(Long clientId, String sortKey);
    void complete(Long orderId);
    void create(Long clientId, List<BookOrder> books);
    void cancel(Long orderId);
}
