package jediGalaxy;

public class Player {
    private int x;
    private int y;
    public Player(int x,int y){
        this.x = x;
        this.y = y;
    }

    public boolean checkY(int a,int b) {
        return this.y >= a && this.y < b;
    }
    public boolean checkX(int a,int b) {
        return this.x >= a && this.x < b;
    }
    public boolean checkXY(int a,int b) {
        return this.x >= a && this.y < b;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}
