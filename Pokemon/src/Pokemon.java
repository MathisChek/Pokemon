import java.util.ArrayList;
import java.lang.Math;
import java.util.Objects;

public class Pokemon extends Personnage {
    private int currentPV;
    private PokemonType type;
    private int level;
    private int exp;

    private int nextLevel;


    private int maxPV;
    private int attaque;
    private int defense;
    private int speed;
    private ArrayList<Attaque> moves;
    private Boolean ko;

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

    public int getNextLevel() {
        return nextLevel;
    }

    public void setNextLevel(int nextLevel) {
        this.nextLevel = nextLevel;
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

    public void ajouterAttaque(Attaque attaque) {
        moves.add(attaque);
    }

    public Boolean getKo() {
        return ko;
    }

    public void setKo(Boolean ko) {
        this.ko = ko;
    }

    public Pokemon(String name, int currentPV, PokemonType type, int exp, int level, int maxPV, int attaque, int defense, int speed, ArrayList<Attaque> moves, Boolean ko) {
        super(name);
        this.currentPV = currentPV;
        this.type = type;
        this.exp = exp;
        this.level = level;
        this.nextLevel = nextLevel;
        this.maxPV = maxPV;
        this.attaque = attaque;
        this.defense = defense;
        this.speed = speed;
        this.moves = moves;
        this.ko = ko;
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
                ", status='" + ko +
                '}';
    }

    public void attaquer(Pokemon cible, Attaque attaque) {
        cible.recevoirDegat(attaque, this.attaque);
    }

    public void recevoirDegat(Attaque attaque, int puissance) {
        Double rand = Math.random() * 100;
        if (rand > attaque.getAccuracy() ) {
            System.out.println("Attaque manquée");
        } else {
            if (Objects.equals(attaque.getType().getStrengths().get(0), this.getType().getName())) {
                this.currentPV -= ((attaque.getDamage() * puissance) / this.defense) * 1.2;
                System.out.println("Super efficace");
            } else if (this.getType().getStrengths().get(0).equals(attaque.getType().getName())){
                this.currentPV -= ((attaque.getDamage() * puissance) / this.defense) * 0.5;
                System.out.println("Tres peu efficace");
            } else {
                this.currentPV -= (attaque.getDamage() * puissance) / this.defense;
                System.out.println("Attaque normal");
            }
        }
    }

    public void gagneXP(Pokemon PokemonKo ) {
            int xpGagnee = PokemonKo.getLevel() * 10;
            this.exp += xpGagnee;


            while(this.exp>this.nextLevel) {
                this.level ++;
                System.out.println(this.getName() + " a gagné un niveau ! ");
                this.nextLevel += 30;
                System.out.println(this.getName() + " à gagné " + xpGagnee + " points d'expérience ! Niveau : " + this.level);

                this.attaque += 2;
                this.defense += 1;
                this.speed += 1;
                System.out.println("Nouvelle attaque : " + this.attaque);
                System.out.println("Nouvelle défense : " + this.defense);
                System.out.println("Nouvelle vitesse : " + this.speed);


            }

    }
}
