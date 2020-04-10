package entities;

import entities.interfaces.Machine;
import entities.interfaces.Pilot;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public abstract class BaseMachine implements Machine {

    private String name;
    private Pilot pilot;
    private double attackPoints;
    private double defensePoints;
    private double healthPoints;
    private List<String> targets;

    protected BaseMachine(String name, double attackPoints, double defensePoints, double healthPoints) {
        this.setName(name);
        this.attackPoints = attackPoints;
        this.defensePoints = defensePoints;
        this.setHealthPoints(healthPoints);
        this.targets = new ArrayList<>();
    }


    protected void aggressiveOn(double attackPoints,double defensePoints){
        this.attackPoints = this.getAttackPoints() + attackPoints;
        this.defensePoints = this.getDefensePoints() - defensePoints;
    }

    protected void aggressiveOff(double attackPoints,double defensePoints){
        this.attackPoints = this.getAttackPoints() - attackPoints;
        this.defensePoints = this.getDefensePoints() + defensePoints;
    }

    protected void defenseOn(double attackPoints,double defensePoints){
        this.attackPoints = this.getAttackPoints() - attackPoints;
        this.defensePoints = this.getDefensePoints() + defensePoints;
    }

    protected void defenseOff(double attackPoints,double defensePoints){
        this.attackPoints = this.getAttackPoints() + attackPoints;
        this.defensePoints = this.getDefensePoints() - defensePoints;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public void setName(String name) {
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("Machine name cannot be null or empty.");
        }
        this.name = name;
    }

    @Override
    public Pilot getPilot() {
        return this.pilot;
    }

    @Override
    public void setPilot(Pilot pilot) {
        if (pilot == null) {
            throw new NullPointerException("Pilot cannot be null.");
        }
        this.pilot = pilot;
    }

    @Override
    public double getHealthPoints() {
        return this.healthPoints;
    }

    @Override
    public void setHealthPoints(double healthPoints) {
        this.healthPoints = healthPoints;
    }


    @Override
    public double getAttackPoints() {
        return this.attackPoints;
    }

    @Override
    public double getDefensePoints() {
        return this.defensePoints;
    }

    @Override
    public List<String> getTargets() {
        return Collections.unmodifiableList(this.targets);
    }

    @Override
    public void attack(String target) {
        if (target == null || target.trim().isEmpty()){
            throw new IllegalArgumentException("Attack target cannot be null or empty string.");
        }

        this.targets.add(target);
    }

    @Override
    public String toString() {
        String impl = this.getClass().getSimpleName().replace("Impl","");;
        StringBuilder sb = new StringBuilder();
        sb.append("- ").append(this.getName());
        sb.append(System.lineSeparator());
        sb.append(" *Type: ").append(impl);
        sb.append(System.lineSeparator());
        sb.append(String.format(" *Health: %.2f",this.getHealthPoints()));
        sb.append(System.lineSeparator());
        sb.append(String.format(" *Attack: %.2f",this.getAttackPoints()));
        sb.append(System.lineSeparator());
        sb.append(String.format(" *Defense: %.2f",this.getDefensePoints()));
        sb.append(System.lineSeparator());
        if (this.targets.isEmpty()){
            sb.append("None");
        }else {
            sb.append(this.targets.toString().replaceAll("[\\[\\]]",""));
        }
        sb.append(System.lineSeparator());
        return sb.toString();
    }


}
