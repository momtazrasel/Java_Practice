public class Factorial {

    public void calculateFactorial(){
        int x = 1;

        int number = 5;
        for (int i =1; i<=number; i++){
            x = x*i;
        }
        System.out.println(x);
    }
    public static void main(String[] args) {

        Factorial test = new Factorial();
        test.calculateFactorial();
    }
}
