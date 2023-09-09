package class10;

public class Student {
    //properties. attributes
    String name;
    int age;
    String id;
    //methods, functions, behaviors
    void study() {
        System.out.println("Studying 16 hours a day...");
    }

    public static void main(String[] args) {
        Student ehabObj= new Student();
        ehabObj.name= "Ehab";
        ehabObj.age=33;
        ehabObj.id="abe134";
        ehabObj.study(); //scanner.nextInt();

        Student habibObj=new Student();
        habibObj.name= "Habib";
        habibObj.age=20;
        habibObj.id="abe342";
        habibObj.study();
    }

    }

