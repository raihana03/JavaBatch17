package class20;

public class ComputerTester {
    public static void main(String[] args) {
        Computer c= new Computer();
        Apple apple= new Apple();
        Lenovo lenovo= new Lenovo();
        HP hp= new HP();
        Dell dell= new Dell();

        Computer [] arr= {new Apple(), new Lenovo(), new HP(), new Dell()};
        for(int i=0; i<arr.length; i++){
            arr[i].browser();
            arr[i].virus();
            arr[i].shutOff();
        }
    }
}
