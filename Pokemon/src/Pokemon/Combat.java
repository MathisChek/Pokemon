package Pokemon;

import Pokemon.pokemons.Dresseur;
import Pokemon.pokemons.Pokemon;
import Pokemon.pokemons.PokemonPrinter;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

import static java.lang.Thread.sleep;

public class Combat {
    private static int index = 0;

    private ArrayList<Dresseur> dresseurs;
    private ArrayList<String> battle_log;

    public ArrayList<String> getBattle_log() {
        return battle_log;
    }

    public void setBattle_log(ArrayList<String> battle_log) {
        this.battle_log = battle_log;
    }

    public ArrayList<Dresseur> getDresseurs() {
        return dresseurs;
    }

    public void setDresseurs(ArrayList<Dresseur> turn_order) {
        this.dresseurs = turn_order;
    }

    public Combat(ArrayList<Dresseur> turn_order, ArrayList<String> battle_log) {
        this.dresseurs = turn_order;
        this.battle_log = battle_log;
    }

    @Override
    public String toString() {
        return "Pokemon.Combat{" +
                "Dresseurs=" + dresseurs +
                ", battle_log=" + battle_log +
                '}';
    }

    public void userPokemonStatus(Dresseur dresseur, Pokemon pokemon){
        Pokemon dresseur1Pokemon = dresseur.getCurrentPokemon();

        if (dresseur1Pokemon.getCurrentPV() <= 0) { dresseur1Pokemon.setKo(true); }
        if (dresseur1Pokemon.getKo()) {
            dresseur.changePokemon();
            System.out.println(dresseur.getName() + " envoie : " + dresseur.getCurrentPokemon().getName());
            PokemonPrinter.printPokemon(dresseur.getCurrentPokemon().getName());
        }
    }

    public void ordiPokemonStatus(Dresseur dresseur, Pokemon pokemon, Pokemon pokemon1) {
        if (index < dresseur.getPokemons().size()) {
            if (pokemon.getCurrentPV() <= 0) {
                pokemon.setKo(true);
                if (index+1 < dresseur.getPokemons().size()) { dresseur.setCurrentPokemon(dresseur.getPokemons().get(index+1)); }
                index++;
                System.out.println(pokemon.getName() + " est ko");
                pokemon1.gagneXP(pokemon);
                if (dresseur.pokemonsKo()) {return ;}
                System.out.println(dresseur.getName() + " envoie : " + dresseur.getCurrentPokemon().getName() + "\n");
                PokemonPrinter.printPokemon(dresseur.getCurrentPokemon().getName());

            }
        } else {
            return;
        }
    }

