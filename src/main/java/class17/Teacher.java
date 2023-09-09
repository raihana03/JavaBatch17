package class17;

public class Teacher {
    String name;
    String subject;
    int students;
    void grade(){
        System.out.println(name+ " grades tests");
    }
    void yells(){
        System.out.println(name+" yells when students are disruptive");
    }
    void helps(){
        System.out.println(name+" helps student with assignments");
    }
    void printInfo(){
        System.out.println(name+" "+ subject+" "+ students);
    }
}
class MathTeacher extends Teacher{
    public static void main(String[] args) {
MathTeacher m= new MathTeacher();
m.name="Barbie";
m.subject= "Math";
m.students= 25;
m.printInfo();
m.grade();
m.yells();
m.helps();
    }
}
class ChemistryTeacher extends Teacher{
    public static void main(String[] args) {
        ChemistryTeacher c= new ChemistryTeacher();
        c.name="Ken";
        c.subject= "Chemistry";
        c.students= 27;
        c.printInfo();
        c.grade();
        c.yells();
        c.helps();
}}
class PianoTeacher extends Teacher{
    public static void main(String[] args) {
        PianoTeacher p= new PianoTeacher();
        p.name="Bob";
        p.subject= "Piano";
        p.students= 30;
        p.printInfo();
        p.grade();
        p.yells();
        p.helps();

    }
}