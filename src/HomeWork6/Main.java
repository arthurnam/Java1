package HomeWork6;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws InputMismatchException {

        Scanner scanner = new Scanner(System.in);

        double distanceRun = Math.random() * 500;
        double distanceJump = Math.random() * 3;
        double distanceSwim = Math.random() * 0;
        Cat cat = new Cat(distanceRun, distanceJump, distanceSwim);

        distanceRun = Math.random()*2000;
        distanceJump = Math.random()*2;
        distanceSwim = Math.random()*100;
        Animal dog = new Dog(distanceRun, distanceJump, distanceSwim);


        System.out.println("Кошка пробежала: " + cat.getAnimalDistanceRun() +
                " м. \nСобака пробежала: " + dog.getAnimalDistanceRun() + " м.");



        System.out.println("Кошка прыгнула: " + cat.getAnimalDistanceJump() +
                " м. \nСобака прыгнула: " + dog.getAnimalDistanceJump() + " м.");



        System.out.println("Кошка проплыла: " + cat.getAnimalDistanceSwim() +
                " м. \nСобака проплыла: " + dog.getAnimalDistanceSwim() + " м.");


    }


}
