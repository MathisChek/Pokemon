import java.util.List;

class Pokemon {
    String name;
    String type;
    int level;
    int healthPoints;
    int maxHealthPoints;
    List<Attaque> moves;

    public Pokemon(String name, String type, int level, int maxHealthPoints, List<Attaque> moves) {
        this.name = name;
        this.type = type;
        this.level = level;
        this.maxHealthPoints = maxHealthPoints;
        this.healthPoints = maxHealthPoints;
        this.moves = moves;
    }

    // Attaque un autre Pokémon
    public void attack(Pokemon target, Attaque move) {
        int damage = move.damage;
        System.out.println(name + " utilise " + move.name + " !");
        target.healthPoints -= damage;

        if (target.healthPoints < 0) target.healthPoints = 0;

        System.out.println(target.name + " perd " + damage + " PV ! Il reste " + target.healthPoints + "/" + target.maxHealthPoints + " PV.");
    }

    @Override
    public String toString() {
        return name + " (Type: " + type + ", Niveau: " + level + ", PV: " + healthPoints + "/" + maxHealthPoints + ")";
    }
}