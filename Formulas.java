
/**
 * Write a description of class Formulas here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

import java.util.Scanner;

public class Formulas
{

    Scanner input = new Scanner(System.in);
    public Formulas() {

    }

    public static OrderedPair findQuadraticRoots (double a, double b, double c){
        double r1 = (-b + Math.sqrt(b*b - 4.0*a*c))/ (2*a);
        double r2 = (-b - Math.sqrt(b*b - 4*a*c))/ (2*a);

        OrderedPair solution = new OrderedPair (r1 , r2 );
        return solution;
    }

    public static double findSlope (OrderedPair A, OrderedPair B){
        OrderedPair pair1 = A;
        OrderedPair pair2 = B;

        double slope = (B.getY() - A.getY()) / (B.getX() - A.getX());
        return slope;
    }

    public static OrderedPair findMidpoint (OrderedPair A, OrderedPair B) {
        OrderedPair  pair1 = A;
        OrderedPair pair2 = B;

        double midpointX = (A.getX() + B.getX() ) / 2.0;
        double midpointY = (A.getY() + B.getY() ) / 2.0;

        OrderedPair midpointFinal = new OrderedPair (midpointX, midpointY);
        return midpointFinal;
    }

    public static double findArithmeticSeriesSum (double a, double d, int k){
        double value1 = a;
        double value2 = d;
        double total = (double) k;

        double sum = ((k/2.0) * ( (2 * a) + (d*(k-1))));
        return sum;
    }

    public static double findGeometricSeriesSum (double a, double r, int k){
        double value1 = a;
        double value2 = r;
        double value3 = (double) k;

        double sum = a * ((1-Math.pow(r,k))/ (1-r));
        return sum;
    }

    public static int rollDie (int sides){
        double s = sides;
        int r = (int) (Math.random()*sides) + 1;
        return r;

    }
}
