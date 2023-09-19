package class20;

public abstract class Student {
    String name;
    String id;
    public Student (String name, String id){
        this.name=name;
        this.id=id;
    }
    public void printInfo(){
        System.out.println(name+" "+ id);
    }

    abstract void homework();

    abstract void extraCurricular();

    public void study() {
    }
}
