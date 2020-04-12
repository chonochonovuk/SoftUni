package CounterStriker.models.players;

import CounterStriker.common.ExceptionMessages;
import CounterStriker.models.guns.Gun;

public abstract class PlayerImpl implements Player {

    private String username;
    private int health;
    private int armor;
    private boolean isAlive;
    private Gun gun;


    protected PlayerImpl(String username, int health, int armor, Gun gun) {
        this.setName(username);
        this.setHealth(health);
        this.setArmor(armor);
        this.setGun(gun);

    }

    private void setName(String username) {
        if (username == null || username.trim().isEmpty()){
            throw new NullPointerException(ExceptionMessages.INVALID_PLAYER_NAME);
        }
        this.username = username;
    }

    protected void setHealth(int health) {
        if (health < 0){
            throw new IllegalArgumentException(ExceptionMessages.INVALID_PLAYER_HEALTH);
        }
        this.health = health;
    }

    protected void setArmor(int armor) {
        if (armor < 0){
            throw new IllegalArgumentException(ExceptionMessages.INVALID_PLAYER_ARMOR);
        }
        this.armor = armor;
    }

    private void setGun(Gun gun) {
        if (gun == null){
            throw new NullPointerException(ExceptionMessages.INVALID_GUN);
        }
        this.gun = gun;
    }


    @Override
    public String getUsername() {
        return this.username;
    }

    @Override
    public int getHealth() {
        return this.health;
    }

    @Override
    public int getArmor() {
        return this.armor;
    }

    @Override
    public Gun getGun() {
        return this.gun;
    }

    @Override
    public boolean isAlive() {
        return this.getHealth() > 0;
    }

    @Override
    public void takeDamage(int points) {
        if (this.getArmor() >= points){
            this.setArmor(this.getArmor() - points);
        }else {
            if (this.getHealth() >= points){
                this.setHealth(this.getHealth() - points);
            }
        }
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("%s: %s",this.getClass().getSimpleName(),this.getUsername()));
        sb.append(System.lineSeparator());
        sb.append(String.format("--Health: %d",this.getHealth()));
        sb.append(System.lineSeparator());
        sb.append(String.format("--Armor: %d",this.getArmor()));
        sb.append(System.lineSeparator());
        sb.append(String.format("--Gun: %s",this.getGun().getName()));

        return sb.toString();
    }
}
