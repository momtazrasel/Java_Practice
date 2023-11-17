import java.util.Scanner;

public class Even_Odd_number {

    public void evenOddNumber(){
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter the Number: ");
        int num = reader.nextInt();

        if (num%2 ==0){
            System.out.println("This is Even number");
        }else {
            System.out.println("This is odd number");
        }
    }

    public static void main(String[] args) {
        Even_Odd_number obj = new Even_Odd_number();
        obj.evenOddNumber();
    }
}
