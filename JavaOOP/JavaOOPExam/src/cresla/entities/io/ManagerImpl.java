package cresla.entities.io;

import cresla.entities.modules.AbsorberModules;
import cresla.entities.modules.CooldownSystem;
import cresla.entities.modules.CryogenRod;
import cresla.entities.modules.HeatProcessor;
import cresla.entities.reactors.CryoReactor;
import cresla.entities.reactors.HeatReactor;
import cresla.interfaces.*;
import cresla.interfaces.Module;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ManagerImpl implements Manager {
    private static int id;
    private Map<Integer, Reactor> reactorRepository;
    private Map<Integer, Module> moduleRepository;

    public ManagerImpl(){
        this.reactorRepository = new HashMap<>();
        this.moduleRepository = new HashMap<>();
        id = 1;
    }


    @Override
    public String reactorCommand(List<String> arguments) {
         String type = arguments.get(0);
         int heatOrCryoIndex = Integer.parseInt(arguments.get(1));
         int capacity = Integer.parseInt(arguments.get(2));
         Reactor reactor = null;
         switch (type){
             case "Cryo":
                 reactor = new CryoReactor(id,capacity,heatOrCryoIndex);
                 break;
             case "Heat":
                 reactor = new HeatReactor(id,capacity,heatOrCryoIndex);
                 break;
         }
         this.reactorRepository.put(id,reactor);
         return String.format("Created %s Reactor – %d",type,id++);
    }


    @Override
    public String moduleCommand(List<String> arguments) {
        String type = arguments.get(1);
        int reactorId = Integer.parseInt(arguments.get(0));
        int additionalParameter = Integer.parseInt(arguments.get(2));

        switch (type){
            case "CryogenRod":
                this.reactorRepository.get(reactorId).addEnergyModule(new CryogenRod(id,additionalParameter));
                this.moduleRepository.put(id,new CryogenRod(id,additionalParameter));
                break;
            case "HeatProcessor":
                this.reactorRepository.get(reactorId).addAbsorbingModule(new HeatProcessor(id,additionalParameter));
                this.moduleRepository.put(id,new HeatProcessor(id,additionalParameter));
                break;
            case "CoolingSystem":
                this.reactorRepository.get(reactorId).addAbsorbingModule(new CooldownSystem(id,additionalParameter));
                this.moduleRepository.put(id,new CooldownSystem(id,additionalParameter));
                break;
        }
        return String.format("Added %s - %d to Reactor - %d",type,id++,reactorId);
    }

    @Override
    public String reportCommand(List<String> arguments) {
        int reportId = Integer.parseInt(arguments.get(0));
        String output = null;
        if (this.reactorRepository.containsKey(reportId)){
            output = this.reactorRepository.get(reportId).toString();
        }else {
            output = this.moduleRepository.get(reportId).toString();
        }
        return output;
    }

    @Override
    public String exitCommand(List<String> arguments) {
        int cryo = 0;
        int heat = 0;
        long totalEnergyOutput = 0;
        long totalHeatAbsorbing = 0;
        for (Reactor value : reactorRepository.values()) {
            if (value instanceof CryoReactor){
                cryo++;
                if (value.getTotalEnergyOutput() < value.getTotalHeatAbsorbing()){
                    totalEnergyOutput += value.getTotalEnergyOutput();
                }
                 totalHeatAbsorbing += value.getTotalHeatAbsorbing();
            }
            if (value instanceof HeatReactor){
                heat++;
                if (value.getTotalEnergyOutput() < value.getTotalHeatAbsorbing()){
                    totalEnergyOutput += value.getTotalEnergyOutput();
                }
                totalHeatAbsorbing += value.getTotalHeatAbsorbing();
            }
        }
        int energy = 0;
        int absorb = 0;
        for (Module value : moduleRepository.values()) {
            if (value instanceof EnergyModule){
                energy++;
            }
            if (value instanceof AbsorbingModule){
                absorb++;
            }
        }

        StringBuilder sb = new StringBuilder("Cryo Reactors: ").append(cryo);
        sb.append(System.lineSeparator());
        sb.append("Heat Reactors: ").append(heat).append(System.lineSeparator());
        sb.append("Energy Modules: ").append(energy).append(System.lineSeparator());
        sb.append("Absorbing Modules: ").append(absorb).append(System.lineSeparator());
        sb.append("Total Energy Output: ").append(totalEnergyOutput).append(System.lineSeparator());
        sb.append("Total Heat Absorbing: ").append(totalHeatAbsorbing);

        return sb.toString();
    }
}
