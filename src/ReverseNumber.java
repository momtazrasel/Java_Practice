public class ReverseNumber {
    int x = 1234;
    int sum = 0, rev=0, number, rem;
    public void reverseUsingWhile(){
        while (x>0){
             rem = x%10;
             rev = rev*10+rem;
             x = x/10;
        }
        System.out.println("reverse number is "+rev);
    }
    public void reverseUsingForLoop(){
        for (int i =0; x>i;i++){
            rem = x%10;
            rev = rev*10+rem;
            x = x/10;
        }
        System.out.println("reverse number is "+rev);
    }

    public static void main(String[] args) {

        ReverseNumber obj = new ReverseNumber();
        obj.reverseUsingWhile();
        obj.reverseUsingForLoop();
    }
}
