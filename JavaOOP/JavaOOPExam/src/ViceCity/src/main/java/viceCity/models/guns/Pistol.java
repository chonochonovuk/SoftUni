package viceCity.models.guns;

public class Pistol extends BaseGun {
    private static final int BULLETS_PER_BARREL = 10;
    public Pistol(String name) {
        super(name, BULLETS_PER_BARREL, 100);
    }

    @Override
    public int fire() {
        return this.shootFromTotal(1);
    }
}
