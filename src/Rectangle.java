public class Rectangle {
    private int height;
    private int width;

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
        Rectangle obj = new Rectangle();
        obj.areOfRectangle(10,20);
        obj.perimeterOfRectangle(10,20);
    }
}
