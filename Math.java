package calculated;

public class Math {
    private double x,y;
    public Math(){

    }
    public Math(double x,double y){
        this.x=x;
        this.y=y;

    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getSum(double x,double y){
        double sum=0;
        this.x=x;
        this.y=y;
        sum=x+y;
        return sum;
    }


    public double getMinus(double x,double y){
        double minus=0;
        this.x=x;
        this.y=y;
        minus=x+y;
        return minus;
    }
    public double getDual(double x, double y){
        double dual=0;
        this.x=x;
        this.y=y;
        dual=x/y;
        return dual;
    }
    public double getProduct(double x, double y){
        double product=0;
        this.x=x;
        this.y=y;
        product=x*y;
        return product;
    }

}
