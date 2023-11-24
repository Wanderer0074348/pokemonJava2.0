import java.util.Scanner;

public class PokemonGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Welcome to the Pokemon Game!");
        
        // Create a Pokemon
        Pokemon pokemon = new Pokemon("Pikachu", 100);
        
        // Game loop
        while (true) {
            System.out.println("What would you like to do?");
            System.out.println("1. Attack");
            System.out.println("2. Heal");
            System.out.println("3. Quit");
            
            int choice = scanner.nextInt();
            
            switch (choice) {
                case 1:
                    pokemon.attack();
                    break;
                case 2:
                    pokemon.heal();
                    break;
                case 3:
                    System.out.println("Thanks for playing!");
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        }
    }
}

class Pokemon {
    private String name;
    private int health;
    
    public Pokemon(String name, int health) {
        this.name = name;
        this.health = health;
    }
    
    public void attack() {
        System.out.println(name + " used Thunderbolt!");
        System.out.println("Enemy Pokemon took 20 damage.");
        health -= 20;
        System.out.println("Enemy Pokemon's health: " + health);
    }
    
    public void heal() {
        System.out.println(name + " used Potion!");
        System.out.println("Recovered 20 health.");
        health += 20;
        System.out.println("Your Pokemon's health: " + health);
    }
}
