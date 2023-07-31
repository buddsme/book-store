package com.andersen.models;

import java.util.Arrays;

import com.andersen.enums.AppCommand;
import com.andersen.enums.actions.CommandAction;

public class ParsedInput {

    private AppCommand command;
    private CommandAction action;
    private String[] args;

    public ParsedInput(AppCommand command) {
        this(command, null, null);
    }

    public ParsedInput(AppCommand command, CommandAction action, String[] args) {
        this.command = command;
        this.action = action;
        this.args = args;
    }

    public AppCommand getCommand() {
        return command;
    }

    public CommandAction getAction() {
        return action;
    }

    public String[] getArgs() {
        return args;
    }

    @Override
    public String toString() {
        return "ParsedInput [command=" + command + ", action=" + action + ", args=" + Arrays.toString(args) + "]";
    }
}
