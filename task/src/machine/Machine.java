package machine;

public class Machine {
    private int water;
    private int milk;
    private int coffeeBeans;
    private int cups;
    private int money;

    public Machine(int water, int milk, int coffeeBeans, int cups, int money) {
        this.water = water;
        this.milk = milk;
        this.coffeeBeans = coffeeBeans;
        this.cups = cups;
        this.money = money;
    }

    public void buy(String choice) {
        Coffee coffee = makeCoffee(choice);
        if (coffee != null) {
            boolean getCoffee = checkInventory(coffee);
        }

    }

    public void fill(int water, int milk, int coffeeBeans, int cups) {
        if (water > 0) {
            this.water += water;
        }

        if (milk > 0) {
            this.milk += milk;
        }

        if (coffeeBeans > 0) {
            this.coffeeBeans += coffeeBeans;
        }

        if (cups > 0) {
            this.cups += cups;
        }
    }

    public int take() {
        int money = this.money;
        this.money = 0;
        return money;
    }

    public String toString() {
        return this.water + " ml of water\n" + this.milk + " ml of milk\n" + this.coffeeBeans + " g of coffee beans\n" + this.cups + " disposable cups\n" + "$" + this.money + " of money";
    }

    private Coffee makeCoffee(String type) {
        Coffee coffee = null;
        if (type.equals("1")) {
            coffee = new Coffee("espresso", 250, 0, 16, 4);
        } else if (type.equals("2")) {
            coffee = new Coffee("latte", 350, 75, 20, 7);
        } else if (type.equals("3")) {
            coffee = new Coffee("cappuccino", 200, 100, 12, 6);
        }
        return coffee;
    }


    private boolean checkInventory(Coffee coffee) {
        boolean enoughInventory = false;
        boolean enoughWater = false;
        boolean enoughMilk = false;
        boolean enoughBeans = false;
        boolean enoughCups = false;


        if (this.water >= coffee.getWater()) {
            enoughWater = true;
        } else {
            System.out.println("Sorry, not enough water!");
        }

        if (this.milk >= coffee.getMilk()) {
            enoughMilk = true;
        } else {
            System.out.println("Sorry, not enough milk!");
        }

        if (this.coffeeBeans >= coffee.getCoffeeBeans()) {
            enoughBeans = true;
        } else {
            System.out.println("Sorry, not enough coffee beans!");
        }

        if (this.cups >= coffee.getCup()) {
            enoughCups = true;
        } else {
            System.out.println("Sorry, not enough cups!");
        }

        if (enoughWater && enoughMilk && enoughBeans && enoughCups) {
            enoughInventory = true;
            this.water -= coffee.getWater();
            this.milk -= coffee.getMilk();
            this.money += coffee.getPrice();
            this.coffeeBeans -= coffee.getCoffeeBeans();
            this.cups -= coffee.getCup();

            System.out.println("I have enough resources, making you a coffee!");

        }
        return enoughInventory;
    }
}
