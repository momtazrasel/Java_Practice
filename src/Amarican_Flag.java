public class Amarican_Flag {
    public void flag(){

        for (int i=0; i<=5; i++){
            System.out.println("* * * * * *  ==================================");
            if (i ==4){
                break;
            }
            System.out.println(" * * * * *   ==================================");
        }
        for (int y =0; y<=5;y++){
            System.out.println("===============================================");
        }


    }
    public void bdFlag(){

    }
    public static void main(String[] args) {
        Amarican_Flag test = new Amarican_Flag();
        test.flag();
    }

}

