package Pokemon;

import Pokemon.pokemons.Dresseur;
import Pokemon.pokemons.Attaque;
import Pokemon.pokemons.AttaqueType;
import Pokemon.pokemons.Pokemon;
import Pokemon.pokemons.PokemonType;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        //Liste des types d'attaques
        ArrayList<AttaqueType> attaqueTypes = new ArrayList<>();
        attaqueTypes.add(new AttaqueType("normal", "Super efficace contre le type electrique", new ArrayList<>(Arrays.asList("feu")), new ArrayList<>(Arrays.asList("electrique"))));
        attaqueTypes.add(new AttaqueType("feu", "Super efficace contre le type plante", new ArrayList<>(Arrays.asList("eau")), new ArrayList<>(Arrays.asList("plante"))));
        attaqueTypes.add(new AttaqueType("electrique", "Super efficace contre le type eau", new ArrayList<>(Arrays.asList("normal")), new ArrayList<>(Arrays.asList("eau"))));
        attaqueTypes.add(new AttaqueType("plante", "Super efficace contre le type eau", new ArrayList<>(Arrays.asList("feu")), new ArrayList<>(Arrays.asList("eau"))));
        attaqueTypes.add(new AttaqueType("eau", "Super efficace contre le type feu", new ArrayList<>(Arrays.asList("plant")), new ArrayList<>(Arrays.asList("feu"))));

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
        Attaque charge = new Attaque("charge", attaque_normal, 100, 5, 100, 10);
        Attaque flameche = new Attaque("flameche", attaque_feu, 10, 5, 100, 10);
        Attaque foudre = new Attaque("foudre", attaque_electrique, 20, 5, 80, 10);
        Attaque trancheHerbe = new Attaque("Tranche herbe", attaque_plante, 10, 5, 100, 10);
        Attaque bulle_o = new Attaque("Bulle'O", attaque_eau, 10, 5, 100, 10);


        //Liste des pokemons
        ArrayList<Pokemon> pokemonsAsh = new ArrayList<>();
        pokemonsAsh.add(new Pokemon("Pikachu", 50, pokemon_electrique, 0, 1, 50, 10, 10, 5, new ArrayList(Arrays.asList(charge, foudre)), false));
        pokemonsAsh.add(new Pokemon("Pichu", 25, pokemon_electrique, 0, 1, 25, 10, 10, 3, new ArrayList(Arrays.asList(charge, foudre)), false));
        pokemonsAsh.add(new Pokemon("Carapuce", 50, pokemon_eau, 0, 1, 50, 10, 10, 2, new ArrayList(Arrays.asList(charge, bulle_o)), false));
        pokemonsAsh.add(new Pokemon("Salamèche", 50, pokemon_feu, 0, 1, 50, 15, 10, 2, new ArrayList(Arrays.asList(charge, flameche)), false));
        pokemonsAsh.add(new Pokemon("Bulbizarre", 50, pokemon_plante, 0, 1, 50, 10, 10, 2, new ArrayList(Arrays.asList(charge, trancheHerbe)), false));
        pokemonsAsh.add(new Pokemon("Rondoudou", 50, pokemon_normal, 0, 1, 50, 10, 10, 2, new ArrayList(Arrays.asList(charge)), false));

        ArrayList<Pokemon> pokemonsJessee = new ArrayList<>();
        pokemonsJessee.add(new Pokemon("Electec", 50, pokemon_electrique, 0, 1, 50, 10, 10, 2, new ArrayList(Arrays.asList(charge, foudre)), false));
//        pokemonsJessee.add(new Pokemon("Dracofeu", 50, pokemon_feu, 0, 1, 50, 10, 10, 2, new ArrayList(Arrays.asList(charge, flameche)), false));
//        pokemonsJessee.add(new Pokemon("Mr MIME", 50, pokemon_normal, 0, 1, 50, 10, 10, 2, new ArrayList(Arrays.asList(charge)), false));
//        pokemonsJessee.add(new Pokemon("Rozbouton", 50, pokemon_plante, 0, 1, 50, 10, 10, 2, new ArrayList(Arrays.asList(charge, trancheHerbe)), false));
//        pokemonsJessee.add(new Pokemon("Tortank", 50, pokemon_eau, 0, 1, 50, 10, 10, 2, new ArrayList(Arrays.asList(charge, bulle_o)), false));
//        pokemonsJessee.add(new Pokemon("Raichu", 50, pokemon_electrique, 0, 1, 50, 10, 10, 2, new ArrayList(Arrays.asList(charge, foudre)), false));

        Pokemon Pikachu = pokemonsAsh.getFirst();
        Pokemon Pichu = pokemonsAsh.get(1);
        Pokemon Carapuce = pokemonsAsh.get(2);
        Pokemon Salamèche = pokemonsAsh.get(3);
        Pokemon Bulbizarre = pokemonsAsh.get(4);
        Pokemon Rondoudou = pokemonsAsh.get(5);
        Pokemon Electec = pokemonsJessee.get(0);
//        Pokemon Dracofeu = pokemonsJessee.get(1);
//        Pokemon Mr_MIME = pokemonsJessee.get(2);
//        Pokemon Rozbouton = pokemonsJessee.get(3);
//        Pokemon Tortank = pokemonsJessee.get(4);
//        Pokemon Raichu = pokemonsJessee.get(5);


        String uri = "mongodb+srv://mathischekraouimc:Yamakasi99@cluster0.xmglm.mongodb.net/?retryWrites=true&w=majority&appName=Cluster0";
        try (MongoClient mongoClient = MongoClients.create(uri)) {
            System.out.println("Connected to MongoDB");
        } catch (Exception e) {
            e.printStackTrace();
        }

        //Dresseur
        Dresseur Ash = new Dresseur("Ash", pokemonsAsh, 0, 0, null, 0, Pikachu);
        Dresseur Jessee = new Dresseur("Jessee", pokemonsJessee, 0, 0, null, 0, Electec);

        //Pokemon.Combat
        Combat arene = new Combat(new ArrayList<>(Arrays.asList(Ash, Jessee)), null);

//        Ash.choisirPokemon(pokemons);
//        Ash.pokemonsKo(Ash.getPokemons());

        arene.startCombat(Ash, Jessee);

    }
}