import java.util.ArrayList;
import java.util.Arrays;

public class PokemonTest {

    public static void main(String[] args) {
        testToString();
        testAjouterAttaque();
        testAttaqueMethod(); // will prits Attack Pokemon
        System.out.println("Tous les tests de Pokemon sont passés.");
    }

    // Test -  toString  - method
    private static void testToString() {
        PokemonType typeElectrique = new PokemonType(
                "electrique",
                "Super efficace contre le type eau",
                new ArrayList<>(Arrays.asList("Normal")),
                new ArrayList<>(Arrays.asList("Eau"))
        );

        Attaque charge = new Attaque(
                "charge",
                new AttaqueType(
                        "normal",
                        "Effet de charge",
                        new ArrayList<>(Arrays.asList("Eau")),
                        new ArrayList<>(Arrays.asList("Electricité"))
                ),
                10, 5, 100, 10
        );
        ArrayList<Attaque> moves = new ArrayList<>(Arrays.asList(charge));

        Pokemon pikachu = new Pokemon(
                "Pikachu",
                50,
                typeElectrique,
                0,
                1,
                50,
                10,
                10,
                5,
                moves,
                "vivant"
        );

        String toStringValue = pikachu.toString();
        assert toStringValue.contains("Pikachu") : "La chaîne doit contenir 'Pikachu'";
        assert toStringValue.contains("50") : "La chaîne doit contenir '50' (points de vie ou autre attribut)";
        assert toStringValue.contains("electrique") : "La chaîne doit contenir 'electrique'";
    }

    // Test -  ajouterAttaque  - method
    private static void testAjouterAttaque() {
        PokemonType typeFeu = new PokemonType(
                "feu",
                "Super efficace contre le type plante",
                new ArrayList<>(Arrays.asList("Eau", "Sol")),
                new ArrayList<>(Arrays.asList("Plante"))
        );

        ArrayList<Attaque> moves = new ArrayList<>();
        Pokemon charmander = new Pokemon(
                "Charmander",
                39,
                typeFeu,
                0,
                1,
                39,
                12,
                8,
                12,
                moves,
                "vivant"
        );

        // moves list empty in the beginning
        assert charmander.getMoves().isEmpty() : "La liste des attaques devrait être vide initialement";

        Attaque flameThrower = new Attaque(
                "flameThrower",
                new AttaqueType(
                        "feu",
                        "Attaque de feu intense",
                        new ArrayList<>(Arrays.asList("Plante")),
                        new ArrayList<>(Arrays.asList("Eau", "Roche"))
                ),
                15, 5, 90, 12
        );
        charmander.ajouterAttaque(flameThrower);
        // moves list must cotain the new attack created
        assert charmander.getMoves().contains(flameThrower) : "La liste des attaques devrait inclure 'flameThrower'";
    }

    // Test for the attaque method:
    private static void testAttaqueMethod() {
        PokemonType typeEau = new PokemonType(
                "eau",
                "Super efficace contre le type feu",
                new ArrayList<>(Arrays.asList("Feu")),
                new ArrayList<>(Arrays.asList("Plante"))
        );
        ArrayList<Attaque> moves = new ArrayList<>();
        Pokemon squirtle = new Pokemon(
                "Squirtle",
                44,
                typeEau,
                0,
                1,
                44,
                10,
                10,
                10,
                moves,
                "vivant"
        );

        // This call should print "Attaque pokemon" to the console.
        squirtle.attaque("RIVAL", 10);
    }
}