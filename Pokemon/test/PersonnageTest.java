public class PersonnageTest {
    public static void main(String[] args) {
        Personnage hero = new Personnage("TestHero") {
            @Override
            public void attaque(String cible, int dammage) {
                System.out.println("Attaque de " + this.getName() + " sur " + cible + " avec " + dammage + " points de dégâts");
            }
        };

        assert hero.getName().equals("TestHero") : "getName devrait renvoyer 'TestHero'";

        hero.setName("NewName");
        assert hero.getName().equals("NewName") : "setName devrait mettre à jour le nom à 'NewName'";

        hero.attaque("Enemy", 10);

        System.out.println("Tous les tests de Personnage sont passés.");
    }
}

