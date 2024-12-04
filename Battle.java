import java.util.Scanner;

public class Battle {
    private Character[] characters;
    private Scanner scanner;

    public Battle(Character[] characters) {
        this.characters = characters;
        this.scanner = new Scanner(System.in);
    }

    public void start() {
        System.out.println("Welcome to the D&D Dungeon Simulator!");

        for (Character character : characters) {
            if (!character.isAlive()) continue;

            System.out.println("\n" + character.getName() + "'s turn:");
            System.out.println("1. Attack with dice roll");
            System.out.println("2. Cast spell: " + character.getName());
            System.out.print("Choose an action (1 or 2): ");
            int action = scanner.nextInt();

            if (action == 1) {
                character.attack();
            } else if (action == 2) {
                character.castSpell();
            } else {
                System.out.println("Invalid action. Turn skipped.");
            }

            // Simulate incoming damage
            int incomingDamage = (int) (Math.random() * 10) + 1;
            character.takeDamage(incomingDamage);

            if (!character.isAlive()) {
                System.out.println(character.getName() + " has fallen!");
            }
        }
    }
}
