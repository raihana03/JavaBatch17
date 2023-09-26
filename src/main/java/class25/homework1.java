package class25;

/*
Create a Set that will hold Objects of Student Type. In this set we do not care
about the insertion order. Each student object should have name and studentID.
Display name of each student.
 */
public class homework1 {
   private String studentName;
   private int studentID;

   public void Student(String studentName, int studentID){
       this.studentName= studentName;
       this.studentID= studentID;
   }
  public void printInfo(){
      System.out.println("Student Name: "+ studentName);
  }}
    class StudentSetDemo{
    public static void main(String[] args) {
     //   Set <Student> students= new HashSet<>();
      //  students.add(new Student())
    }
}
