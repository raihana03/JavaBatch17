package replit;

public class ThisKeyword {
    String dogName;
    double dogWeight;
    String dogBreed;

    public ThisKeyword(String dogName, String dogBreed, double dogWeight) {
        this.dogName = dogName;
        this.dogBreed = dogBreed;
        this.dogWeight = dogWeight;

}
    public void printInfo(){
        System.out.println(dogName+ " "+ dogBreed+" "+ dogWeight);
    }
    public static void main(String[] args) {
        ThisKeyword tk = new ThisKeyword("Tarzan", "Mutt", 50.0);
        tk.printInfo();
        ThisKeyword tk1 = new ThisKeyword("Lucy", "Mutt", 10.0);
        tk1.printInfo();

    }
    }