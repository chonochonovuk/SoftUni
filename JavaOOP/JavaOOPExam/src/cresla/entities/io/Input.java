package cresla.entities.io;

import cresla.interfaces.InputReader;
import cresla.interfaces.Manager;
import cresla.interfaces.OutputWriter;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Input implements InputReader {
    @Override
    public String readLine() {
        Scanner scanner = new Scanner(System.in);
        Manager manager = new ManagerImpl();
        OutputWriter outputWriter = new Output();

        String command;
        while (!"Exit".equals(command = scanner.nextLine())){
            String[] array = command.split("\\s+");
            String commandType = array[0];

            switch (commandType){
                case "Reactor":
                    String reactor = manager.reactorCommand(List.of(array[1],array[2],array[3]));
                    outputWriter.writeLine(reactor);
                    break;
                case "Module":
                    String module = manager.moduleCommand(List.of(array[1],array[2],array[3]));
                    outputWriter.writeLine(module);
                    break;
                case "Report":
                    String report = manager.reportCommand(List.of(array[1]));
                    outputWriter.writeLine(report);
                    break;
            }
        }

        String exit = manager.exitCommand(new ArrayList<>());
        outputWriter.writeLine(exit);
        return null;
    }
}
