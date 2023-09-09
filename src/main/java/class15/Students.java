package class15;

public class Students {
    private String name;
    private int grade1;
    private int grade2;
    private int grade3;

   public Students (String sName, int sGrade1, int sGrade2,  int sGrade3) {
        name = sName;
        grade1 = sGrade1;
        grade2 = sGrade2;
        grade3 = sGrade3;
    }
       public void printInfo(){
            System.out.println(name+ " has an average grade of "+ (grade1+ grade2+ grade3)/3);
        }
        public void printName(){
            System.out.println(name);
        }
    }



