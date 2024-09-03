public class Rectangle1 {
    private double length;
    private double width;
    public Rectangle1(double length, double width) {
        this.length = length;
        this.width = width;
    }
    public double getLength() {
        return length;
    }
    public void setLength(double length) {
        this.length = length;
    }
    public double getWidth() {
        return width;
    }
    public void setWidth(double width) {
        this.width = width;
    }

    // Method to calculate the area of the rectangle
    public double getArea() {
        return length * width;
    }
    public double getPerimeter() {
        return 2 * (length + width);
    }
    public static void main(String[] args) {
        Rectangle1 rect = new Rectangle1(5.0, 3.0);
        System.out.println("Initial Length: " + rect.getLength());
        System.out.println("Initial Width: " + rect.getWidth());
        System.out.println("Area: " + rect.getArea());
        System.out.println("Perimeter: " + rect.getPerimeter());
        rect.setLength(7.0);
        rect.setWidth(4.0);
        System.out.println("\nUpdated Length: " + rect.getLength());
        System.out.println("Updated Width: " + rect.getWidth());
        System.out.println("Updated Area: " + rect.getArea());
        System.out.println("Updated Perimeter: " + rect.getPerimeter());
    }
}

