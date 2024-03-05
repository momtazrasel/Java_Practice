public class FibonacciSerice {
    public void fibonacci(){
        int x= 0;
        int y= 1;
        int z = x+y;
        System.out.println(x+" "+y);
        for (int i =2; i<10; i++){
            z = x+y;
            System.out.println(z);
            x= y;
            y=z;
        }
    }
    public static void main(String[] args) {
        FibonacciSerice test = new FibonacciSerice();
        test.fibonacci();
    }
}
