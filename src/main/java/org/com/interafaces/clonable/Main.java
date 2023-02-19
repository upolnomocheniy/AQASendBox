package org.com.interafaces.clonable;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {

        Animal animal = new Animal("Elephant", "343", 2);


        Animal Test = (Animal) animal.clone();


        System.out.println(animal+ " " + Test);

        if (animal.equals(Test)) {
            System.out.println("obj1 = obj2");
        }
        else System.out.println("no");

    }
}