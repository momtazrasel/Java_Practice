

public class For_Loop {

    public void numberPrint(){
        int [] numbers = {1,2,3,4,5};
        for (int x : numbers){
            System.out.println("Array numbers is: "+x+",");
        }
    }

    public void namePrint(){
        String [] names = {"Rasel", "Momtaz", "Monir", "Monju"};
        for (String x : names){
            System.out.println("Array name is: "+x+",");
        }
    }

    public void numPrint(){
        for (int x =0; x<=10; x++){
            System.out.println("Array name is: "+x+",");
        }
    }

    public void numArrayPrint(){

        int num[] = {10,20,30,40,50};

        for (int x =0; x<num.length; x++){
            System.out.println("Array name is: "+num[x]+",");
        }

        for (int y : num){
            System.out.println("Array name is: "+y+",");
        }

    }

    public static void main(String[] args) {
        For_Loop obj = new For_Loop();
        obj.numberPrint();
        obj.namePrint();
        obj.numPrint();
        obj.numArrayPrint();
    }
}
