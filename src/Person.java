public class Person {
    private String name;
    private int age;

    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }
    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }

    public static void main(String[] args) {
        Person person = new Person("momtaz",26);
        System.out.println("Name: " +person.getName());
        System.out.println("Name: " +person.getAge());
    }
}
