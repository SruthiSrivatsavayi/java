public class Rectangle extends Shape {
    private double width;
    private double height;
    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }
    public double getArea() {
        return width * height;
    }
    public static void main(String[] args) {
        Rectangle myRectangle = new Rectangle(5.0, 7.0);
        System.out.println("Area of Rectangle: " + myRectangle.getArea());
    }
}
