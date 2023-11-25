import java.util.Scanner;

public class User_Input {

    public void user_Input(){
        String name = null;
        for (int i=0; i<=2; i++){
            Scanner num = new Scanner(System.in);
            System.out.println("Enter the name");
             name = num.nextLine();
            
        }
        System.out.println(name);
    }

    public void printString(String name1, String name2){


    }

    public static void main(String[] args) {

        User_Input obj = new User_Input();
        obj.user_Input();
    }
}
