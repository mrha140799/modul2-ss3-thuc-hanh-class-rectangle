package Rectangle;

import java.util.Scanner;

public class InitRectangle {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter weight : ");
        float weight = scn.nextFloat();
        System.out.print("Enter height : ");
        float height = scn.nextFloat();


        Rectangle rtg = new Rectangle(weight, height);
        System.out.println(rtg.display());
        System.out.println("Area = " + rtg.getArea() + " - Perimeter = " + rtg.getPerimeter());
    }
}
