public class PerimeterOfRightTriangle extends RightTriangle{

    /* shape Adjust */

    public void shape(){
    }

    public void shape(String color, double border){
        this.color = color;
        this.border = border;
    }

    /* Perimeter */

    public double hypotenuse;
    public double perimeter;

    public PerimeterOfRightTriangle(){
    }

    public PerimeterOfRightTriangle(double side1, double side2 , double hypotenuse){
        super(side1,side2);
        this.hypotenuse = hypotenuse;
    }

    public void setHypotenuse(double hypotenuse){
        this.hypotenuse = hypotenuse;
    }

    public void calculate(){
        this.perimeter = side1+side2+hypotenuse;
    };

    public double getPerimeterValue(){
        return this.perimeter;
    }

    public void displayInfo(){
        String a = "Color = " + this.color + " Border = " + this.border;
        String b = "This Triangle (First side = " + this.side1 + ", Second Side = " + this.side2 + ", Hypotenuse Side = " + this.hypotenuse + ") Have Perimeter = " + getPerimeterValue();
        System.out.println("");
        System.out.println(a);
        System.out.println(b);
    };
}