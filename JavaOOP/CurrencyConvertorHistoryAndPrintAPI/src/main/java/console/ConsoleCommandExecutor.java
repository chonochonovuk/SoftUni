package console;


import domain.commandInterpreter.CurrencyConvertor;
import domain.commandInterpreter.Exit;

public class ConsoleCommandExecutor {
    private String[] commandExtract;

    public ConsoleCommandExecutor(String[] commandExtract){
        this.setType(commandExtract);
    }

    public void setType(String[] commandExtract) {
        if(commandExtract.length == 0){
            throw new IllegalStateException("Cannot accept empty command!!!");
        }
        this.commandExtract = commandExtract;
    }

    public void execute() {

        switch (this.commandExtract[0]) {
            case "END":
                Exit exit = () -> System.exit(0);
                break;
            case "CONVERT":

                new CurrencyConvertor();
                break;
            case "HISTORY":
                history(args);
                break;
            default:
                logger.logLine("incorrect command");
        }
    }


    //    CONVERT 5.5 BGN EUR
    private void convert(String[] split) {
        BigDecimal fromValue = new BigDecimal(split[1]);
        String fromCurrency = split[2];
        String toCurrency = split[3];

        try{
            ConvertCommand.Input input = new ConvertCommand.Input(
                    new Money(fromValue, fromCurrency),
                    toCurrency
            );
            new ValidatedHistorySavingConvertCommand(
                    exchangeService,
                    logger,
                    conversionHistoryRepository,
                    currencyValidator).execute(input);
        }catch (IllegalArgumentException | InvalidCurrencyException ex){
            logger.logLine(ex.getMessage());
        }

    }

    private void history(String[] split) {
        Command<HistoryCommand.Input> cmd = new HistoryCommand(conversionHistoryRepository, logger);
        cmd.execute(new HistoryCommand.Input(Integer.parseInt(split[1])));
    }

}
