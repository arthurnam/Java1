package HomeWokr7;

public class Cat {
    String name;
    int appetite;
    boolean fullness;

    public Cat(String name, int appetite, boolean fullness) {
        this.name = name;
        this.appetite = appetite;
        this.fullness = fullness;
    }

    public void eat(Plate plateForFood) {
        plateForFood.decreaseFood(appetite);
    }

    public void info() {
        System.out.println("[" + name + appetite + "]");
    }
}
