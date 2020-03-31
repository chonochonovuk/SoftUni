package console;

import java.util.Scanner;

public class ConsoleRunner {


    public void run() {

        Scanner scanner = new Scanner(System.in);


        while (true) {
            String line = scanner.nextLine();
            String[] split = line.split("\\s+");
            ConsoleCommandExecutor cce = new ConsoleCommandExecutor(split);
            cce.execute();
        }
    }


}
