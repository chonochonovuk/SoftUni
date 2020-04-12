package cresla.entities.modules;

import cresla.interfaces.AbsorbingModule;

public abstract class AbsorberModules extends Modules implements AbsorbingModule {

    private int heatAbsorbing;

    AbsorberModules(int id, int heatAbsorbing) {
        super(id);
        this.heatAbsorbing = heatAbsorbing;
    }

    @Override
    public int getHeatAbsorbing() {
        return this.heatAbsorbing;
    }

    @Override
    public String toString() {
        return super.toString() + String.format("Heat Absorbing: %d",this.getHeatAbsorbing());
    }
}
