public class DnDSimulator {
    public static void main(String[] args) {
        // Define spells
        Spell tectonicRage = new Spell("Tectonic Rage", 20);
        Spell frostBolt = new Spell("Frost Bolt", 15);
        Spell vulcanRevolver = new Spell("Vulcan Revolver", 18);
        Spell divineBlessing = new Spell("Divine Blessing", 12);

        // Create characters with unique spells
        Character[] characters = {
            new Character("Dawn Warrior", 100, tectonicRage),
            new Character("Elma the High Elf", 80, frostBolt),
            new Character("Deadeye the Dwarf", 90, vulcanRevolver),
            new Character("Holy Bishop", 70, divineBlessing)
        };

        // Start the battle simulation
        Battle battle = new Battle(characters);
        battle.start();
    }
}

