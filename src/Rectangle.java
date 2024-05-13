public class Rectangle {
    private double height;
    private double width;

    public Rectangle(double height, double width){
        this.height = height;
        this.width = width;
    }

    public double getHeight(){
        return height;
    }
    public void setHeight(){
        this.height = height;
    }
    public double getWidth(){
        return height;
    }
    public void setWidth(){
        this.width = width;
    }

    public void areOfRectangle(int height, int width){
        this.height = height;
        this.width = width;
        int area = height*width;
        System.out.println(area);
    }
    public void perimeterOfRectangle(int height, int width){
        this.height = height;
        this.width = width;
        int perimeter = 2*(height+width);
        System.out.println(perimeter);
    }

    public static void main(String[] args) {
        Rectangle obj = new Rectangle(20.00, 30.00);
        obj.areOfRectangle(10,20);
        obj.perimeterOfRectangle(10,20);
    }
}
