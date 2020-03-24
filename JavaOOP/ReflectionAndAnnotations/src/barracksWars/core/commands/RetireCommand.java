package barracksWars.core.commands;

import barracksWars.interfaces.Inject;
import barracksWars.interfaces.Repository;



public class RetireCommand extends Command {

    @Inject
    private String[] data;
    @Inject
    private Repository repository;

    public RetireCommand() {

    }

    @Override
    public String execute() {
        String unitType = data[1];
        try {
            this.repository.removeUnit(unitType);
            return unitType + " retired!";
        }catch (IllegalStateException ex){
            return ex.getMessage();
        }
    }
}
