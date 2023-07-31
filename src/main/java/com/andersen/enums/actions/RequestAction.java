package com.andersen.enums.actions;

public enum RequestAction implements CommandAction {
    
    LIST("list", 1);

    private String strValue;
    private int argsAmount;

    RequestAction(String strValue, int argsAmount) {
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
