package class25;

import java.util.LinkedList;

public class T1ArrayList {
    public static void main(String[] args) {
        LinkedList<Cat> cats = new LinkedList<>();

        cats.add(new Cat("Tom,","Calico", 5));
        cats.add(new Cat("Sam", "Calico", 10));
        cats.add(new Cat("Nagi", "Norweigan Forest Cat", 2));

        cats.forEach(x->x.printInfo());

        }
    }
    class Cat {
        private String name;
        private String breed;
        private int age;

        public Cat(String name, String breed, int age) {
            this.name = name;
            this.breed = breed;
            this.age = age;
        }

        public void printInfo() {
            System.out.println("Name: " + name);
            System.out.println("Breed: " + breed);
            System.out.println("Age: " + age);
        }
    }