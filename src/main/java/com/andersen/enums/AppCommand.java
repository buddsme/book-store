package com.andersen.enums;

import java.util.Collections;
import java.util.List;

import com.andersen.enums.actions.BookAction;
import com.andersen.enums.actions.CommandAction;
import com.andersen.enums.actions.OrderAction;
import com.andersen.enums.actions.RequestAction;

public enum AppCommand {

    EXIT("exit", false, Collections.emptyList()),
    
    BOOK("book", true, List.of(BookAction.LIST, BookAction.ADD)),
    REQUEST("request", true, List.of(RequestAction.LIST)),
    ORDER("order", true, List.of(OrderAction.LIST, OrderAction.CREATE, OrderAction.COMPLETE, OrderAction.CANCEL)),
    CLIENT("client", true, Collections.emptyList());

    private String strValue;
    private boolean isActionable;
    private List<CommandAction> actions;

    AppCommand(String strValue, boolean isActionable, List<CommandAction> actions) {
        this.strValue = strValue;
        this.isActionable = isActionable;
        this.actions = actions;
    }

    public String getStrValue() {
        return strValue;
    }

    public List<CommandAction> getActions() {
        return actions;
    }

    public boolean isActionable() {
        return isActionable;
    }
}
