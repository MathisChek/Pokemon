public class ItemTest {
    public static void main(String[] args) {
        Item potion = new Item("Potion", "Healing", "Restores 20 HP", 5);

        assert potion.getName().equals("Potion") : "Expected name to be 'Potion'";
        assert potion.getType().equals("Healing") : "Expected type to be 'Healing'";
        assert potion.getEffect().equals("Restores 20 HP") : "Expected effect to be 'Restores 20 HP'";
        assert potion.getQuantity() == 5 : "Expected quantity to be 5";

        potion.setName("Super Potion");
        potion.setType("Healing");
        potion.setEffect("Restores 50 HP");
        potion.setQuantity(3);


        assert potion.getName().equals("Super Potion") : "Expected name to be 'Super Potion'";
        assert potion.getType().equals("Healing") : "Expected type to be 'Healing'";
        assert potion.getEffect().equals("Restores 50 HP") : "Expected effect to be 'Restores 50 HP'";
        assert potion.getQuantity() == 3 : "Expected quantity to be 3";

        System.out.println("Tous les tests de Item sont passés.");
    }
}
