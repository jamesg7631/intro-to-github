package machine;

import java.util.Scanner;

public class UserInterface {

    private Scanner scanner;
    Machine coffeeMachine;

    public UserInterface(Scanner scanner, Machine coffeeMachine) {
        this.scanner = scanner;
        this.coffeeMachine = coffeeMachine;
    }

    public void start() {
        while (true) {
            System.out.println("Write action (buy, fill, take, remaining, exit):");
            String action = this.scanner.nextLine();
            if (action.equals("exit")) {
                break;
            }
            commands(action);
            System.out.println();
        }
    }

    public void commands(String command) {
        System.out.println();
        if (command.equals("buy")) {
            buy();
        } else if (command.equals("fill")) {
            fill();
        } else if (command.equals("take")) {
            take();
        } else if (command.equals("remaining")) {
            remaining();
        }
    }
    public void buy() {
        System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu:");
        String purchase = scanner.nextLine();

        switch (purchase){
            case "1":
                this.coffeeMachine.buy("1");
                break;
            case "2":
                this.coffeeMachine.buy("2");
                break;
            case "3":
                this.coffeeMachine.buy("3");
                break;
        }
    }

    public void fill() {
        System.out.println("Write how many ml of water you would like to add:");
        int water = scanner.nextInt();
        System.out.println("Write how many ml of milk you would like to add:");
        int milk = scanner.nextInt();
        System.out.println("Write how many grams of coffee beans you want to add:");
        int coffeeBeans = scanner.nextInt();
        System.out.println("Write how many disposable cups you want to add:");
        int cups = scanner.nextInt();

        this.coffeeMachine.fill(water, milk, coffeeBeans, cups);
    }

    public void take() {
        System.out.println("I gave you $" + this.coffeeMachine.take());
    }

    public void remaining() {
        System.out.println("The coffee machine has:");
        System.out.println(coffeeMachine);
        System.out.println();
    }
}
