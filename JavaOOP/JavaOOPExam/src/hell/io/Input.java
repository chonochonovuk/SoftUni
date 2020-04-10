package hell.io;

import hell.interfaces.InputReader;
import hell.interfaces.Manager;
import hell.interfaces.OutputWriter;


import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Input implements InputReader {
    @Override
    public String readLine() {
        Manager manager = new ManagerImpl();
        OutputWriter outputWriter = new Output();
        Scanner scanner = new Scanner(System.in);
        String command;
        while (!"Quit".equals(command = scanner.nextLine())){
            String[] array = command.split("\\s+");
            String commandType = array[0];
            switch (commandType){
                case "Hero":
                    String heroPrint = manager.addHero(List.of(array[1],array[2]));
                    outputWriter.writeLine(heroPrint);
                    break;
                case "Item":
                    String itemPrint = manager.addItem(List.of(array[1],array[2],array[3],array[4],array[5],array[6],array[7]));
                    outputWriter.writeLine(itemPrint);
                    break;
                case "Recipe":
                    String recipePrint = manager.addRecipe(Arrays.asList(array));
                    outputWriter.writeLine(recipePrint);
                    break;
                case "Inspect":
                    String inspectPrint = manager.inspect(Arrays.asList(array));
                    outputWriter.writeLine(inspectPrint);
                    break;
            }
        }

        outputWriter.writeLine(manager.quit());
        return null;
    }
}
