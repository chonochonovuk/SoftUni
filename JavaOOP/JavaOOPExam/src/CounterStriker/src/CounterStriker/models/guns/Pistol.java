package CounterStriker.models.guns;

public class Pistol extends GunImpl {
    public Pistol(String name, int bulletsCount) {
        super(name, bulletsCount);
    }

    @Override
    public int fire() {
        if ((this.getBulletsCount() - 1) <= 0){
            this.setBulletsCount(0);
            return 0;
        }
        this.setBulletsCount(this.getBulletsCount() - 1);
        return 1;
    }
}
