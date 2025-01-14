import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

public class Main {
    public static void main(String[] args) {

        //Liste des types d'attaques
        ArrayList<AttaqueType> attaqueTypes = new ArrayList<>();
        attaqueTypes.add(new AttaqueType("normal", "Super efficace contre le type electrique", new ArrayList<>(Arrays.asList("eau")), new ArrayList<>(Arrays.asList("electrique"))));
        attaqueTypes.add(new AttaqueType("feu", "Super efficace contre le type plante", new ArrayList<>(Arrays.asList("eau")), new ArrayList<>(Arrays.asList("plante"))));
        attaqueTypes.add(new AttaqueType("electrique", "Super efficace contre le type eau", new ArrayList<>(Arrays.asList("normal")), new ArrayList<>(Arrays.asList("eau"))));
        attaqueTypes.add(new AttaqueType("plante", "Super efficace contre le type eau", new ArrayList<>(Arrays.asList("feu")), new ArrayList<>(Arrays.asList("eau"))));
        attaqueTypes.add(new AttaqueType("eau", "Super efficace contre le type feu", new ArrayList<>(Arrays.asList("plant")), new ArrayList<>(Arrays.asList("eau"))));

        AttaqueType attaque_normal = attaqueTypes.getFirst();
        AttaqueType attaque_feu = attaqueTypes.get(1);
        AttaqueType attaque_electrique = attaqueTypes.get(2);
        AttaqueType attaque_plante = attaqueTypes.get(3);
        AttaqueType attaque_eau = attaqueTypes.get(4);

        //Liste des types de pokemons
        ArrayList<PokemonType> pokemonTypes = new ArrayList<>();
        pokemonTypes.add(new PokemonType("normal", "Super efficace contre le type electrique", new ArrayList<>(Arrays.asList("eau")), new ArrayList<>(Arrays.asList("electrique"))));
        pokemonTypes.add(new PokemonType("feu", "Super efficace contre le type plante", new ArrayList<>(Arrays.asList("eau")), new ArrayList<>(Arrays.asList("plante"))));
        pokemonTypes.add(new PokemonType("electrique", "Super efficace contre le type eau", new ArrayList<>(Arrays.asList("normal")), new ArrayList<>(Arrays.asList("eau"))));
        pokemonTypes.add(new PokemonType("plante", "Super efficace contre le type eau", new ArrayList<>(Arrays.asList("feu")), new ArrayList<>(Arrays.asList("eau"))));
        pokemonTypes.add(new PokemonType("eau", "Super efficace contre le type feu", new ArrayList<>(Arrays.asList("plant")), new ArrayList<>(Arrays.asList("eau"))));

        PokemonType pokemon_normal = pokemonTypes.getFirst();
        PokemonType pokemon_feu = pokemonTypes.get(1);
        PokemonType pokemon_electrique = pokemonTypes.get(2);
        PokemonType pokemon_plante = pokemonTypes.get(3);
        PokemonType pokemon_eau = pokemonTypes.get(4);

        //Liste d'attaques
        Attaque charge = new Attaque("charge", attaque_normal, 10, 5, 100, 10);
        Attaque feu = new Attaque("feu", attaque_feu, 10, 5, 100, 10);
        Attaque foudre = new Attaque("foudre", attaque_electrique, 20, 5, 80, 10);
        Attaque trancheHerbe = new Attaque("Tranche herbe", attaque_plante, 10, 5, 100, 10);
        Attaque bulle_o = new Attaque("Bulle'O", attaque_eau, 10, 5, 100, 10);


        //Liste des pokemons
        ArrayList<Pokemon> pokemons = new ArrayList<>();
        pokemons.add(new Pokemon("Pikachu", 50, pokemon_electrique, 0, 1, 50, 10, 10, 5, new ArrayList(Arrays.asList(charge, foudre) ), "vivant"));
        pokemons.add(new Pokemon("Pichu", 25, pokemon_electrique, 0, 1, 25, 5, 5, 3, new ArrayList(Arrays.asList(charge, foudre) ), "vivant"));
        pokemons.add(new Pokemon("Carapuce", 50, pokemon_eau, 0, 1, 50, 10, 10, 2, new ArrayList(Arrays.asList(charge, bulle_o)), "vivant"));

        Pokemon Pikachu = pokemons.getFirst();
        Pokemon Pichu = pokemons.get(1);
        Pokemon Carapuce = pokemons.get(2);
//        Pokemon Salameche = new Pokemon("Salamèche", 50, pokemon_feu, 0, 1, 50, 15, 10, 2, 4));
//        Pokemon Bulbizarre = new Pokemon("Bulbizarre", 50, pokemon_plante, 0, 1, 50, 10, 10, 2, 4));

        //Dresseur
        Dresseur Ash = new Dresseur("Ash", null, 0, 0, null, 0);

        Ash.choisirPokemon(pokemons);
    }
}