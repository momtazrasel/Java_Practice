public class Do_While_Loop {

    public void doWhile(){
        int x = 0;
        do {
            System.out.println("this is x values: "+x);
            x++;
        }while (x<5);

        int num [] = {10,20,30,40,50};
        int y = 0;
        do {
            System.out.println("this is array values: " +num[y]);
            y++;

        }while (y<5);
    }

    public static void main(String[] args) {
        Do_While_Loop obj = new Do_While_Loop();
        obj.doWhile();
    }
}
