package cresla.entities.modules;

import cresla.interfaces.EnergyModule;


public abstract class EnergyModules extends Modules implements EnergyModule {

    private int energyOutput;

   EnergyModules(int id, int energyOutput) {
        super(id);
        this.energyOutput = energyOutput;
    }

    @Override
    public int getEnergyOutput() {
        return this.energyOutput;
    }

    @Override
    public String toString() {
        return super.toString() + String.format("Energy Output: %d",this.getEnergyOutput());
    }
}
