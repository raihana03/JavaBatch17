package class22;

public interface moveAble {
    public abstract void move();
}
interface WashAble{
    void wash();
    void method1();
}
class Dog implements moveAble{
    public void move() {
        System.out.println("Dogs can jump run and can move");
    }
        public void method1(){
            System.out.println("You can safely wash a dog");
        }
        }
        class Car implements moveAble{

            @Override
            public void move() {
                System.out.println("Car can move forward backwards and go in circles");
            }
        }