import java.util.ArrayList;
import java.util.Arrays;

public class AttaqueTest {
    public static void main(String[] args) {
        AttaqueType fireType = new AttaqueType(
                "Feu",
                "Inflige des dégâts de brûlure",
                new ArrayList<>(Arrays.asList("Eau", "Sol")),
                new ArrayList<>(Arrays.asList("Plante", "Glace"))
        );

        Attaque flameThrower = new Attaque(
                "FlameThrower",
                fireType,
                90,
                15,
                100,
                10
        );

        // Test getters.
        assert flameThrower.getName().equals("FlameThrower") : "Le nom doit être 'FlameThrower'";
        assert flameThrower.getType().equals(fireType) : "Le type doit correspondre à fireType";
        assert flameThrower.getDamage() == 90 : "La valeur de damage doit être 90";
        assert flameThrower.getCriticalChance() == 15 : "La criticalChance doit être 15";
        assert flameThrower.getAccuracy() == 100 : "L'accuracy doit être 100";
        assert flameThrower.getPower_points() == 10 : "Les power_points doivent être 10";

        // Test the toString method.
        String str = flameThrower.toString();
        assert str.contains("FlameThrower") : "toString doit contenir 'FlameThrower'";
        assert str.contains("Feu") : "toString doit contenir 'Feu' (le nom de type)";
        assert str.contains("90") : "toString doit contenir '90' (damage)";
        assert str.contains("15") : "toString doit contenir '15' (criticalChance)";
        assert str.contains("100") : "toString doit contenir '100' (accuracy)";
        assert str.contains("10") : "toString doit contenir '10' (power_points)";

        System.out.println("Tous les tests de Attaque et AttaqueType sont passés.");
    }
}
