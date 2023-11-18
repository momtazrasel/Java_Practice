import java.util.Scanner;

public class User_Input {

    public void user_Input(){
        for (int i=0; i<=2; i++){
            Scanner num = new Scanner(System.in);
            System.out.println("Enter the name");
            String name = num.nextLine();
            System.out.println("Their Name: "+name);
        }
    }

    public static void main(String[] args) {

        User_Input obj = new User_Input();
        obj.user_Input();
    }
}
