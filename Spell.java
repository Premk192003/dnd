public class Spell {
    private String name;
    private int maxDamage;

    public Spell(String name, int maxDamage) {
        this.name = name;
        this.maxDamage = maxDamage;
    }

    public String getName() {
        return name;
    }

    public int cast() {
        return (int) (Math.random() * maxDamage) + 1; // Random damage up to maxDamage
    }
}
