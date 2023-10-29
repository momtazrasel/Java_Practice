public class Static_Variable {
    private static final String DepartmentName = "Department Name is CSE";
    private static double Salary = 50000;

    public static double salary;

    private static String name;
    public void setSalary(double empSalary, String empName){
        salary = empSalary;
        name = empName;
    }

    public static void main(String[] args) {
//        Salary = 5000;
        System.out.println(DepartmentName);
        Static_Variable obj = new Static_Variable();
        obj.setSalary(15000,  "Momtaz Rasel");
        System.out.println("Employee Name is: " +name);
        System.out.println("Employee Salary is: " +salary);
    }
}
