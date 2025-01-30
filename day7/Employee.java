public class Employee{
    private String name;
    private int id;
    private double salary;

    public Employee(String name,int id,double salary){
        this.name=name;
        this.id=id;
        this.salary=salary;
    }

    public void display(){
        System.out.println("Employee name:"+name);
        System.out.println("Employee id:"+id);
        System.out.println("Employee salary:"+salary);
    }

    public static void main(String[] args) {
        Employee emp1=new Employee("piyush tiwari", 138, 400000);
        Employee emp2=new Employee("aditya dixit", 22, 400000);

        System.out.println("=== Restaurant 1 ===");
        emp1.display();
        System.out.println("\n=== Restaurant 2 ===");
        emp2.display();


    }

}