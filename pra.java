//import java.util.*;

class Employee{
    int id;
    String name;
    double salary;

    public Employee(int id,String name,double salary){
        this.id=id;
        this.name=name;
        this.salary=salary;
    }
    public void displayRole(){
        System.out.println("Role : Employee");
    }

    public void displayEmployeeDetails(){
        System.out.println("\nEmployee details :-"+
        "\nId :"+id+
        "\nName : "+name+
        "\nSalary : "+salary);

    }
}
class Developer extends Employee{
    String programmingLanguage;

    public Developer(int id,String name,double salary,String programmingLanguage){
        super(id,name,salary);
        this.programmingLanguage=programmingLanguage;
    }
    public void displayDeveloperDetails(){
        super.displayEmployeeDetails();
        System.out.println("Programming Language : "+programmingLanguage);
    }

    @Override
    public void displayRole(){
        System.out.println("Role : Developer");
        System.out.println("Programming Language : "+programmingLanguage);
    }


}
class Main {    
    public static void main(String[] arg){
        //Scanner sc=new Scanner(System.in);

        Employee obj1=new Employee(101,"Arun",60000.31);
        obj1.displayEmployeeDetails();
        Developer obj2=new Developer(102,"ravi",89000.21,"Java");
        obj2.displayDeveloperDetails();
        obj2.displayRole();

    }
}