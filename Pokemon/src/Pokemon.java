import java.util.ArrayList;

public class Pokemon extends Personnage {
    private int currentPV;
    private PokemonType type;
    private int level;
    private int exp;
    private int maxPV;
    private int attaque;
    private int defense;
    private int speed;
    private ArrayList<Attaque> moves;
    private String status;

    public int getCurrentPV() {
        return currentPV;
    }

    public void setCurrentPV(int currentPV) {
        this.currentPV = currentPV;
    }

    public PokemonType getType() {
        return type;
    }

    public void setType(PokemonType type) {
        this.type = type;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getExp() {
        return exp;
    }

    public void setExp(int exp) {
        this.exp = exp;
    }

    public int getMaxPV() {
        return maxPV;
    }

    public void setMaxPV(int maxPV) {
        this.maxPV = maxPV;
    }

    public int getAttaque() {
        return attaque;
    }

    public void setAttaque(int attaque) {
        this.attaque = attaque;
    }

    public int getDefense() {
        return defense;
    }

    public void setDefense(int defense) {
        this.defense = defense;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public ArrayList<Attaque> getMoves() {
        return moves;
    }

    public void setMoves(ArrayList<Attaque> moves) {
        this.moves = moves;
    }

    @Override
    public void attaque(String cible, int dammage) {
        System.out.println("Attaque pokemon");
    }

    public void ajouterAttaque(Attaque attaque) {
        moves.add(attaque);
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Pokemon(String name, int currentPV, PokemonType type, int exp, int level, int maxPV, int attaque, int defense, int speed, ArrayList<Attaque> moves, String status) {
        super(name);
        this.currentPV = currentPV;
        this.type = type;
        this.exp = exp;
        this.level = level;
        this.maxPV = maxPV;
        this.attaque = attaque;
        this.defense = defense;
        this.speed = speed;
        this.moves = moves;
        this.status = status;
    }

    @Override
    public String toString() {
        return "Pokemon{" +
                "name= " + this.getName() +
                ", currentPV=" + currentPV +
                ", type=" + type +
                ", level=" + level +
                ", exp=" + exp +
                ", maxPV=" + maxPV +
                ", attaque=" + attaque +
                ", defense=" + defense +
                ", speed=" + speed +
                ", moves=" + moves +
                ", status='" + status +
                '}';
    }
}
