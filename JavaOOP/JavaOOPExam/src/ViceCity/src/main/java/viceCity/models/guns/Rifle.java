package viceCity.models.guns;

public class Rifle extends BaseGun {
    private static final int BULLETS_PER_BARREL = 50;

    public Rifle(String name) {
        super(name, BULLETS_PER_BARREL, 500);
    }

    @Override
    public int fire() {
        return this.shootFromTotal(5);
    }
}
