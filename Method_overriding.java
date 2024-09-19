public class main{
    public static void main(String[] args){
        circle c = new circle();
        c.getPerimeter(5);
        c.getArea(5);
    }
}
class Shape{
    void getPerimeter(int r){
    }
    void getArea(int r){
    }
}
class circle extends Shape{
    public void getPerimeter(int r){
        System.out.println(23.14*r);
    }
    public void getArea(int r){
        System.out.println(3.14*r*r);
    }
}

