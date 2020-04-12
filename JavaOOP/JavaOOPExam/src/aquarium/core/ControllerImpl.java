package aquarium.core;

import aquarium.common.ConstantMessages;
import aquarium.common.ExceptionMessages;
import aquarium.models.aquariums.Aquarium;
import aquarium.models.aquariums.FreshwaterAquarium;
import aquarium.models.aquariums.SaltwaterAquarium;
import aquarium.models.decorations.Decoration;
import aquarium.models.decorations.Ornament;
import aquarium.models.decorations.Plant;
import aquarium.models.fish.Fish;
import aquarium.models.fish.FreshwaterFish;
import aquarium.models.fish.SaltwaterFish;
import aquarium.repositories.DecorationRepository;
import aquarium.repositories.Repository;

import java.util.HashMap;
import java.util.Map;

public class ControllerImpl implements Controller {
    private Repository decorations;
    private Map<String,Aquarium> aquariums;

    public ControllerImpl() {
        this.decorations = new DecorationRepository();
        this.aquariums = new HashMap<>();
    }

    @Override
    public String addAquarium(String aquariumType, String aquariumName) {
        Aquarium aquarium = null;
        switch (aquariumType){
            case "FreshwaterAquarium":
                aquarium = new FreshwaterAquarium(aquariumName);
                break;
            case "SaltwaterAquarium":
                aquarium = new SaltwaterAquarium(aquariumName);
                break;
            default:
                throw new IllegalArgumentException(ExceptionMessages.INVALID_AQUARIUM_TYPE);
        }
        this.aquariums.put(aquariumName,aquarium);
        return String.format(ConstantMessages.SUCCESSFULLY_ADDED_AQUARIUM_TYPE,aquariumType);
    }



    @Override
    public String addDecoration(String type) {
        switch (type){
            case "Ornament":
                this.decorations.add(new Ornament());
                break;
            case "Plant":
                this.decorations.add(new Plant());
                break;
            default:
                throw new IllegalArgumentException(ExceptionMessages.INVALID_DECORATION_TYPE);
        }
        return String.format(ConstantMessages.SUCCESSFULLY_ADDED_DECORATION_TYPE,type);
    }

    @Override
    public String insertDecoration(String aquariumName, String decorationType) {
        Aquarium aquarium = this.aquariums.get(aquariumName);
        Decoration decoration = this.decorations.findByType(decorationType);
        if (decoration == null){
            throw new IllegalArgumentException(String.format(ExceptionMessages.NO_DECORATION_FOUND,decorationType));
        }

        this.decorations.remove(decoration);
        aquarium.addDecoration(decoration);

        return String.format(ConstantMessages.SUCCESSFULLY_ADDED_DECORATION_IN_AQUARIUM,decorationType,aquariumName);
    }

    @Override
    public String addFish(String aquariumName, String fishType, String fishName, String fishSpecies, double price) {
        Fish fish = null;
        switch (fishType){
            case "FreshwaterFish":
                fish = new FreshwaterFish(fishName,fishSpecies,price);
                if (!(this.aquariums.get(aquariumName) instanceof FreshwaterAquarium)){
                    return ConstantMessages.WATER_NOT_SUITABLE;
                }
                break;
            case "SaltwaterFish":
                fish = new SaltwaterFish(fishName,fishSpecies,price);
                if (!(this.aquariums.get(aquariumName) instanceof SaltwaterAquarium)){
                    return ConstantMessages.WATER_NOT_SUITABLE;
                }
                break;
            default:
                throw new IllegalArgumentException(ExceptionMessages.INVALID_FISH_TYPE);
        }

        this.aquariums.get(aquariumName).addFish(fish);
        return String.format(ConstantMessages.SUCCESSFULLY_ADDED_FISH_IN_AQUARIUM,fishType,aquariumName);
    }

    @Override
    public String feedFish(String aquariumName) {
        Aquarium aquarium = this.aquariums.get(aquariumName);
        aquarium.feed();
        int feed = aquarium.getFish().size();
        return String.format(ConstantMessages.FISH_FED,feed);
    }

    @Override
    public String calculateValue(String aquariumName) {
        Aquarium aquarium = this.aquariums.get(aquariumName);
        double fishPrice = aquarium.getFish().stream().mapToDouble(Fish::getPrice).sum();
        double decorPrice = aquarium.getDecorations().stream().mapToDouble(Decoration::getPrice).sum();
        return String.format(ConstantMessages.VALUE_AQUARIUM,aquariumName,(fishPrice + decorPrice));
    }

    @Override
    public String report() {
        StringBuilder sb = new StringBuilder();
        for (Aquarium value : aquariums.values()) {
            sb.append(value.getInfo());
            sb.append(System.lineSeparator());
        }
        return sb.toString();
    }
}
