package com.andersen;

import static java.lang.System.in;
import static java.lang.System.out;

import java.nio.charset.StandardCharsets;
import java.util.Scanner;

import com.andersen.models.ParsedCommand;
import com.andersen.utils.CommandUtils;

public class App {

    private static boolean running = true;

    public static void main(String[] args) {

        Scanner scanner = new Scanner(in, StandardCharsets.UTF_8);

        out.println("Book store");
        out.println("Type 'exit' to close");
        out.println();

        while (running) {
            out.print(">>> ");
            try {

                ParsedCommand parsedCommand = CommandUtils.parseInput(scanner.nextLine());

            } catch (Exception e) {
                out.println(e.getMessage());
                out.println("Type 'exit' to close");
            }
        }

        scanner.close();
    }
}
