package com.andersen.models;

import java.util.Arrays;

import com.andersen.enums.AppEntity;
import com.andersen.enums.actions.EntityAction;

public class ParsedCommand {

    private AppEntity entity;
    private EntityAction action;
    private String[] args;

    public AppEntity getEntity() {
        return entity;
    }

    public void setEntity(AppEntity entity) {
        this.entity = entity;
    }

    public EntityAction getAction() {
        return action;
    }

    public void setAction(EntityAction action) {
        this.action = action;
    }

    public String[] getArgs() {
        return args;
    }

    public void setArgs(String[] args) {
        this.args = args;
    }

    @Override
    public String toString() {
        return "ParsedCommand [entity=" + entity + ", action=" + action + ", args=" + Arrays.toString(args) + "]";
    }
}
