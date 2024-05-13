public class Circle {
    private double radius;
//    private double c;
    public Circle(double radius){
        this.radius = radius;
    }

    public double getRadius(){
        return radius;
    }

    public void setRadius(double radius){
        this.radius = radius;
    }

    public double areOfCircle( ){
        return Math.PI*radius*radius;
    }

    public static void main(String[] args) {
        int r = 5;
        Circle obj = new Circle(r);
//        obj.getRadius(6);
        System.out.println(obj.areOfCircle());
    }
}
