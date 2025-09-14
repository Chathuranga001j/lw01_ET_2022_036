package lw01;

public class Q5{
    public static void main(String[] args) {
        Circle outerCircle = new Circle(21);
        Circle innerCircle= new Circle(7);

        double outerCircleArea = outerCircle.computeArea();
        double innerCircleArea= innerCircle.computeArea();
        double shadedArea = outerCircleArea-innerCircleArea;
        System.out.println("Shaded area: " +shadedArea);
    }
}
