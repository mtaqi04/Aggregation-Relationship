public class Main {
    public static void main(String[] args) {
        // Create a Weapon object
        Weapon sword = new Weapon("Sword");

        // Create a Player object and assign the Weapon to them
        Player player = new Player("Arthur", sword);

        // Print out the player's name and the name of the weapon they are wielding
        System.out.println("Player Name: " + player.getName());
        System.out.println("Weapon: " + player.getWeaponName());
    }
}
