package class16;

public class Cars {
    private String make;
    public String model;
    int year;
    protected String color;

    public Cars (String make, String model) {
        this.make = make;
        this.model = model;
    }
    public Cars (String make, String model, int year, String color) {
        this (make, model);
        this.year = year;
        this.color= color;
}
public void printInfo(){
    System.out.println(make+ " "+ model+" "+ year+" "+ color);
    }
}
