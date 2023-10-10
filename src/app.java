import java.util.Scanner;

public class app{
    public static void main(String[] args) throws Exception {

    //call constructor for Right Triangle
    PerimeterOfRightTriangle pTri = new PerimeterOfRightTriangle();
    
    //call constructor for Hexagon
    Hexagon hexa = new Hexagon();

    //scanner select geometry to calculate
    Scanner scan = new Scanner(System.in);
    
    System.out.println(" ");
    System.out.println("1.Perimeter of Triangle (with pythagoras theory)");
    System.out.println("2.Volume of Hexagon");
    System.out.println(" ");

        while(true){

        System.out.print("Select Geometry To Calculate : ");
        String select = scan.nextLine();

            //Perimeter of Triangle (wtih pythagoras theory)
            if(select.equals("1")){

                //color system
                System.out.println(" ");
                System.out.print("Type your geometry color = ");
                String color = scan.nextLine();

                //check Border's value error
                //if error loop to type again
                while (true) {
                    try {
                        System.out.print("Type your geometry border size = ");
                        double border = scan.nextDouble();
                        pTri.shape(color, border);
        
                        // If no exception occurred, break out of the loop
                        break;

                    }
                    catch (Exception e) {
                        System.out.println("Value error, please try again");
                        scan.nextLine();
                    }
                }

                //check side1's value error
                //if error loop to type again
                while(true){
                    try{
                        System.out.println(" ");
                        System.out.print("Type your side 1 = ");
                        double side1 = scan.nextDouble();

                        pTri.setSide1(side1);
                        break;
                    }
                    catch(Exception e){
                        System.out.println("Value error, please try again");
                        scan.nextLine();
                    }
                }

                //check side2's value error
                //if error loop to type again
                while(true){
                    try{
                        System.out.print("Type your side 2 = ");
                        double side2 = scan.nextDouble();

                        pTri.setSide2(side2);
                        break;
                    }
                    catch(Exception e){
                        System.out.println("Value error, please try again");
                        scan.nextLine();
                    }
                }

                //calculate hypotenuse and set it
                pTri.setHypotenuse(pTri.getHypotenuse());

                //calculate perimeter
                pTri.calculate();

                //summary result
                pTri.displayInfo();
                break;

            }

            else if(select.equals("2")){

                //color system
                System.out.println(" ");
                System.out.print("Type your geometry color = ");
                String color = scan.nextLine();

                //check Border's value error
                //if error loop to type again
                while(true){
                    try{
                        System.out.print("Type your geometry border size = ");
                        double border = scan.nextDouble();

                        hexa.shape(color, border);
                        break;
                    }
                    catch(Exception e){
                        System.out.println("Value error, please try again");
                        scan.nextLine();
                    } 
                }

                //check side1's value error
                //if error loop to type again
                while(true){
                    try{
                        System.out.println(" ");
                        System.out.print("Type your side = ");
                        double side = scan.nextDouble();

                        hexa.setSide(side);
                        break;
                    }
                    catch(Exception e){
                        System.out.println("Value error, please try again");
                        scan.nextLine();
                    }
                }

                //check side2's value error
                //if error loop to type again
                while(true){
                    try{
                        System.out.print("Type your height = ");
                        double height = scan.nextDouble();

                        hexa.setHeight(height);
                        break;
                    }
                    catch(Exception e){
                        System.out.println("Value error, please try again");
                        scan.nextLine();
                    }
                }

                //calculate valume
                hexa.calculate();

                //summary result
                hexa.displayInfo();
                break;
            }

            else{
                System.out.println("Input isn't correct, please input again.");
                System.out.println(" ");
            }
        }        
    }
}
