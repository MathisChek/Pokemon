import java.util.ArrayList;

public class Dresseur extends Personnage {
    private ArrayList<Pokemon> pokemons;
    private ArrayList<Item> items;
    private int victories;
    private int defeates;
    private int pokedollars;

    public ArrayList<Pokemon> getPokemons() {
        return pokemons;
    }

    public void setPokemons(ArrayList<Pokemon> pokemons) {
        this.pokemons = pokemons;
    }

    public ArrayList<Item> getItems() {
        return items;
    }

    public void setItems(ArrayList<Item> items) {
        this.items = items;
    }

    public int getVictories() {
        return victories;
    }

    public void setVictories(int victories) {
        this.victories = victories;
    }

    public int getDefeates() {
        return defeates;
    }

    public void setDefeates(int defeates) {
        this.defeates = defeates;
    }

    public int getPokedollars() {
        return pokedollars;
    }

    public void setPokedollars(int pokedollars) {
        this.pokedollars = pokedollars;
    }

    public Dresseur(String name, ArrayList<Pokemon> pokemons, int pokedollars, int defeates, ArrayList<Item> items, int victories) {
        super(name);
        this.pokemons = pokemons;
        this.pokedollars = pokedollars;
        this.defeates = defeates;
        this.items = items;
        this.victories = victories;
    }

    @Override
    public void attaque(String cible, int dammage) {
        System.out.println("attack " + cible + " damage " + dammage);
    }
}
