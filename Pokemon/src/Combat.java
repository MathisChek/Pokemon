import java.util.ArrayList;

public class Combat {
    private ArrayList<Dresseur> turn_order;
    private ArrayList<String> battle_log;

    public ArrayList<String> getBattle_log() {
        return battle_log;
    }

    public void setBattle_log(ArrayList<String> battle_log) {
        this.battle_log = battle_log;
    }

    public ArrayList<Dresseur> getTurn_order() {
        return turn_order;
    }

    public void setTurn_order(ArrayList<Dresseur> turn_order) {
        this.turn_order = turn_order;
    }

    public Combat(ArrayList<Dresseur> turn_order, ArrayList<String> battle_log) {
        this.turn_order = turn_order;
        this.battle_log = battle_log;
    }
}
