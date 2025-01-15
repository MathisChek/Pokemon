import jdk.jfr.Percentage;

public class


Attaque {
    private String name;
    private AttaqueType type;
    private int damage;
    private int criticalChance;
    private int accuracy;
    private int power_points;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public AttaqueType getType() {
        return type;
    }

    public void setType(AttaqueType type) {
        this.type = type;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getCriticalChance() {
        return criticalChance;
    }

    public void setCriticalChance(int criticalChance) {
        this.criticalChance = criticalChance;
    }

    public int getAccuracy() {
        return accuracy;
    }

    public void setAccuracy(int accuracy) {
        this.accuracy = accuracy;
    }

    public int getPower_points() {
        return power_points;
    }

    public void setPower_points(int power_points) {
        this.power_points = power_points;
    }

    @Override
    public String toString() {
        return "Attaque{" +
                "name='" + name + '\'' +
                ", type=" + type +
                ", damage=" + damage +
                ", criticalChance=" + criticalChance +
                ", accuracy=" + accuracy +
                ", power_points=" + power_points +
                '}';
    }

    public Attaque(String name, AttaqueType type, int damage, int criticalChance, int accuracy, int power_points) {
        this.name = name;
        this.type = type;
        this.damage = damage;
        this.criticalChance = criticalChance;
        this.accuracy = accuracy;
        this.power_points = power_points;
    }
}
