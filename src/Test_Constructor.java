public class Test_Constructor {

    Test_Constructor(String name){
        System.out.println("Print name: " );

    }
    int myAge;
    public void setMyAge(int age){
        myAge = age;
    }

    public void getMyAge(){
        System.out.println("My Age is: "+myAge);
    }

    public static void main(String[] args) {
        Test_Constructor obj = new Test_Constructor("Rasel");
        obj.setMyAge(255);
        obj.getMyAge();
    }
}
