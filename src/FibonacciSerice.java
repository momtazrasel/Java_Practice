public class FibonacciSerice {
    public void fibonacci(){
        int x= 0;
        int y= 1;
        int z = x+y;
        System.out.println(z);
    }
    public static void main(String[] args) {
        FibonacciSerice test = new FibonacciSerice();
        test.fibonacci();
    }
}
