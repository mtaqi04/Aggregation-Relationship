public class Player {
    private String name;
    private Weapon weapon;

    // Constructor
    public Player(String name, Weapon weapon) {
        this.name = name;
        this.weapon = weapon;
    }

    // Getter methods
    public String getName() {
        return name;
    }

    public String getWeaponName() {
        return weapon.getName();
    }
}
