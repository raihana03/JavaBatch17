package class13;

public class HW1StudentsTester {
    public static void main(String[] args) {
        HW1Students e1= new HW1Students();
        e1.name= "Ken";
        e1.ID= 101;
        e1.numberOfStudents++;

        HW1Students e2= new HW1Students();
        e2.name= "Barbie";
        e2.ID= 102;
        e2.numberOfStudents++;

        HW1Students e3= new HW1Students();
        e3.name= "Ali";
        e3.ID= 103;
        e3.numberOfStudents++;

        System.out.println("Number of students is "+ e3.numberOfStudents);
    }

}
