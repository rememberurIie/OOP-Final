public class Hexagon implements Shape {

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
    Hexagon Part
    */

    public double side;
    public double height;
    public double volume;

    public Hexagon(){
    }

    public Hexagon(double side,double height){
        this.side = side;
        this.height = height;
    }

    public void setSide(double side){
        this.side = side;
    }

    public void setHeight(double height){
        this.height = height;
    }

    public void calculate(){
        volume = 1.0/2.0*((3.0*Math.sqrt(3.0)*this.side)/2.0)*this.height;
    }

    public double getVolume(){
        return volume;
    }

    public void displayInfo(){
        String a = "Color = " + this.color + " Border = " + this.border;
        String b = "This Hexagon (Side = " + this.side + ", Height = " + this.height + ") Have Volume = " + volume;
        System.out.println(" ");
        System.out.println(a);
        System.out.println(b);
    }
}
