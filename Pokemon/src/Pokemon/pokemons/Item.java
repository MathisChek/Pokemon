package Pokemon.pokemons;

public class Item {
    private String name;
    private String type;
    private String effect;
    private int quantity;

    public Item(String name, String type, String effect, int quantity) {
        this.name = name;
        this.type = type;
        this.effect = effect;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getEffect() {
        return effect;
    }

    public void setEffect(String effect) {
        this.effect = effect;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
