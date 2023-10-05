public abstract class RightTriangle implements Shape{

    /*
    Shape Adjust Part(implements from Shape)
     */
    
    public String color;
    public double border;

    public void shape(){
    }

    public void shape(String color, double border){
        this.color = color;
        this.border = border;
    }

    public String getColor(){
        return color;
    }

    public double getBorder(){
        return border;
    }

    /*
    Right Rectangle Part
     */

    public double side1;
    public double side2;


    public RightTriangle(){
    }

    public RightTriangle(double side1, double side2){
        this.side1 = side1;
        this.side2 = side2;
    }

    public void setSide1(double side1){
        this.side1 = side1;
    }

    public void setSide2(double side2){
        this.side2 = side2;
    }

    public abstract void calculate();

    public double getHypotenuse (){
        return Math.sqrt((this.side1*this.side1)+(this.side2*this.side2));
    }

    public abstract void displayInfo();

}
