public class Primitive_Data_Type {

    public void byteDataType(){
        byte byteValue1 = 4;
        byte byteValue2 = 4;
        byte byteValueResult =  (byte)(byteValue1+byteValue2);
        System.out.println("Total Byte Value "+byteValue1+"+"+byteValue2+" = "+byteValueResult);
    }

    public void shortDataType(){
        short shortValue1 = 1;
        short shortValue2 = 10;
        short shortResult = (short) (shortValue1+shortValue2);
        System.out.println("Total Short Result- "+shortValue1+ "+"+shortValue2+"="+shortResult);

    }

    public void intDataType(){
        int value1 = 10;
        int value2 = 10;
        int Result = value1+value2;
        System.out.println("Int Result is:- "+Result);
    }

    public void doubleDataType(){
        double value1 = 2.0;
        double value2 = 2.0;
        double Result = value1+value2;
        System.out.println("Double Result:- "+Result);
    }

    public void floatDataType(){
        float value1 = 10f;
        float value2 = 10f;
        float Result = value1+value2;
        System.out.println("Float Result:- "+Result);
    }

    public void longDataType(){
        long value1 = 10L;
        long value2 = 10L;
        long Result = value1+value2;
        System.out.println("Long Result:- "+Result);
    }

    public void booleanDataType(){
        boolean booleanValue = true;
        System.out.println("Boolean Result:- "+booleanValue);
    }

    public void characterDataType(){
        char characterValue = 'A';
        System.out.println("Character Result:- "+characterValue);
    }

    public static void main(String[] args) {
        Primitive_Data_Type obj = new Primitive_Data_Type();
        obj.byteDataType();
        obj.shortDataType();
        obj.intDataType();
        obj.doubleDataType();
        obj.floatDataType();
        obj.longDataType();
        obj.booleanDataType();
        obj.characterDataType();
    }
}
