package jediGalaxy;

public class Matrix {

    private int[][] matrix;
    public Matrix(int x,int y){
        this.matrix = new int[x][y];
    }

    public void setMatrixElement(int a,int b,int c) {
        this.matrix[a][b] = c;
    }

    public int getMatrixElement(int a,int b) {
       return this.matrix[a][b];
    }

    public int getMatrixRowLength(){
        return this.matrix.length;
    }
    public int getMatrixColLength(int f){
        return this.matrix[f].length;
    }
}
