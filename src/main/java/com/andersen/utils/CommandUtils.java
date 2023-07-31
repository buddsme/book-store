package com.andersen.utils;

import static java.lang.String.format;

import java.util.Arrays;
import java.util.stream.IntStream;

import com.andersen.enums.AppEntity;
import com.andersen.enums.actions.EntityAction;
import com.andersen.models.ParsedCommand;

public class CommandUtils {

    public static ParsedCommand parseInput(String input) {
        String[] inputElements = input.split(" ");

        if (inputElements.length < 2) throw new IllegalStateException("Too few input elements, expected at least 2");

        IntStream.range(0, inputElements.length).forEach(i -> inputElements[i] = inputElements[i].trim());

        String entity = inputElements[0];
        String action = inputElements[1];

        AppEntity parsedEntity = Arrays.stream(AppEntity.values())
                .filter(item -> item.getStrValue().equals(entity))
                .findFirst()
                .orElseThrow(() -> new IllegalStateException(format("Unknown entity '%s'", entity)));

        EntityAction parsedAction = parsedEntity.getActions().stream()
                .filter(item -> item.getStrValue().equals(action))
                .findFirst()
                .orElseThrow(() -> new IllegalStateException(format("Unknown action '%s' for entity '%s'", action, entity)));

        String[] parsedArgs = Arrays.copyOfRange(inputElements, 2, inputElements.length);

        if (parsedAction.getArgsAmount() != parsedArgs.length) throw new IllegalStateException(
            format("Invalid args amount '%s' for for entity '%s', action '%s'", parsedArgs.length, entity, action)
        );

        ParsedCommand parsedCommand = new ParsedCommand();
        parsedCommand.setEntity(parsedEntity);
        parsedCommand.setAction(parsedAction);
        parsedCommand.setArgs(parsedArgs);

        return parsedCommand;
    }
}