    public void startCombat(Dresseur dresseur1, Dresseur dresseur2) throws InterruptedException {
        Pokemon dresseur1Pokemon = dresseur1.getCurrentPokemon();
        Pokemon dresseur2Pokemon = dresseur2.getCurrentPokemon();
        System.out.println("Dresseur " + dresseur2.getName() + " te défis en duel !");
        PokemonPrinter.printPokemon(dresseur2.getName());

        sleep(1000);

        System.out.println("Dresseur " + dresseur2.getName() + " envoie : " + dresseur2.getPokemons().get(0).getName());
        PokemonPrinter.printPokemon(dresseur2.getPokemons().get(0).getName());
        sleep(1000);

        System.out.println("Dresseur " + dresseur1.getName() + " envoie : " + dresseur1.getCurrentPokemon().getName() + "\n");
        PokemonPrinter.printPokemon(dresseur1.getPokemons().get(0).getName());

        sleep(1000);

        int nbTour = 1;
        int y = 0; //nb attaque disponible
        int x = 1; //index des pokemons de l'ordi
        while (!dresseur1.pokemonsKo() && !dresseur2.pokemonsKo()) {

            //Dresseur 1 attaque
            if (nbTour > 1) {System.out.println("\nYour turn : ");}
            System.out.println("Choisi ton attaque : ");
            while (y <= dresseur1Pokemon.getMoves().size()-1) {
                System.out.println(y + " - " + dresseur1Pokemon.getMoves().get(y).getName());
                y++;
            }
            y = 0;

            Scanner scanner = new Scanner(System.in);
            int dresseur1choice = -1;
            boolean validChoice = false;

            // Demander à l'utilisateur un choix valide
            while (!validChoice) {
                try {
                    System.out.print("Veuillez entrer un choix \uD83D\uDD3D ");
                    dresseur1choice = scanner.nextInt();

                    // Vérification si l'index est valide
                    if (dresseur1choice >= 0 && dresseur1choice < dresseur1Pokemon.getMoves().size()) {
                        validChoice = true; // Choix valide, sortir de la boucle
                    } else {
                        System.out.println("Choix invalide. Veuillez entrer un nombre entre 0 et " + (dresseur1Pokemon.getMoves().size() - 1));
                    }
                } catch (InputMismatchException e) {
                    System.out.println("Entrée invalide. Veuillez entrer un nombre.");
                    scanner.next(); // Consommer l'entrée incorrecte
                }
            }

            // Vérification du résultat
            if (dresseur1Pokemon.getSpeed() > dresseur2Pokemon.getSpeed()) {
                dresseur1Pokemon.attaquer(dresseur2Pokemon, dresseur1.getCurrentPokemon().getMoves().get(dresseur1choice));
                System.out.println("\nLes pv de " + dresseur2Pokemon.getName() + " sont maintenant de : " + dresseur2Pokemon.getCurrentPV());
                sleep(1000);

                ordiPokemonStatus(dresseur2, dresseur2Pokemon, dresseur1Pokemon);
                dresseur2Pokemon = dresseur2.getCurrentPokemon();
                if (dresseur1.pokemonsKo() || dresseur2.pokemonsKo()) { break; }

                Random random = new Random();
                int randomInt = random.nextInt(dresseur2Pokemon.getMoves().size());
                dresseur2Pokemon.attaquer(dresseur1Pokemon, dresseur2Pokemon.getMoves().get(randomInt));
                System.out.println("\nLes pv de " + dresseur1Pokemon.getName() + " sont maintenant de : " + dresseur1Pokemon.getCurrentPV());
                sleep(1000);

                userPokemonStatus(dresseur1, dresseur1Pokemon);
                dresseur1Pokemon = dresseur1.getCurrentPokemon();
                if (dresseur1.pokemonsKo() || dresseur2.pokemonsKo()) { break; }

            } else if (dresseur1Pokemon.getSpeed() < dresseur2Pokemon.getSpeed()) {
                Random random = new Random();
                int randomInt = random.nextInt(dresseur2Pokemon.getMoves().size());
                dresseur2Pokemon.attaquer(dresseur1Pokemon, dresseur2Pokemon.getMoves().get(randomInt));
                System.out.println("\nLes pv de " + dresseur1Pokemon.getName() + " sont maintenant de : " + dresseur1Pokemon.getCurrentPV());
                sleep(1000);

                userPokemonStatus(dresseur1, dresseur1Pokemon);
                dresseur1Pokemon = dresseur1.getCurrentPokemon();
                if (dresseur1.pokemonsKo() || dresseur2.pokemonsKo()) { break; }

                dresseur1Pokemon.attaquer(dresseur2Pokemon, dresseur1.getCurrentPokemon().getMoves().get(dresseur1choice));
                System.out.println("\nLes pv de " + dresseur2Pokemon.getName() + " sont maintenant de : " + dresseur2Pokemon.getCurrentPV());
                sleep(1000);

                ordiPokemonStatus(dresseur2, dresseur2Pokemon, dresseur1Pokemon);
                dresseur2Pokemon = dresseur2.getCurrentPokemon();
                if (dresseur1.pokemonsKo() || dresseur2.pokemonsKo()) { break; }

            } else {
                dresseur1Pokemon.attaquer(dresseur2Pokemon, dresseur1.getCurrentPokemon().getMoves().get(dresseur1choice));
                System.out.println("\nLes pv de " + dresseur2Pokemon.getName() + " sont maintenant de : " + dresseur2Pokemon.getCurrentPV());
                sleep(1000);

                ordiPokemonStatus(dresseur2, dresseur2Pokemon, dresseur1Pokemon);
                dresseur2Pokemon = dresseur2.getCurrentPokemon();
                if (dresseur1.pokemonsKo() || dresseur2.pokemonsKo()) { break; }

                Random random = new Random();
                int randomInt = random.nextInt(dresseur2Pokemon.getMoves().size());
                dresseur2Pokemon.attaquer(dresseur1Pokemon, dresseur2Pokemon.getMoves().get(randomInt));
                System.out.println("\nLes pv de " + dresseur1Pokemon.getName() + " sont maintenant de : " + dresseur1Pokemon.getCurrentPV());
                sleep(1000);

                userPokemonStatus(dresseur1, dresseur1Pokemon);
                dresseur1Pokemon = dresseur1.getCurrentPokemon();
                if (dresseur1.pokemonsKo() || dresseur2.pokemonsKo()) { break; }

            }
            nbTour++;
        }

        if (dresseur1.pokemonsKo()) {
            System.out.println(dresseur2.getName() + " t'as vaincue ! La team rocket s'envole");
            PokemonPrinter.printPokemon(dresseur2.getName());

            dresseur1.setDefeates(+1);
        } else if (dresseur2.pokemonsKo()) {
            System.out.println("Tu as vaincu dresseur : " + dresseur2.getName() + " !");
            PokemonPrinter.printPokemon(dresseur1.getName());

            System.out.println("Tu as obtenu le badge ciel !");
            PokemonPrinter.printPokemon("Badge");

            dresseur1.setVictories(+1);
        }
    }

}
