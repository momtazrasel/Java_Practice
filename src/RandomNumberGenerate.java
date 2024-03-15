public class RandomNumberGenerate {
    public void generateRandomNumber(){
        int max = 200;
        int min = 400;

        double a = Math.random()*(max-min+1)+min;
        System.out.println(a);

        int b = (int) (Math.random()*(max-min+1)+min);
        System.out.println(b);

    }

    public static void main(String[] args) {
        RandomNumberGenerate random = new RandomNumberGenerate();
        random.generateRandomNumber();
    }
}
