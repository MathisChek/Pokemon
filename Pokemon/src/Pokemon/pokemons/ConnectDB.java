package Pokemon.pokemons;

//import com.mongodb.client.MongoClient;
//import com.mongodb.client.MongoClients;
//import com.mongodb.client.MongoCollection;
//import com.mongodb.client.MongoDatabase;
//import org.bson.Document;

import java.util.Arrays;

public class ConnectDB {
    public void connectDB() {
//        String uri = "mongodb+srv://mathischekraouimc:Yamakasi99@cluster0.xmglm.mongodb.net/?retryWrites=true&w=majority&appName=Cluster0";
//        try (MongoClient mongoClient = MongoClients.create(uri)) {
//            MongoDatabase db = mongoClient.getDatabase("PokemonDB");
//
//            // 1. Ajouter la collection Type
//            MongoCollection<Document> typeCollection = db.getCollection("Type");
//
//            Document typeElectrique = new Document("name", "Électrique")
//                    .append("weaknesses", Arrays.asList("Sol"))
//                    .append("strengths", Arrays.asList("Eau", "Vol"));
//            Document typeFeu = new Document("name", "Feu")
//                    .append("weaknesses", Arrays.asList("Eau", "Roche"))
//                    .append("strengths", Arrays.asList("Plante", "Insecte"));
//            Document typeEau = new Document("name", "Eau")
//                    .append("weaknesses", Arrays.asList("Plante", "Électrique"))
//                    .append("strengths", Arrays.asList("Feu", "Roche"));
//            Document typeNormal = new Document("name", "Normal")
//                    .append("weaknesses", Arrays.asList("Combat"))
//                    .append("strengths", Arrays.asList());
//            Document typePlante = new Document("name", "Plante")
//                    .append("weaknesses", Arrays.asList("Feu", "Insecte", "Vol"))
//                    .append("strengths", Arrays.asList("Eau", "Roche"));
//
//            typeCollection.insertMany(Arrays.asList(typeElectrique, typeFeu, typeEau, typeNormal, typePlante));
//
//            // 2. Ajouter la collection Attaque
//            MongoCollection<Document> attaqueCollection = db.getCollection("Attaque");
//
//            Document attaqueFoudre = new Document("name", "Foudre")
//                    .append("type", "Électrique")
//                    .append("damage", 90)
//                    .append("accuracy", 100)
//                    .append("power_point", 15);
//            Document attaqueLanceFlammes = new Document("name", "Lance-Flammes")
//                    .append("type", "Feu")
//                    .append("damage", 90)
//                    .append("accuracy", 100)
//                    .append("power_point", 15);
//            Document attaquePistoletEau = new Document("name", "Pistolet à Eau")
//                    .append("type", "Eau")
//                    .append("damage", 40)
//                    .append("accuracy", 100)
//                    .append("power_point", 25);
//            Document attaqueCharge = new Document("name", "Charge")
//                    .append("type", "Normal")
//                    .append("damage", 50)
//                    .append("accuracy", 100)
//                    .append("power_point", 35);
//
//            attaqueCollection.insertMany(Arrays.asList(attaqueFoudre, attaqueLanceFlammes, attaquePistoletEau, attaqueCharge));
//
//            // 3. Ajouter la collection Pokemon
//            MongoCollection<Document> pokemonCollection = db.getCollection("Pokemon");
//
//            Document pikachu = new Document("name", "Pikachu")
//                    .append("currentPV", 35)
//                    .append("type", "Électrique")
//                    .append("level", 10)
//                    .append("exp", 1200)
//                    .append("maxPV", 35)
//                    .append("attaque", 55)
//                    .append("defense", 40)
//                    .append("speed", 90)
//                    .append("moves", Arrays.asList("Foudre", "Charge"))
//                    .append("ko", false);
//
//            Document pichu = new Document("name", "Pichu")
//                    .append("currentPV", 20)
//                    .append("type", "Électrique")
//                    .append("level", 5)
//                    .append("exp", 600)
//                    .append("maxPV", 20)
//                    .append("attaque", 40)
//                    .append("defense", 30)
//                    .append("speed", 50)
//                    .append("moves", Arrays.asList("Foudre"))
//                    .append("ko", false);
//
//            Document salameche = new Document("name", "Salamèche")
//                    .append("currentPV", 39)
//                    .append("type", "Feu")
//                    .append("level", 12)
//                    .append("exp", 1500)
//                    .append("maxPV", 39)
//                    .append("attaque", 52)
//                    .append("defense", 43)
//                    .append("speed", 65)
//                    .append("moves", Arrays.asList("Lance-Flammes", "Charge"))
//                    .append("ko", false);
//
//            Document carapuce = new Document("name", "Carapuce")
//                    .append("currentPV", 44)
//                    .append("type", "Eau")
//                    .append("level", 10)
//                    .append("exp", 1300)
//                    .append("maxPV", 44)
//                    .append("attaque", 48)
//                    .append("defense", 65)
//                    .append("speed", 43)
//                    .append("moves", Arrays.asList("Pistolet à Eau", "Charge"))
//                    .append("ko", false);
//
//            Document electek = new Document("name", "Électek")
//                    .append("currentPV", 65)
//                    .append("type", "Électrique")
//                    .append("level", 25)
//                    .append("exp", 3000)
//                    .append("maxPV", 65)
//                    .append("attaque", 83)
//                    .append("defense", 57)
//                    .append("speed", 105)
//                    .append("moves", Arrays.asList("Foudre", "Charge"))
//                    .append("ko", false);
//
//            Document rondoudou = new Document("name", "Rondoudou")
//                    .append("currentPV", 115)
//                    .append("type", "Normal")
//                    .append("level", 15)
//                    .append("exp", 2000)
//                    .append("maxPV", 115)
//                    .append("attaque", 45)
//                    .append("defense", 20)
//                    .append("speed", 20)
//                    .append("moves", Arrays.asList("Charge"))
//                    .append("ko", false);
//
//            Document tortank = new Document("name", "Tortank")
//                    .append("currentPV", 79)
//                    .append("type", "Eau")
//                    .append("level", 36)
//                    .append("exp", 6000)
//                    .append("maxPV", 79)
//                    .append("attaque", 85)
//                    .append("defense", 100)
//                    .append("speed", 78)
//                    .append("moves", Arrays.asList("Pistolet à Eau"))
//                    .append("ko", false);
//
//            Document raichu = new Document("name", "Raichu")
//                    .append("currentPV", 60)
//                    .append("type", "Électrique")
//                    .append("level", 20)
//                    .append("exp", 2500)
//                    .append("maxPV", 60)
//                    .append("attaque", 90)
//                    .append("defense", 55)
//                    .append("speed", 110)
//                    .append("moves", Arrays.asList("Foudre"))
//                    .append("ko", false);
//
//            Document herbizarre = new Document("name", "Herbizarre")
//                    .append("currentPV", 60)
//                    .append("type", "Plante")
//                    .append("level", 20)
//                    .append("exp", 2400)
//                    .append("maxPV", 60)
//                    .append("attaque", 62)
//                    .append("defense", 63)
//                    .append("speed", 60)
//                    .append("moves", Arrays.asList("Charge"))
//                    .append("ko", false);
//
//            Document mrMime = new Document("name", "Mr. Mime")
//                    .append("currentPV", 40)
//                    .append("type", "Normal")
//                    .append("level", 18)
//                    .append("exp", 2000)
//                    .append("maxPV", 40)
//                    .append("attaque", 45)
//                    .append("defense", 65)
//                    .append("speed", 90)
//                    .append("moves", Arrays.asList("Charge"))
//                    .append("ko", false);
//
//            Document dracofeu = new Document("name", "Dracaufeu")
//                    .append("currentPV", 78)
//                    .append("type", "Feu")
//                    .append("level", 36)
//                    .append("exp", 6000)
//                    .append("maxPV", 78)
//                    .append("attaque", 84)
//                    .append("defense", 78)
//                    .append("speed", 100)
//                    .append("moves", Arrays.asList("Lance-Flammes"))
//                    .append("ko", false);
//
//            Document rozbouton = new Document("name", "Rozbouton")
//                    .append("currentPV", 50)
//                    .append("type", "Plante")
//                    .append("level", 5)
//                    .append("exp", 500)
//                    .append("maxPV", 50)
//                    .append("attaque", 40)
//                    .append("defense", 30)
//                    .append("speed", 35)
//                    .append("moves", Arrays.asList("Charge"))
//                    .append("ko", false);
//
//            pokemonCollection.insertMany(Arrays.asList(
//                    pikachu, pichu, salameche, carapuce, electek, rondoudou, tortank,
//                    raichu, herbizarre, mrMime, dracofeu, rozbouton
//            ));
//
//            System.out.println("Données insérées avec succès !");
//        }
    }
}
