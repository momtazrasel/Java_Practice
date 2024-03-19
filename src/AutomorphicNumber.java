public class AutomorphicNumber {
    public void checkAutomorphicNumber(int num){
        int squre = num*num;
        while (num>0){
            if(num%10 != squre%10)
                return;
        }
    }

    public static void main(String[] args) {

    }
}
