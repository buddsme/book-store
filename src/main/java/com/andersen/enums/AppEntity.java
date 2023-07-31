package com.andersen.enums;

import java.util.List;

import com.andersen.enums.actions.BookAction;
import com.andersen.enums.actions.EntityAction;
import com.andersen.enums.actions.OrderAction;
import com.andersen.enums.actions.RequestAction;

public enum AppEntity {
    
    BOOK("book", List.of(BookAction.LIST, BookAction.ADD)),
    REQUEST("request", List.of(RequestAction.LIST)),
    ORDER("order", List.of(OrderAction.LIST, OrderAction.CREATE, OrderAction.COMPLETE, OrderAction.CANCEL)),
    CLIENT("client", List.of());

    private String strValue;
    private List<EntityAction> actions;

    AppEntity(String strValue, List<EntityAction> actions) {
        this.strValue = strValue;
        this.actions = actions;
    }

    public String getStrValue() {
        return strValue;
    }

    public List<EntityAction> getActions() {
        return actions;
    }
}
