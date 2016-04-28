//A recreation of the game Hearthstone in Java
//Created 04/17/16 by Trevor B.
//Last updated 04/28/16

import java.util.Random;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class Hearthstone {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        Random randomizer = new Random(); // for later

        // Welcome message
        System.out.println("Hearthstone (Redux)\nBy Trevor B.\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

        // Assigning players
        Player red = new Player("Red");
        System.out.print("Red player, enter your name: ");
        red.setName(keyboard.nextLine());

        Player blue = new Player("Blue");
        System.out.print("Blue player, enter your name: ");
        blue.setName(keyboard.nextLine());

        // Picking heroes
        pickHero(red);
        pickHero(blue);
        
        //Creating decks TODO
        /*makeDeck(red);*/
        /*makeDeck(blue);*/
    }
    
    

    private static Classes chooseHero(String name, String colorClass) {
        return (Classes) JOptionPane.showInputDialog(null, name + ", pick your class", colorClass + " class",
                JOptionPane.QUESTION_MESSAGE, null, Classes.values(), "Choose One");
    }

    private static String chooseAlternateHero(Player player, String[] heroNames) {
        String alternateHeroResponse = null;
        while (alternateHeroResponse == null) {
            alternateHeroResponse = (String) JOptionPane.showInputDialog(null,
                    player.getName() + ", which hero do you want to use?", player.getColor() + " hero",
                    JOptionPane.QUESTION_MESSAGE, null, heroNames, "Choose one");

            if (alternateHeroResponse == null) {
                System.err.println(player.getName() + " did not pick a hero!");
            }
        }
        return alternateHeroResponse;
    }

    private static void pickHero(Player player) {
        while (player.getHeroClass() == null) {
            player.setHeroClass(chooseHero(player.getName(), player.getColor()));

            if (player.getHeroClass() == null) {
                System.err.println(player.getName() + " did not pick a class!");
            } else {
                if (player.getHeroClass().getHeroNames().length > 1) {
                    player.setHeroName(chooseAlternateHero(player, player.getHeroClass().getHeroNames()));
                } else {
                    player.setHeroName(player.getHeroClass().getHeroNames()[0]);
                }

                System.out.println(player.getName() + " has chosen " + player.getHeroClass().toString()
                        + " and will play as " + player.getHeroName() + ".");
            }
        }
    }
    
    private static void makeDeck(Player player) {
    	final int MAX_CARDS = 30;
    	int cardsInDeck = 0;
    	
    	while(cardsInDeck <= MAX_CARDS) {
    		
    	}
    }
}
