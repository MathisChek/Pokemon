import java.util.ArrayList;
import java.util.Arrays;

public class CombatTest {
    public static void main(String[] args) {
        Dresseur trainer1 = new Dresseur("Ash", new ArrayList<>(), 1000, 0, new ArrayList<>(), 5) ;
        Dresseur trainer2 = new Dresseur("Misty", new ArrayList<>(), 800, 1, new ArrayList<>(), 7) ;

        ArrayList<Dresseur> turnOrder = new ArrayList<>(Arrays.asList(trainer1, trainer2));
        ArrayList<String> battleLog = new ArrayList<>(Arrays.asList("Combat commencé", "Ash attaque Misty"));

        Combat combat = new Combat(turnOrder, battleLog);

        assert combat.getTurn_order().equals(turnOrder) : "La liste turn_order initiale ne correspond pas";

        assert combat.getBattle_log().equals(battleLog) : "La battle_log initiale ne correspond pas";

        Dresseur trainer3 = new Dresseur("Brock", new ArrayList<>(), 500, 2, new ArrayList<>(), 3);
        ArrayList<Dresseur> newTurnOrder = new ArrayList<>(Arrays.asList(trainer3));
        combat.setTurn_order(newTurnOrder);
        assert combat.getTurn_order().equals(newTurnOrder) : "La nouvelle liste turn_order ne correspond pas";

        ArrayList<String> newBattleLog = new ArrayList<>(Arrays.asList("Nouveau combat commencé"));
        combat.setBattle_log(newBattleLog);
        assert combat.getBattle_log().equals(newBattleLog) : "La nouvelle battle_log ne correspond pas";

        System.out.println("Tous les tests de Combat sont passés.");
    }
}