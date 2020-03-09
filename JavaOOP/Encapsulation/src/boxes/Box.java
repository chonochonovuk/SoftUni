package boxes;

public class Box {
//    length: double
//width:  double
//height:  double

    private double length;
    private double width;
    private double height;

    public Box(double length, double width, double height) {
        this.setLength(length);
        this.setWidth(width);
        this.setHeight(height);
    }

    public void setLength(double length) {
        if (length <= 0){
            throw new IllegalArgumentException("Width cannot be zero or negative.");
        }
        this.length = length;
    }

    public void setWidth(double width) {
        if (width <= 0){
            throw new IllegalArgumentException("Width cannot be zero or negative.");
        }
        this.width = width;
    }

    public void setHeight(double height) {
        if (height <= 0){
            throw new IllegalArgumentException("Width cannot be zero or negative.");
        }
        this.height = height;
    }
// Volume = lwh
    public double calculateVolume (){
        return (this.height*this.length*this.width);
    }

// Surface Area = 2lw + 2lh + 2wh
    public double calculateSurfaceArea (){
        return (2*this.length*this.width) + (2*this.length*this.height) + (2*this.width*this.height);
    }

//    Lateral Surface Area = 2lh + 2wh
    public double calculateLateralSurfaceArea (){
        return (2*this.length*this.height) + (2*this.width*this.height);
    }
}
