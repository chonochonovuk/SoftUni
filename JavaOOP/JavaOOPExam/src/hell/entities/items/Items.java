package hell.entities.items;

import hell.interfaces.Item;

public abstract class Items implements Item {
    private String name;
    private int strengthBonus;
    private int agilityBonus;
    private int intelligenceBonus;
    private int hitPointsBonus;
    private int damageBonus;

    Items(String name, int strengthBonus, int agilityBonus, int intelligenceBonus, int hitPointsBonus, int damageBonus) {
        this.name = name;
        this.strengthBonus = strengthBonus;
        this.agilityBonus = agilityBonus;
        this.intelligenceBonus = intelligenceBonus;
        this.hitPointsBonus = hitPointsBonus;
        this.damageBonus = damageBonus;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public int getStrengthBonus() {
        return this.strengthBonus;
    }

    @Override
    public int getAgilityBonus() {
        return this.agilityBonus;
    }

    @Override
    public int getIntelligenceBonus() {
        return this.intelligenceBonus;
    }

    @Override
    public int getHitPointsBonus() {
        return this.hitPointsBonus;
    }

    @Override
    public int getDamageBonus() {
        return this.damageBonus;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("###Item: ").append(this.getName());
        sb.append(System.lineSeparator());
        sb.append("###+").append(this.getStrengthBonus()).append(" Strength");
        sb.append(System.lineSeparator());
        sb.append("###+").append(this.getAgilityBonus()).append(" Agility");
        sb.append(System.lineSeparator());
        sb.append("###+").append(this.getIntelligenceBonus()).append(" Intelligence");
        sb.append(System.lineSeparator());
        sb.append("###+").append(this.getHitPointsBonus()).append(" HitPoints");
        sb.append(System.lineSeparator());
        sb.append("###+").append(this.getDamageBonus()).append(" Damage");
        return sb.toString();
    }
}
