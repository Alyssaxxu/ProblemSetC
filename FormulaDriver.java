
/**
 * Write a description of class FormulaDriver here.
 *
 * @Alyssa Xu
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class FormulaDriver
{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("QUADRATIC FORMULA: Find the roots of ax^2 + bx + c. Enter a, b, and c:");
        System.out.print("a: ");
        double a = input.nextDouble();
        System.out.print("b: ");
        double b = input.nextDouble();
        System.out.print("c: ");
        double c = input.nextDouble();

        OrderedPair roots = Formulas.findQuadraticRoots(a, b, c);
        System.out.println("The solutions for " + a +"x^2 + " + b +"x + " +c +" are " + roots);

        System.out.println("SLOPE FORMULA: Find the slope between (x1,y1) and (x2,y2)");
        System.out.print("x1: ");
        double w = input.nextDouble();
        System.out.print("y1: ");
        double x = input.nextDouble();
        System.out.print("x2: ");
        double y = input.nextDouble();
        System.out.print("y2: ");
        double z = input.nextDouble();

        OrderedPair A = new OrderedPair (w,x);
        OrderedPair B = new OrderedPair(y,z);
        double slopes = Formulas.findSlope ( A,  B);
        System.out.println("A line between " + A + " and (2.0, 3.0) has a slope of "+  slopes);

        System.out.println("MIDPOINT FORMULA: Find the midpoint between (x1,y1) and (x2,y2)");
        System.out.print("x1: ");
        double d = input.nextDouble();
        System.out.print("y1: ");
        double e = input.nextDouble();
        System.out.print("x2: ");
        double f = input.nextDouble();
        System.out.print("y2: ");
        double g = input.nextDouble();

        OrderedPair C = new OrderedPair (d,e);
        OrderedPair D = new OrderedPair(f,g);
        OrderedPair midpoint = Formulas.findMidpoint(C,D);
        System.out.println("The midpoint between " + C + " and " + D + " is "+  midpoint);

        System.out.println("SUM OF AN ARITHMETIC SERIES");
        System.out.print("Number of terms: ");
        int h = input.nextInt();
        System.out.print("Starts with: ");
        double i = input.nextDouble();
        System.out.print("Increases by:  ");
        double j = input.nextDouble();

        double sum = Formulas.findArithmeticSeriesSum (i,j,h);
        System.out.println("The sum of the first " + h +" terms of an arithmetic series that starts with " + i +" and increases by " + j + " is " +  sum);

        System.out.println("SUM OF A GEOMETRIC SERIES");
        System.out.print("Number of terms: ");
        int k = input.nextInt();
        System.out.print("Starts with: ");
        double l = input.nextDouble();
        System.out.print("Rate of Growth: ");
        double m = input.nextDouble();

        double total = Formulas.findGeometricSeriesSum ( l,m,k);
        System.out.println("The sum of the first " + k +" terms of a finite geometric series that starts with "+l+" and increases by a rate of " + m +" is " +  total);

        System.out.println("DIE ROLLER");
        System.out.print("How many sides does your die have? ");
        int o = input.nextInt();

        int r = Formulas.rollDie(o);
        System.out.println("Rolling a " + o + "-sided die... you got a " + r + "!");
    }
}

