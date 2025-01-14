public abstract class Personnage {
    private String name;

    public Personnage(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract void attaque(String cible, int dammage);
}