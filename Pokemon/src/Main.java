import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        //Liste des types d'attaques
        AttaqueType attaque_normal = new AttaqueType("normal", "Super efficace contre le type electrique", new ArrayList<>(Arrays.asList("Eau")), new ArrayList<>(Arrays.asList("Electricité")));
        AttaqueType attaque_feu = new AttaqueType("feu", "Super efficace contre le type plante", new ArrayList<>(Arrays.asList("Eau")), new ArrayList<>(Arrays.asList("Plante")));
        AttaqueType attaque_electrique = new AttaqueType("electrique", "Super efficace contre le type eau", new ArrayList<>(Arrays.asList("Normal")), new ArrayList<>(Arrays.asList("Eau")));
        AttaqueType attaque_plante = new AttaqueType("plante", "Super efficace contre le type eau", new ArrayList<>(Arrays.asList("Feu")), new ArrayList<>(Arrays.asList("Eau")));

        //Liste des types de pokemons
        PokemonType pokemon_normal = new PokemonType("normal", "Super efficace contre le type electrique", new ArrayList<>(Arrays.asList("Eau")), new ArrayList<>(Arrays.asList("Electricité")));
        PokemonType pokemon_feu = new PokemonType("feu", "Super efficace contre le type plante", new ArrayList<>(Arrays.asList("Eau")), new ArrayList<>(Arrays.asList("Plante")));
        PokemonType pokemon_electrique = new PokemonType("electrique", "Super efficace contre le type eau", new ArrayList<>(Arrays.asList("Normal")), new ArrayList<>(Arrays.asList("Eau")));
        PokemonType pokemon_plante = new PokemonType("plante", "Super efficace contre le type eau", new ArrayList<>(Arrays.asList("Feu")), new ArrayList<>(Arrays.asList("Eau")));
        PokemonType pokemon_eau = new PokemonType("eau", "Super efficace contre le type feu", new ArrayList<>(Arrays.asList("plant")), new ArrayList<>(Arrays.asList("Feu")));

        //Liste d'attaques
        Attaque charge = new Attaque("charge", attaque_normal, 10, 5, 100, 10);
        Attaque feu = new Attaque("feu", attaque_feu, 10, 5, 100, 10);
        Attaque foudre = new Attaque("foudre", attaque_electrique, 10, 5, 100, 10);
        Attaque trancheHerbe = new Attaque("Tranche herbe", attaque_plante, 10, 5, 100, 10);

        //Liste des pokemons
        Pokemon Pikachu = new Pokemon("Pikachu", 50, pokemon_electrique, 0, 1, 50, 10, 10, 5, new ArrayList(Arrays.asList(charge, foudre) ), "vivant");
//        Pokemon Pichu = new Pokemon("Pichu", 25, pokemon_electrique, 0, 1, 25, 5, 5, 3, 4));
//        Pokemon Salameche = new Pokemon("Salamèche", 50, pokemon_feu, 0, 1, 50, 15, 10, 2, 4));
//        Pokemon Carapuce = new Pokemon("Carapuce", 50, pokemon_eau, 0, 1, 50, 10, 10, 2, 4));
//        Pokemon Bulbizarre = new Pokemon("Bulbizarre", 50, pokemon_plante, 0, 1, 50, 10, 10, 2, 4));

        System.out.println(Pikachu.toString());
    }
}