public class Ternary_Operator {

    public void ternaryOperator(){
        int a = 10;

        int b = (a==1) ? 20:30;
        System.out.println(b);

        int c = (a==10) ? 20:30;
        System.out.println(c);

    }

    public static void main(String[] args) {
        Ternary_Operator obj = new Ternary_Operator();
        obj.ternaryOperator();
    }
}
