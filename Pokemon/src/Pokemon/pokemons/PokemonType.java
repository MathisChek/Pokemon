package Pokemon.pokemons;

import com.mongodb.client.MongoCollection;
import org.bson.Document;

import java.util.ArrayList;
import java.util.List;

public class PokemonType extends Type {
    public PokemonType(String name, ArrayList<String> weaknesses, ArrayList<String> strengths) {
        super(name, weaknesses, strengths);
    }

    public static PokemonType fromDocument(Document document) {
        String name = document.getString("name");
        List<String> strengths = (List<String>) document.get("strengths");
        List<String> weaknesses = (List<String>) document.get("weaknesses");

        return new PokemonType(name, strengths, weaknesses);
    }

    public static PokemonType fromName(String name, MongoCollection<Document> typeCollection) {
        // Rechercher le type dans la collection PokemonType
        Document typeDoc = typeCollection.find(new Document("name", name)).first();
        if (typeDoc != null) {
            return fromDocument(typeDoc); // Convertir le document en objet PokemonType
        }
        throw new IllegalArgumentException("Type inconnu : " + name);
    }
}
