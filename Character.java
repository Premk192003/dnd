public class Character {
    private String name;
    private int health;
    private Spell spell;

    public Character(String name, int health, Spell spell) {
        this.name = name;
        this.health = health;
        this.spell = spell;
    }

    public String getName() {
        return name;
    }

    public boolean isAlive() {
        return health > 0;
    }

    public void castSpell() {
        System.out.println(name + " casts " + spell.getName() + "!");
        int spellDamage = spell.cast();
        System.out.println("The spell deals " + spellDamage + " damage!");
    }

    public void attack() {
        int damage = (int) (Math.random() * 20) + 1; // Simulates a D20 roll
        System.out.println(name + " attacks and deals " + damage + " damage!");
    }

    public void takeDamage(int damage) {
        health -= damage;
        System.out.println(name + " takes " + damage + " damage. Health now: " + health);
    }
}
