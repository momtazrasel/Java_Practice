public class Dog {
    private String name;
    private String breed;

    public Dog(String name, String breed){
        this.name = name;
        this.breed = breed;
    }

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }

    public String getBreed(){
        return breed;
    }
    public void setBreed(String breed){

        this.breed = breed;
    }

    public static void main(String[] args) {
        Dog obj = new Dog("Laila", "Master");
        System.out.println(obj.getName());
        System.out.println(obj.getBreed());

        obj.setName("Buddy");
        obj.setBreed("Daisy");
        System.out.println(obj.getName());
        System.out.println(obj.getBreed());
    }
}
