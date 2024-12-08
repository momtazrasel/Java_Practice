import java.util.Scanner;

public class ClassOne {

    public void primeNumberCheck(){
        int num = 25;
        if (num/num == 1 && num/1 == num){
            System.out.println("number is prime");
        }
        else {
            System.out.println("number is not prime");
        }
    }

    public void evenOrOddNum(){
        Scanner input = new Scanner(System.in);
        System.out.println("Input a number: - ");
        int num = input.nextInt();

        if (num%2 == 0){
            System.out.println("Number is Even:-"+num);
        }
        else {
            System.out.println("Number is Odd:- "+num);
        }

    }

    public void sumTwoDigit(int x, int y){
        int z = x+y;
        System.out.println("Total Sum:- "+z);
    }

    public static void subtractionTwoDigit(int x, int y){
        int z = x-y;
        System.out.println("Subtraction Number is:- "+z);

    }

    public void takeInput(){
        Scanner input = new Scanner(System.in);
        System.out.println("Please Take an Input");
        int x = input.nextInt();
        System.out.println("Input Number is:- "+x);
    }

    public static void main(String[] args) {
        for (int i=0; i<=10; i++){
            System.out.println("print number: "+i);
            if (i==8){
                break;
            }
            else {
                System.out.println("Successfully done");
            }
        }
        System.out.println("Hello World");
        ClassOne obj = new ClassOne();
        obj.sumTwoDigit(12,23);
    }
}
