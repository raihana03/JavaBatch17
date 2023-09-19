package review9;

public class Printer {
    void print() {
        System.out.println("Hello");
    }
    void print(String word) { //overloading
        System.out.println(word);
    }
    void print(int num) {
        System.out.println(num);
    }
    void print(String word, int num ){
        System.out.println(word+ " "+ num);
}
    void print(int num, String word){
        System.out.println(word+ " "+ num);
    }
    void print (int...arr){
        for (int num: arr);
    }
    //var args or variable args
    void print (String...a){
        System.out.println("pass as many");
    }
    public static void main(String [] args){
    }
}
