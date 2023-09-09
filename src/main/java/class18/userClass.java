package class18;

public class userClass {
    String name;
    String number;
    public userClass(String name, String number){
        this.name=name;
        this.number=number;
}}
class userInfo extends userClass {
    String address;

    public userInfo(String name, String number, String address) {
        super(name, number);
        this.address = address;
    }
    void userDetails() {
        System.out.println(name + " " + number + " " + address);
    }
}
