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
        this.setAlive(health);
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
    protected void setAlive(int health){
        if (health > 0){
            this.isAlive = true;
        }
        this.isAlive = false;
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
        return this.isAlive;
    }

    @Override
    public void takeDamage(int points) {
        if ((this.getArmor() - points) >= 0){
            this.setArmor(this.getArmor() - points);
        }else {
            int abs = Math.abs((this.getArmor() - points));
            if ((this.getHealth() - abs) > 0){
                this.setHealth(this.getHealth() - abs);
                this.setAlive(this.getHealth());
            }else {
                this.setHealth(0);
                this.setAlive(0);
            }
        }
    }
}
