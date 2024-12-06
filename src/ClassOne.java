public class ClassOne {
    public void sumTwoDigit(int x, int y){
        int z = x+y;
        System.out.println("Total Sum:- "+z);
    }

    public static void main(String[] args) {
        for (int i=0; i<=10; i++){
            System.out.println("print number: "+i);
            if (i==8){
                break;
            }
            else {
                System.out.println("Successfully done");
            }
        }
        System.out.println("Hello World");
        ClassOne obj = new ClassOne();
        obj.sumTwoDigit(12,23);
    }
}
