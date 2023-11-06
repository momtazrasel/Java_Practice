public class Break_Statement {

    public void breakStatement(){

        int x =10;
        while (x<20){
            if (x==15){
                break;
            }
            System.out.println("This is the x values: "+x);
            x++;
        }
    }

    public static void main(String[] args) {
        Break_Statement obj  = new Break_Statement();
        obj.breakStatement();

    }
}
