package class13;

public class T1EmployeeTester {
    public static void main(String[] args) {
        T1Employee e1= new T1Employee();
        e1.empID= 012345;
        e1.salary=76000;

        T1Employee e2= new T1Employee();
        e2.empID= 67889;
        e2.salary=39000;

        System.out.println(e2.salary);
        System.out.println(e2.empID);
        System.out.println(e2.CEO);

    }
}
