import java.util.Scanner;

public class NumberCheck {
    public void checkNumber(){
        Scanner in = new Scanner(System.in);
        int num  = in.nextInt();
        if(num>0){
            System.out.println("Number is Positive");
        }else if (num<0){
            System.out.println("Number is Negative");
        }else {
            System.out.println("Number is Zero");
        }
    }

    public static void main(String[] args) {
        NumberCheck obj = new NumberCheck();
        obj.checkNumber();

    }
}
