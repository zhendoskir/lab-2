import java.util.Scanner;

public class Lab1 {

    public static void main(String[] args) {

        Point3d first = inputPoint();
        Point3d second = inputPoint();
        Point3d third = inputPoint();

        if(!first.equalsPoint(second) && !second.equalsPoint(third) && !third.equalsPoint(first)){
            System.out.printf("Area of the triangle: %f", computeArea(first, second, third));
        } else{
            System.out.println("These points do not form a triangle.");
        }

    }

    // method for entering point coordinates
    public static Point3d inputPoint() {
        double x = 0;
        double y = 0;
        double z = 0;
        Scanner input = new Scanner(System.in);

        boolean help = true;
        while(help){
            System.out.printf("Input coord x: ");
            if (input.hasNextDouble()){
                x = input.nextDouble();
                help = false;
            } else {
                System.out.println("It's not a number! Try again, please.");
                input = new Scanner(System.in);
            }
        }

        help = true;
        while(help){
            System.out.printf("Input coord y: ");
            if (input.hasNextDouble()){
                y = input.nextDouble();
                help = false;
            } else {
                System.out.println("It's not a number! Try again, please.");
                input = new Scanner(System.in);
            }
        }

        help = true;
        while(help){
            System.out.printf("Input coord z: ");
            if (input.hasNextDouble()){
                z = input.nextDouble();
                help = false;
            } else {
                System.out.println("It's not a number! Try again, please.");
                input = new Scanner(System.in);
            }
        }
        System.out.printf("Received point {%f; %f; %f}\n\n", x, y, z);
        return new Point3d(x, y, z);
    }

    // method for calculating the area of a triangle
    public static double computeArea (Point3d first, Point3d second, Point3d third){
        double p = (first.distanceTo(second) + second.distanceTo(third) + third.distanceTo(first))/2;
        System.out.println(first.distanceTo(second));
        System.out.println(second.distanceTo(third));
        System.out.println(third.distanceTo(first));
        System.out.println(p);
        double S = Math.sqrt(
            p * (p - first.distanceTo(second)) 
            * (p - second.distanceTo(third)) 
            * (p - first.distanceTo(third))
            );
            return S;
    }
}
