package HomeWokr7;
import java.util.Scanner;

public class Main {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int action;
        Cat[] allCats = new Cat[4];
        allCats[0] = new Cat("Леопольт", 50, false);
        allCats[1] = new Cat("Рыжик", 30, false);
        allCats[2] = new Cat("Босс", 70, false);

        Plate plate = new Plate(200);
        plate.info();
        for (int i = 0; i < allCats.length; i++) {
            if (allCats[i].fullness == false && allCats[i].appetite < plate.food){
                allCats[i].eat(plate);
                allCats[i].fullness = true;
                System.out.println("Кот " + allCats[i].name + " поел");
            } else {
                System.out.println("Кот " + allCats[i].name + " не поел");
            }
        }
        plate.info();
        action = sc.nextInt();
        plate.increaseFood(action);
        plate.info();

    }
}