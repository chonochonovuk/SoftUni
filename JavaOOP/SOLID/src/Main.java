import append.Appender;
import append.AppenderFactory;
import append.AppenderWorkshop;
import append.ConsoleAppender;
import layout.Layout;
import layout.LayoutFactory;
import layout.LayoutWorkshop;
import layout.SimpleLayout;
import logger.Logger;
import logger.MessageLogger;
import massageIO.ReportLevel;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        Layout simpleLayout = new SimpleLayout();
//        Appender consoleAppender = new ConsoleAppender(simpleLayout);
//        Logger logger = new MessageLogger(consoleAppender);
//
//        logger.logError("3/26/2015 2:08:11 PM", "Error parsing JSON.");
//        logger.logInfo("3/26/2015 2:08:11 PM", "User Pesho successfully registered.");

        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        AppenderFactory appenderFactory = new AppenderWorkshop();
        LayoutFactory layoutFactory = new LayoutWorkshop();
        Logger logger = new MessageLogger();


        while (n-- > 0){
            String[] input = scanner.nextLine().split("\\s+");

            ReportLevel reportLevel = input.length == 3
                    ? ReportLevel.valueOf(input[2].toUpperCase())
                    : ReportLevel.INFO;

            Appender appender = appenderFactory.produce(input[0],reportLevel,layoutFactory.produce(input[1]));
            logger.addAppender(appender);
        }

        String command;
        while (!"END".equals(command = scanner.nextLine())){
            String[] array = command.split("\\|");
            ReportLevel reportLevel = ReportLevel.valueOf(array[0]);
            String date = array[1];
            String message = array[2];

            switch (reportLevel){
                case INFO -> logger.logInfo(date,message);
                case WARNING -> logger.logWarning(date,message);
                case ERROR -> logger.logError(date,message);
                case CRITICAL -> logger.logCritical(date,message);
                case FATAL -> logger.logFatal(date,message);
                default -> throw new IllegalStateException("Unknown enum type of" + reportLevel);
            }
        }

        System.out.println(logger.toString());

    }
}
