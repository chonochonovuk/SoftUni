package entities;

import entities.interfaces.Tank;

public class TankImpl extends BaseMachine implements Tank {

    private boolean defenseMode = true;
    private static final double attackPointsModifier = 40.00;
    private static final double deffencePointsModifier = 30.00;


    public TankImpl(String name, double attackPoints, double defensePoints) {
        super(name, attackPoints  - attackPointsModifier, defensePoints + deffencePointsModifier, 100);
    }

    @Override
    public boolean getDefenseMode() {
        return this.defenseMode;
    }

    @Override
    public void toggleDefenseMode() {
        if (this.getDefenseMode()){
            this.defenseMode = false;
            this.defenseOff(attackPointsModifier,deffencePointsModifier);
        }else {
            this.defenseMode = true;
            this.defenseOn(attackPointsModifier,deffencePointsModifier);
        }
    }

    @Override
    public String toString() {
        String on = this.getDefenseMode() ? "ON" : "OFF";
        return super.toString() + " *Defense Mode(" + on + ")";
    }
}
