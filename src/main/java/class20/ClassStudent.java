package class20;

public abstract class ClassStudent {
    void homework() {
        System.out.println("Student is doing homework");
    }
    void exam() {
        System.out.println("student is taking an exam");
    }
    void study() {
        System.out.println("Student is studying");
    }
    void play() {
        System.out.println("Student likes to play Chess");
    }
    void extraCurricular() {
        System.out.println("Student likes to do extra curricular activites");
    }
}
class SyntaxStudent extends Student {
    public SyntaxStudent(String name, String id) {
        super(name, id);
    }
    @Override
    void homework() {
    }
    @Override
    void extraCurricular() {
    }
    void play() {
        System.out.println("Student likes to play cards");
    }
}
class CollegeStudent extends Student {
    public CollegeStudent(String name, String id) {
        super(name, id);
    }
    @Override
    void homework() {
    }

    @Override
    void extraCurricular() {
        System.out.println("Student likes to nap instead");
    }
}
class SchoolStudent extends Student {
    public SchoolStudent(String name, String id) {
        super(name, id);
    }
    @Override
    void homework() {
        System.out.println("Student doesn't like to do homework, instead likes to chill all day");
    }
    @Override
    void extraCurricular() {
    }

//public class StudentTester {
    public static void main(String[] args) {
      ///  ClassStudent[] arr = {new Student(), new SyntaxStudent(), new CollegeStudent(), new SchoolStudent()};
        //for (int i = 0; i < arr.length; i++) {
           // arr[i].study();
            //arr[i].play();
            //arr[i].extraCurricular();

        }
    }