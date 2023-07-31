package com.andersen.enums.actions;

public enum BookAction implements CommandAction {
    
    LIST("list", 1),
    ADD("add", 2);

    private String strValue;
    private int argsAmount;

    BookAction(String strValue, int argsAmount) {
        this.strValue = strValue;
        this.argsAmount = argsAmount;
    }

    @Override
    public String getStrValue() {
        return strValue;
    }

    @Override
    public int getArgsAmount() {
        return argsAmount;
    }
}
