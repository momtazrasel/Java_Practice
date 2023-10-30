public class Basic_Operator {
    public static float a = 19f;
    public static float b = 20f;

    public void arithmeticOperator(){
        float addition = a+b;
        System.out.println(addition);

        float subtraction = a-b;
        System.out.println(subtraction);

        float multiplication = a*b;
        System.out.println(multiplication);

        float division = a/b;
        System.out.println(division);

        float modulus = a%b;
        System.out.println(modulus);

        float increment = a++;
        System.out.println(increment);

        float decrement = a--;
        System.out.println(decrement);
    }

    public static void main(String[] args) {
        Basic_Operator obj = new Basic_Operator();
        obj.arithmeticOperator();
    }
}
