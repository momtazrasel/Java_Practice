import java.util.Scanner;

public class Prime_Number {
    public void primeNumber(){
        Scanner reader  = new Scanner(System.in);
        System.out.println("Enter Your Number: ");
        int num = reader.nextInt();
        System.out.println("Your Enter Number is: "+num);
        boolean flag = false;

        for (int i = 2; i<=num/2; i++){
            if (num%i == 0){
                flag = true;
                break;
            }

        }
        if (!flag){
            System.out.println("This is prime number: " +num);
        }
        else {
            System.out.println("This is number is not prime: "+num);
        }
    }
    public static void main(String[] args) {
        Prime_Number obj = new Prime_Number();
        obj.primeNumber();
    }
}
