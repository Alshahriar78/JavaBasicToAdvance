import java.util.Scanner;
import java.util.Scanner;
public class ComputeArea {

    public static void main(String[] args){
       double CircleArea = CircleArea();
        double RectangleArea=RectangleArea();
        System.out.println("The Area of  Circle is = "+CircleArea);
        System.out.println("The Area of  Rectangle  is = "+RectangleArea);
    }
    static double CircleArea(){
        Scanner scanner = new Scanner(System.in);
        double radius;
        System.out.println("Enter The circle Radios:");
        radius = scanner.nextDouble();
        return radius*radius *3.14159;
    }
    static double RectangleArea(){
        Scanner scanner = new Scanner(System.in);
        double length;
        System.out.println("Enter the length of Rectangle: ");
        length = scanner.nextDouble();
        double width;
        System.out.println("Enter the length of Rectangle: ");
        width = scanner.nextDouble();
        return length * width;
    }
}