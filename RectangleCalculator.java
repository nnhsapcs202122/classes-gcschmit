import java.util.Scanner;

/**
 * Create a RectangleCalculator class with a constructor that takes the height and width
 * as parameters and with three methods: getArea, getPerimeter, getDiagonalLength. 
 * Also add the toString method which returns a String containing the rectangle's height, 
 * width, area, perimeter, and diagonal length.
 * 
 * Create a static main method that asks the user for the lengths of a rectangle's sides, 
 * creates a RectangleCalculator object, and passes the variable referencing the object to
 * the System.out.println method (which indirectly invokes the three methods on the object,
 * and prints the values returned).
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class RectangleCalculator
{
    private int height;
    private int width;

    public RectangleCalculator(int initWidth, int initHeight)
    {
        this.width = initWidth;
        this.height = initHeight;
    }
    
    public int getArea()
    {
        return this.height * this.width;
    }
    
    public int getPerimeter()
    {
        return (2 * this.height )+ (2 * this.width);
    }
    
    public double getDiagonalLength()
    {
        return Math.sqrt((this.height * this.height) + (this.width * this.width));
    }

    public String toString()
    {
        return "[width: " + this.width + "; height: " + this.height +
                ";area: " + this.getArea() + "; perimeter: " + this.getPerimeter() +
                ";diagonal length: " + this.getDiagonalLength() + "]";
    }
    
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        
        System.out.print("Enter the width of the rectangle: ");
        int width = s.nextInt();

        System.out.print("Enter the height of the rectangle: ");
        int height = s.nextInt();
        
        RectangleCalculator rectCalc = new RectangleCalculator(width, height);
        System.out.println(rectCalc);
    }
}
