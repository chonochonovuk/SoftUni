package domain.comands;


import domain.exceptions.InvalidCurrencyException;
import domain.external.CurrencyValidator;
import domain.external.ExchangeService;
import domain.io.Logger;
import domain.repository.ConversionHistoryRepository;

public class ValidatedHistorySavingConvertCommand extends HistorySavingConvertCommand {

    private CurrencyValidator validator;

    public ValidatedHistorySavingConvertCommand(ExchangeService exchangeService,
                                                Logger logger,
                                                ConversionHistoryRepository repo,
                                                CurrencyValidator validator) {
        super(exchangeService, logger, repo);
        this.validator = validator;
    }

    @Override
    public void execute(Input input) throws InvalidCurrencyException{
            validator.validate(input.getFrom().getCurrency());
            validator.validate(input.getToCurrency());

        super.execute(input);
    }
}
