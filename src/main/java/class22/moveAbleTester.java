package class22;

public interface moveAbleTester {
    public static void main(String[] args) {
        moveAble[] arr= {new Car(), new Dog()};
        for (moveAble a:arr) {
            a.move();

            }
        }
}

/*
Washable[] arr1 = {new Car(), new Dog()};
            for (Washable b : arr1) {
                b.wash();

            }
 */