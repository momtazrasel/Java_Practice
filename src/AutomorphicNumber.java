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
        int temp = num;
        while (temp>0){
            count++;
            temp = temp/10;

        }
        int lastDigit = (int)(square%(Math.pow(10,count)));
        if (num == lastDigit){
            System.out.println(num + " Number is automorphic");
        }else {
            System.out.println(num + " Number is not automorphic");
        }
    }

    public static void main(String[] args) {
        AutomorphicNumber obj = new AutomorphicNumber();
        obj.checkAutomorphicNumber();
    }
}
