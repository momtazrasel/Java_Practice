import java.sql.SQLOutput;
import java.util.Scanner;

public class AutomorphicNumber {
    public void checkAutomorphicNumber(){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = in.nextInt();
        System.out.println(num);
        int count = 0;
        int square = num*num;
        System.out.println(square);
    }

    public static void main(String[] args) {
        AutomorphicNumber obj = new AutomorphicNumber();
        obj.checkAutomorphicNumber();
    }
}
