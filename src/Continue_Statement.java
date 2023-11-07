public class Continue_Statement {

    public void continue_Statement(){
        int x = 0;
        while (x<20){
            x++;
            if (x==15){
                continue;
            }
            System.out.println("This is x value: "+x);
        }
    }

    public static void main(String[] args) {
        Continue_Statement obj = new Continue_Statement();
        obj.continue_Statement();
    }
}
