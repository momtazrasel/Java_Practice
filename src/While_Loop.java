public class While_Loop {

    public void whileLoopStatement(){
        int x = 10;
        while(x<20){
            System.out.println("X values is: "+x);
            x++;
    }
        int numbers[] = {10,20,30,40,50};
        int y = 0;
        while (y<5){
            System.out.println("This is y values "+numbers[y]);
            y++;
        }
    }

    public static void main(String[] args) {
        While_Loop obj = new While_Loop();
        obj.whileLoopStatement();
    }
}
