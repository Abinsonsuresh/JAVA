import java.util.*;


class Office{
    int empNum;
    String name;
    int Salary;

    public Office(int id, String Name, int sal)
    {
        this.empNum = id;
        this.Salary = sal;
        this.name = Name;
    }

    public void getDetails(){
        System.out.println("ID" + empNum);
        System.out.println("Name" + name);
        System.out.println("Salary" + Salary);
    }
}

class Teaching extends Office
{
    String Desig;
    public Teaching(int id,int sal, String Name,String desig){
        super(id,Name,sal);
        this.Desig = desig;

    }

    void DisplayDetails(){
        super.getDetails();
        System.out.println("Designation" + Desig);

    }


}


class NonTeaching extends Office
{
    String Desig;
    public NonTeaching(int id,int sal, String Name,String desig){
        super(id,Name,sal);
        this.Desig = desig;

    }


    void DisplayDetails(){
        super.getDetails();
        System.out.println("Designation" + Desig);

    }

}



public class Inter {
    
    public static void main(String args[])
    {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter name");
        String name = scanner.nextLine();

        System.out.println("Enter Desig");
        String desig = scanner.nextLine();

        System.out.println("Enter ID");
        int id = scanner.nextInt();

        System.out.println("Enter Salary");
        int  Salary = scanner.nextInt();

    


        Teaching T1 = new Teaching(id, Salary,name,desig);

        T1.DisplayDetails();

    }
}
