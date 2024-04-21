package machine;

import java.util.Scanner;

public class CoffeeMachine {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Machine machine = new Machine(400, 540, 120, 9, 550);

        UserInterface userInterface = new UserInterface(scanner, machine);
        userInterface.start();

    }
}
