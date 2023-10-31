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
//        String [] names = {"Rasel", "Momtaz", "Monir", "Monju"};
        for (int x =0; x<=10; x++){
            System.out.println("Array name is: "+x+",");
        }
    }

    public static void main(String[] args) {
        For_Loop obj = new For_Loop();
        obj.numberPrint();
        obj.namePrint();
        obj.numPrint();
    }
}
