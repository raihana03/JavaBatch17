package replit;

public class Inheritance150 {
    String firstName;
    String lastName;
    int age;
    public Inheritance150(String firstName, String lastName, int age){
        this.firstName=firstName;
        this.lastName= lastName;
        this.age=age;
        }
    protected void printInfo() {
        System.out.println(firstName + " " + lastName + " " + age);
    }
}
   class Employee extends Inheritance150{
    int salary=35000;
        public Employee(String firstName, String lastName, int age) {
           super(firstName, lastName, age);
            this.salary=salary;
        }
       public void printInfo(){
           super.printInfo();
           System.out.println(salary);
    }}
    class Tester extends Inheritance150{
String programmingLang;

        public Tester(String firstName, String lastName, int age, String programmingLang) {
            super(firstName, lastName, age);
            this.programmingLang = programmingLang;
        }
public void printInfo(){
            super.printInfo();

    System.out.println(programmingLang);
}
        public static void main(String[] args) {
            Employee e1= new Employee("Joe", "Smith", 35);
            e1.printInfo();

            Tester t1= new Tester("Adam", "Smith", 15, "Java");
        t1.printInfo();
        }
    }

