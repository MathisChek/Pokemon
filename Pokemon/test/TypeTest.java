import java.util.ArrayList;
import java.util.Arrays;

public class TypeTest {
    public static void main(String[] args) {
        Type testType = new Type(
                "Feu",
                "Inflige des dégâts de brûlure",
                new ArrayList<>(Arrays.asList("Eau", "Sol")),
                new ArrayList<>(Arrays.asList("Plante", "Glace"))
        ) {
        };

        // Test getters for the initial values.
        assert testType.getName().equals("Feu") : "Le nom initial doit être 'Feu'";
        assert testType.getEffect().equals("Inflige des dégâts de brûlure") : "L'effet initial doit être 'Inflige des dégâts de brûlure'";
        assert testType.getWeaknesses().equals(new ArrayList<>(Arrays.asList("Eau", "Sol"))) : "Les faiblesses initiales doivent être [Eau, Sol]";
        assert testType.getStrengths().equals(new ArrayList<>(Arrays.asList("Plante", "Glace"))) : "Les forces initiales doivent être [Plante, Glace]";

        // Test setters: update values and then check them again.
        testType.setName("Eau");
        testType.setEffect("Super efficace contre le type feu");
        testType.setWeaknesses(new ArrayList<>(Arrays.asList("Électrique", "Plante")));
        testType.setStrengths(new ArrayList<>(Arrays.asList("Feu", "Sol")));

        assert testType.getName().equals("Eau") : "Le nom après mise à jour doit être 'Eau'";
        assert testType.getEffect().equals("Super efficace contre le type feu") : "L'effet après mise à jour doit être 'Super efficace contre le type feu'";
        assert testType.getWeaknesses().equals(new ArrayList<>(Arrays.asList("Électrique", "Plante"))) : "Les faiblesses après mise à jour doivent être [Électrique, Plante]";
        assert testType.getStrengths().equals(new ArrayList<>(Arrays.asList("Feu", "Sol"))) : "Les forces après mise à jour doivent être [Feu, Sol]";

        // Test the toString method.
        String stringRep = testType.toString();
        assert stringRep.contains("Eau") : "La représentation en chaîne doit contenir 'Eau'";
        assert stringRep.contains("Super efficace contre le type feu") : "La représentation en chaîne doit contenir 'Super efficace contre le type feu'";
        assert stringRep.contains("Électrique") : "La représentation en chaîne doit contenir 'Électrique'";
        assert stringRep.contains("Feu") : "La représentation en chaîne doit contenir 'Feu' (pour les forces)";

        System.out.println("Tous les tests de Type sont passés.");
    }
}
