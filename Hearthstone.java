import java.util.*;
import javax.swing.*;

public class Hearthstone {
	public static void main(String[] args) {

		String redName, blueName;
		String redClass = null, blueClass = null;
		boolean redAlternateHero = false, blueAlternateHero = false;
		String redHero = null, blueHero = null;

		boolean redTurn, blueTurn;

		/////////////////////////

		Scanner keyboard = new Scanner(System.in);
		Random RNGsus = new Random();

		//Welcome message
		System.out.println("Hearthstone (Redux)\nBy Trevor Birenbaum");

		//Assigning players
		System.out.print("Red player, enter your name: ");
		redName = keyboard.nextLine();

		System.out.print("Blue player, enter your name: ");
		blueName = keyboard.nextLine();

		//Picking hero
		while(redClass == null || redClass == "Choose one") {
			String[] heroes = {
					"Choose one", 
					"Druid", 
					"Hunter", 
					"Mage", 
					"Paladin", 
					"Priest", 
					"Rogue", 
					"Shaman", 
					"Warlock", 
					"Warrior"
					};
			redClass = (String) JOptionPane.showInputDialog(null, redName + ", pick your hero", "Red hero", JOptionPane.QUESTION_MESSAGE, null, heroes, heroes[0]);

			if(redClass == null || redClass == "Choose one") {
				System.err.println("You did not pick a hero!");
			}
			else {
				if(redClass == "Hunter" || redClass == "Mage" || redClass == "Paladin" || redClass == "Warrior") {
					String alternateHeroResponse = null;
					while(alternateHeroResponse == null || alternateHeroResponse == "Choose one") {
						String[] alternateHeroResponseChoices = {
								"Choose one", 
								"Yes", 
								"No"
								};
						alternateHeroResponse = (String) JOptionPane.showInputDialog(null, redName + ", do you want to use an alternate hero?", "Red alternate hero", JOptionPane.QUESTION_MESSAGE, null, alternateHeroResponseChoices, alternateHeroResponseChoices[0]);
						
						if(alternateHeroResponse == null || alternateHeroResponse == "Choose one") {
							System.err.println("You did not pick if you want an alternate hero!");
						}
						else if(alternateHeroResponse == "Yes") {
							redAlternateHero = true;
						}
						else {
							redAlternateHero = false;
						}
					}
				}
				
				if(redClass == "Druid") {
					redHero = "Malfurion Stormrage";
				}
				else if(redClass == "Hunter") {
					if(redAlternateHero == true) {
						redHero = "Alleria Windrunner";
					}
					else {
						redHero = "Rexxar";
					}
				}
				else if(redClass == "Mage") {
					if(redAlternateHero == true) {
						redHero = "Medivh";
					}
					else {
						redHero = "Jaina Proudmoor";
					}
				}
				else if(redClass == "Paladin") {
					if(redAlternateHero == true) {
						redHero = "Lady Liadrin";
					}
					else {
						redHero = "Uther Lightbringer";
					}
				}
				else if(redClass == "Priest") {
					redHero = "Anduin Wrynn";
				}
				else if(redClass == "Rogue") {
					redHero = "Valeera Sanguinar";
				}
				else if(redClass == "Shaman") {
					redHero = "Thrall";
				}
				else if(redClass == "Warlock") {
					redHero = "Gul'dan";
				}
				else if(redClass == "Warrior") {
					if(redAlternateHero == true) {
						redHero = "Magni Bronzebeard";
					}
					else {
						redHero = "Garrosh Hellscream";
					}
				}
				
				System.out.println(redName + " has chosen " + redClass + "." + redName + " and will play as " + redHero);
			}
		}
		
		while(blueClass == null || blueClass == "Choose one") {
			String[] heroes = {
					"Choose one", 
					"Druid", 
					"Hunter", 
					"Mage", 
					"Paladin", 
					"Priest", 
					"Rogue", 
					"Shaman", 
					"Warlock", 
					"Warrior"
					};
			blueClass = (String) JOptionPane.showInputDialog(null, blueName + ", pick your hero", "Blue hero", JOptionPane.QUESTION_MESSAGE, null, heroes, heroes[0]);

			if(blueClass == null || blueClass == "Choose one") {
				System.err.println("You did not pick a hero!");
			}
			else {
				if(blueClass == "Hunter" || blueClass == "Mage" || blueClass == "Paladin" || blueClass == "Warrior") {
					String alternateHeroResponse = null;
					while(alternateHeroResponse == null || alternateHeroResponse == "Choose one") {
						String[] alternateHeroResponseChoices = {
								"Choose one", 
								"Yes", 
								"No"
								};
						alternateHeroResponse = (String) JOptionPane.showInputDialog(null, blueName + ", do you want to use an alternate hero?", "Blue alternate hero", JOptionPane.QUESTION_MESSAGE, null, alternateHeroResponseChoices, alternateHeroResponseChoices[0]);
						
						if(alternateHeroResponse == null || alternateHeroResponse == "Choose one") {
							System.err.println("You did not pick if you want an alternate hero!");
						}
						else if(alternateHeroResponse == "Yes") {
							blueAlternateHero = true;
						}
						else {
							blueAlternateHero = false;
						}
					}
				}
				
				if(blueClass == "Druid") {
					blueHero = "Malfurion Stormrage";
				}
				else if(blueClass == "Hunter") {
					if(blueAlternateHero == true) {
						blueHero = "Alleria Windrunner";
					}
					else {
						blueHero = "Rexxar";
					}
				}
				else if(blueClass == "Mage") {
					if(blueAlternateHero == true) {
						blueHero = "Medivh";
					}
					else {
						blueHero = "Jaina Proudmoor";
					}
				}
				else if(blueClass == "Paladin") {
					if(blueAlternateHero == true) {
						blueHero = "Lady Liadrin";
					}
					else {
						blueHero = "Uther Lightbringer";
					}
				}
				else if(blueClass == "Priest") {
					blueHero = "Anduin Wrynn";
				}
				else if(blueClass == "Rogue") {
					blueHero = "Valeera Sanguinar";
				}
				else if(blueClass == "Shaman") {
					blueHero = "Thrall";
				}
				else if(blueClass == "Warlock") {
					blueHero = "Gul'dan";
				}
				else if(blueClass == "Warrior") {
					if(blueAlternateHero == true) {
						blueHero = "Magni Bronzebeard";
					}
					else {
						blueHero = "Garrosh Hellscream";
					}
				}
				
				System.out.println(blueName + " has chosen " + blueClass + "." + blueName + " and will play as " + blueHero);
			}
		}
	}
}
