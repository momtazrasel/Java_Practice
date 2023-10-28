

public class Local_Variable {
    //local variable is declared within a block, scope, method, contructor
    public void printAge(){
        int age =0; //local variable
        age = age+10;
        System.out.println("Rasel's Age is: " +age);
    }
    public void printName(){
        String name = "Momtaz Rasel"; //local variable
        System.out.println("Rasel's Age is: " +name);
    }
    public static void main(String [] args){
        Local_Variable test = new Local_Variable();
        test.printAge();
        test.printName();
    }
}
