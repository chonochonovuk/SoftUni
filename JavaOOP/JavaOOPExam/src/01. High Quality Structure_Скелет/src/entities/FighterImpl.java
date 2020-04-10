package entities;

import entities.interfaces.Fighter;

public class FighterImpl extends BaseMachine implements Fighter {

    private boolean aggressiveMode = true;
    private static final double attackPointsModifier = 50.00;
    private static final double deffencePointsModifier = 25.00;



    public FighterImpl(String name, double attackPoints, double defensePoints) {
        super(name, attackPoints + attackPointsModifier, defensePoints - deffencePointsModifier, 200);
    }


    @Override
    public boolean getAggressiveMode() {
        return this.aggressiveMode;
    }

    @Override
    public void toggleAggressiveMode() {
        if (this.getAggressiveMode()){
            this.aggressiveMode = false;
            this.aggressiveOff(attackPointsModifier,deffencePointsModifier);
        }else {
            this.aggressiveMode = true;
            this.aggressiveOn(attackPointsModifier,deffencePointsModifier);
        }

    }

    @Override
    public String toString() {
        String onOff = this.getAggressiveMode() ? "ON" : "OFF";
        return super.toString() + " *Aggressive Mode(" + onOff + ")";
    }
}
