package com.cours.main;

import com.cours.entities.Personne;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class MainDao {

    public static void main(String[] args) {
    }

    /**
     * Méthode qui init 20 personnes
     *
     * @return Une liste de 20 personnes
     */
    public static List<Personne> initPersonnes() {
        List<Personne> ret;
        int nbPersons;
        int idx;

        ret = new ArrayList<>();
        idx = 0;
        nbPersons = 20;

        while (idx < nbPersons) {
            ret.add(idx, randomPerson(idx + 1));

            idx++;
        }

        return ret;
    }

    /**
     * Méthode qui trie une liste de personnes par prénom croissant
     *
     * @param liste La liste à trier
     * @return La liste triée par prénom croissant
     */
    public List<Personne> sortByFirstNameAsc(List<Personne> liste) {
        return null;
    }

    /**
     * Méthode qui trie une liste de personnes par prénom décroissant
     *
     * @param liste La liste à trier
     * @return La liste triée par prénom décroissant
     */
    public List<Personne> sortByFirstNameDesc(List<Personne> liste) {
        return null;
    }

    /**
     * Méthode qui trie une liste de personnes par nom croissant
     *
     * @param liste La liste à trier
     * @return La liste triée par nom croissant
     */
    public List<Personne> sortByLastNameAsc(List<Personne> liste) {
        return null;
    }

    /**
     * Méthode qui trie une liste de personnes par nom décroissant
     *
     * @param liste La liste à trier
     * @return La liste triée par nom décroissant
     */
    public List<Personne> sortByLastNameDesc(List<Personne> liste) {
        return null;
    }

    private static Personne randomPerson(int id) {
        Personne ret;
        String street;
        String city;
        double weight;
        double height;
        int zipCode;
        String name;
        String lastName;

        street = randomString(8);
        city = randomString(7);
        name = randomString(8);
        lastName = randomString(8);
        weight = randomDouble(50, 120);
        height = randomDouble(160, 200);
        zipCode = randomInt(300, 800);

        ret = new Personne(id, name, lastName, weight, height, city, street, zipCode);

        return ret;
    }

    private static String randomString(int size) {
        int idx;
        String ret;

        ret = "";
        idx = 0;

        while (idx < size) {
            ret += randomCharacter();
            idx++;
        }

        return ret;
    }

    private static char randomCharacter() {
        char c;

        c = Character.forDigit(ThreadLocalRandom.current().nextInt(65, 91) - 25, 10);

        return c;
    }

    private static double randomDouble(double min, double max) {
        return ThreadLocalRandom.current().nextDouble(min, max + 1);
    }

    private static int randomInt(int min, int max) {
        return ThreadLocalRandom.current().nextInt(min, max + 1);
    }

}