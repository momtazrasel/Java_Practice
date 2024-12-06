public class ClassTwo {


    public static void main(String[] args) {
        ClassOne obj = new ClassOne();
        obj.sumTwoDigit(25,50);
        obj.evenOrOddNum();
//        obj.takeInput();

        obj.subtractionTwoDigit(25,15);
        /*or, cause when we are try to call a static method from one class to another class
         we can easily call using class name */
        ClassOne.subtractionTwoDigit(25,15);
    }


}
