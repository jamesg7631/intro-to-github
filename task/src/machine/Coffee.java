package machine;

public class Coffee {
    private String name;
    private int water;
    private int milk;
    private int coffeeBeans;
    private int cup;
    private int price;

    public Coffee(String name, int water, int milk, int coffeeBeans, int price) {
        this.name = name;
        this.water = water;
        this.milk = milk;
        this.coffeeBeans = coffeeBeans;
        this.cup = 1;
        this.price = price;
    }

    public String getName() {
        return this.name;
    }

    public int getWater() {
        return this.water;
    }

    public int getMilk() {
        return this.milk;
    }

    public int getCoffeeBeans() {
        return  this.coffeeBeans;
    }

    public int getCup() {
        return this.cup;
    }

    public int getPrice() {
        return this.price;
    }


}
