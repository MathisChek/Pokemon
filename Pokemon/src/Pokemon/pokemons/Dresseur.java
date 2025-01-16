package Pokemon.pokemons;

import java.util.ArrayList;
import java.util.Scanner;

public class Dresseur extends Personnage {
    private ArrayList<Pokemon> pokemons;
    private ArrayList<Item> items;
    private int victories;
    private int defeates;
    private int pokedollars;
    private Pokemon currentPokemon;

    public Pokemon getCurrentPokemon() {
        return currentPokemon;
    }

    public void setCurrentPokemon(Pokemon currentPokemon) {
        this.currentPokemon = currentPokemon;
    }

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

    public Dresseur(String name, ArrayList<Pokemon> pokemons, int pokedollars, int defeates, ArrayList<Item> items, int victories, Pokemon currentPokemon) {
        super(name);
        this.pokemons = pokemons;
        this.pokedollars = pokedollars;
        this.defeates = defeates;
        this.items = items;
        this.victories = victories;
        this.currentPokemon = currentPokemon;
    }

    public void afficherAllPokemons(ArrayList<Pokemon>pokemons) {
        System.out.println("Choisi ta team de pokemon !");
        int i = 0;
        while ( i < pokemons.size()) {
            if (pokemons.get(i).getCurrentPV() > 0) {
                System.out.println(i + " - " + "Name : " + pokemons.get(i).getName() + ", Type :  " + pokemons.get(i).getType().getName() + ", Puissance : " + pokemons.get(i).getAttaque() + ", Defense : " + pokemons.get(i).getDefense());
            }
            i ++;
        }
    }

    public void choisirPokemon(ArrayList<Pokemon>pokemons) {
        this.afficherAllPokemons(pokemons);
        int i = 0;
        int y = 6;
        while (i != 6){
            System.out.println("Pokemon restant à choisir : " + y );
            Scanner scanner = new Scanner(System.in);
            i ++;
            y --;
        }
    }

    public boolean pokemonsKo(){
        int i = 0;
        int nbPokemonKo = 0;
        while (i < this.getPokemons().size() ) {
            if (this.getPokemons().get(i).getKo()) {
                nbPokemonKo++;
                i++;
            } else {
                i++;
                continue;
            }
        }
        if (nbPokemonKo < this.getPokemons().size()) {
            return false;
        } else if (nbPokemonKo == this.getPokemons().size()) {
            return true;
        } else {
            return false;
        }
    }

    public void changePokemon() {
        this.afficherAllPokemons(this.getPokemons());
        System.out.println("Choisi ton pokemon :");
        Scanner scanner = new Scanner(System.in);
        int pokemonId = scanner.nextInt();

        this.setCurrentPokemon(this.getPokemons().get(pokemonId));
    }

}
