package class22;

public class ABSTester {
    int age;
    ABSTester(){}
        private void Batch17YouShouldStart(){
            System.out.println("Its possible");
        }
        public void anotherM(){
            Batch17YouShouldStart();
        }
    }

    interface A{

    }

class Tester{
    public static void main(String[] args) {
        ABSTester a= new ABSTester();
       // A a= new A();
    }
}