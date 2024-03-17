import java.security.spec.RSAOtherPrimeInfo;

public class AsciiValue {

    public void printASCIIValue(){
        char value1 = 'A';
        char value2 = 'B';
        System.out.println("Value1 is: "+value1 + " Value2 is : "+value2);

        int asciiVale1 = value1;
        int asciiValue2 = value2;

        System.out.println("ASCII Value 1 is: "+asciiVale1+" ASCII Value 2 is :"+asciiValue2);
    }

    public static void main(String[] args) {
        AsciiValue obj = new AsciiValue();
        obj.printASCIIValue();
    }
}
