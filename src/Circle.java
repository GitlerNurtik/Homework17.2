public class Circle {
    private double PI;
    private int radius;

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public void setPI(double PI){
        this.PI = PI;
    }
    public double getPI() {
        return PI;
    }
    public static double area(double PI, int radius){
        return PI*((double) radius*(double) radius);
    }
    public static double circumference (double PI, int radius){
        return (PI*2*(double) radius);
    }
}
