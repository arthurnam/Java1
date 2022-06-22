package HomeWork6;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double distanceRun = 200;
        double distanceJump = 3;
        double distanceSwim = 0;
        Cat cat = new Cat(distanceRun, distanceJump, distanceSwim);

        distanceRun = 500;
        distanceJump = 2;
        distanceSwim = 10;
        Animal dog = new Dog(distanceRun, distanceJump, distanceSwim);


        System.out.println("Кошка пробежала: " + cat.getAnimalDistanceRun() +
                " м. \nСобака пробежала: " + dog.getAnimalDistanceRun() + " м.");



        System.out.println("Кошка прыгнула: " + cat.getAnimalDistanceJump() +
                " м. \nСобака прыгнула: " + dog.getAnimalDistanceJump() + " м.");



        System.out.println("Кошка проплыла: " + cat.getAnimalDistanceSwim() +
                " м. \nСобака проплыла: " + dog.getAnimalDistanceSwim() + " м.");


    }


}
