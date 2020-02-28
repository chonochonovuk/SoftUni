package jediGalaxy;

public class Evil {
    private int x;
    private int y;
    public Evil(int x,int y){
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
    public boolean checkXY(){
        return this.x >= 0 && this.y >= 0;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }
}
