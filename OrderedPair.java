
public class OrderedPair{
    double x;
    double y;
    public OrderedPair (){
        x = 0;
        y = 0;
    }

    public OrderedPair(double a, double b){
        x = a;
        y=b;
    }

    public String toString() {
        return "("+ x +","+ y +")" ;
    }

    public double getX(){
        return x; 

    }

    public double getY(){
        return y;
    }
}