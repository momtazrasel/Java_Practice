public class If_Else {

    public void ifElseStatement(){
        int x = 50;
//        int y = 50;

        if (x<40){
            System.out.println("This is If statement");
        }else{
            System.out.println("This is else statement");
        }
    }

    public static void main(String[] args) {
        If_Else obj = new If_Else();
        obj.ifElseStatement();
    }
}
