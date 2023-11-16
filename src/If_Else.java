import java.util.Scanner;

public class If_Else {

    public void ifElseStatement(){
        int x = 50;
        int y = 50;

        if (x<40){
            System.out.println("This is If statement");
        }else{
            System.out.println("This is else statement");
        }

        if(x==y){
            System.out.println("X and Y's values are equal");
        }
        else {
            System.out.println("Not Equal");
        }

        Scanner reader = new Scanner(System.in);
        System.out.println("Please Enter the Number");
        int num = reader.nextInt();
        if (num%2 ==0){
            System.out.println("This is Even Number: "+num);
        }
        else {
            System.out.println("This is odd number: "+num);
        }
    }

    public static void main(String[] args) {
        If_Else obj = new If_Else();
        obj.ifElseStatement();
    }
}
