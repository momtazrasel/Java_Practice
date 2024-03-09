public class Palindrome {
    public void checkPalindrome(){
        int sum = 0, tem,r, n=454;
        tem = n;
        while (n>0){
            r = n%10;
            sum = (sum*10)+r;
            n = n/10;
        }
        if(tem == sum){
            System.out.println("Number is palindrome");
        }else {
            System.out.println("Number is not palindrome");
        }
    }
    public static void main(String[] args) {

        Palindrome test = new Palindrome();
        test.checkPalindrome();
    }
}
