public class Switch_Statement {

    public void swutchStatement(){
        char grade = 'A';

        switch (grade){
            case 'B':
                System.out.println("This is grade B");
                break;

            case 'C':
                System.out.println("This is grade C");
                break;

            case 'A':
                System.out.println("This is grade A");
                break;
        }
    }

    public static void main(String[] args) {
        Switch_Statement obj = new Switch_Statement();
        obj.swutchStatement();
    }
}
