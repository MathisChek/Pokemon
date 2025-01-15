import java.util.ArrayList;
import java.util.Arrays;

public class DresseurTest {
    public static void main(String[] args) {
        Pokemon pikachu = new Pokemon(
                "Pikachu",
                35,
                new PokemonType("Electrique", "Super efficace contre l'eau",
                        new ArrayList<>(Arrays.asList("Sol")),
                        new ArrayList<>(Arrays.asList("Vol"))),
                0,
                5,
                35,
                55,
                40,
                90,
                new ArrayList<>(),
                "Vivant"
        );

        Item potion = new Item("Potion", "Healing", "Soigne 20 HP", 3);

        ArrayList<Pokemon> pokemonList = new ArrayList<>(Arrays.asList(pikachu));
        ArrayList<Item> itemList = new ArrayList<>(Arrays.asList(potion));

        Dresseur trainer = new Dresseur("Ash", pokemonList, 1000, 2, itemList, 5);

        assert trainer.getName().equals("Ash") : "Le nom du dresseur devrait être 'Ash'";
        assert trainer.getPokemons().equals(pokemonList) : "La liste des pokemons ne correspond pas";
        assert trainer.getItems().equals(itemList) : "La liste des items ne correspond pas";
        assert trainer.getPokedollars() == 1000 : "Le nombre de pokedollars doit être 1000";
        assert trainer.getDefeates() == 2 : "Le nombre de défaites doit être 2";
        assert trainer.getVictories() == 5 : "Le nombre de victoires doit être 5";

        trainer.setName("Misty");
        trainer.setPokemons(new ArrayList<>()); /
        trainer.setItems(new ArrayList<>());
        trainer.setPokedollars(500);
        trainer.setDefeates(1);
        trainer.setVictories(10);

        // Verify updated values.
        assert trainer.getName().equals("Misty") : "Le nom du dresseur devrait être 'Misty'";
        assert trainer.getPokemons().isEmpty() : "La liste des pokemons devrait être vide";
        assert trainer.getItems().isEmpty() : "La liste des items devrait être vide";
        assert trainer.getPokedollars() == 500 : "Le nombre de pokedollars doit être 500";
        assert trainer.getDefeates() == 1 : "Le nombre de défaites doit être 1";
        assert trainer.getVictories() == 10 : "Le nombre de victoires doit être 10";


        trainer.attaque("Un adversaire", 15);

        System.out.println("Tous les tests de Dresseur sont passés.");
    }
}
