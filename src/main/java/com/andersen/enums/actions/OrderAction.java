package com.andersen.enums.actions;

public enum OrderAction implements CommandAction {
    
    LIST("list", 2),
    COMPLETE("complete", 1),
    CREATE("create", 2),
    CANCEL("cancel", 1);

    private String strValue;
    private int argsAmount;

    OrderAction(String strValue, int argsAmount) {
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
