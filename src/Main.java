import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    Circle circle = new Circle();
        DecimalFormat myFormat = new DecimalFormat("#.#");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Напишите радиус вашей окружности");
        int radius = scanner.nextInt();
        circle.setRadius(radius);
        circle.setPI(3.1415926535);
        System.out.println("area: "+ myFormat.format(Circle.area(circle.getPI(),circle.getRadius())));
        System.out.println("circumference: "+ myFormat.format(Circle.circumference(circle.getPI(),circle.getRadius())));
    }
}