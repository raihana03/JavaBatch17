package replit;

public class OverRiding164 {
    void display() {
        System.out.println("I am a child default method");
    }
        public void show(){
            System.out.println("I am a child public method");
        }
        protected void test(){
            System.out.println("I am a child protected method");
        }
        private void look(){
            System.out.println("I am a child private method");
        }

    }
    class Child3 extends OverRiding164{
        @Override
        void display() {
            System.out.println("I am a child public method");
        }

        @Override
        public void show() {
            System.out.println("I am a child protected method");
        }

        @Override
        protected void test() {
            System.out.println("I am a child default method");
        }

        public static void main(String[] args) {
            Child3 c= new Child3();
            c.display();
            c.show();
            c.test();
        }

        }

