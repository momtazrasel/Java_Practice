public class Instance_Variable {
    public String name;

    private double salary;

//    public Instance_Variable(String empName, double empSalary){
//        name = empName;
//        salary = empSalary;
//    }

    public void setSallry(String empName, double empSalary){
        name = empName;
        salary = empSalary;
    }

    public void printEmployData(){
        System.out.println("This is Employee name:- " +name);
        System.out.println("This is Employee Salary:- " +salary);
    }

    public static void main(String [] args){
//        Instance_Variable obj = new Instance_Variable("Rasel", 1000);
        Instance_Variable obj = new Instance_Variable();
//        obj.setSallry(50000);
//        obj.printEmployData();
        obj.setSallry("Rasel", 1000);
        obj.printEmployData();
    }
}
