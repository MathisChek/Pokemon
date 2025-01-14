import java.util.ArrayList;

public abstract class Type {
    private String name;
    private String effect;
    private ArrayList<String> weaknesses;
    private ArrayList<String> strengths;

    public Type(String name, String effect, ArrayList<String> weaknesses, ArrayList<String> strengths) {
        this.name = name;
        this.effect = effect;
        this.weaknesses = weaknesses;
        this.strengths = strengths;
    }

    @Override
    public String toString() {
        return "Type{" +
                "name='" + name + '\'' +
                ", effect='" + effect + '\'' +
                ", weaknesses=" + weaknesses +
                ", strengths=" + strengths +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEffect() {
        return effect;
    }

    public void setEffect(String effect) {
        this.effect = effect;
    }

    public ArrayList<String> getWeaknesses() {
        return weaknesses;
    }

    public void setWeaknesses(ArrayList<String> weaknesses) {
        this.weaknesses = weaknesses;
    }

    public ArrayList<String> getStrengths() {
        return strengths;
    }

    public void setStrengths(ArrayList<String> strengths) {
        this.strengths = strengths;
    }
}
