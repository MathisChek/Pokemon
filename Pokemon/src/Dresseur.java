import java.util.ArrayList;
import java.util.Scanner;

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

    public void afficherAllPokemons(ArrayList<Pokemon>pokemons) {
        System.out.println("Choisi ta team de pokemon !");
        int i = 0;
        while ( i != pokemons.size()) {
            System.out.print(i+1 + " - " + "Name : " + pokemons.get(i).getName() + ", Type : " + pokemons.get(i).getType().getName() + ", Attaques : [");

            if (pokemons.get(i).getMoves().size() > 0) {
                System.out.print(pokemons.get(i).getMoves().get(0).getName());
            }
            if (pokemons.get(i).getMoves().size() > 1) {
                System.out.print("/" + pokemons.get(i).getMoves().get(1).getName());
            }
            System.out.println("], Puissance : " + pokemons.get(i).getAttaque() + ", Defense : " + pokemons.get(i).getDefense());            i ++;
        }
    }

    public void choisirPokemon(ArrayList<Pokemon>pokemons) {
        this.afficherAllPokemons(pokemons);
        int i = 0;
        int y = 6;
        while (i != 6){
            System.out.println("Pokemon restant à choisir : " + y );
            System.out.println("Choose your next pokemon : " );
            Scanner scanner = new Scanner(System.in);
            int choice = scanner.nextInt()-1;
            this.pokemons.add(pokemons.get(choice));
            System.out.println("You choose " + pokemons.get(choice).getName() + " !" );
            i ++;
            y --;
        }
        System.out.println("Your team is : " );
        i = 0;
        while (i != pokemons.size()) {
            System.out.println(pokemons.get(i).getName());
            i++;
        }
    }

}
