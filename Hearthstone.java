//A recreation of the game Hearthstone in Java
//Created 04/17/16 by Trevor B.
//Last updated 04/26/16

import java.util.*;
import javax.swing.*;

public class Hearthstone {
	public static void main(String[] args) {

		String redName, blueName;
		String redClass = null, blueClass = null;
		String redHero = null, blueHero = null;

		boolean redTurn, blueTurn; //for later

		/////////////////////////

		Scanner keyboard = new Scanner(System.in);
		Random randomizer = new Random(); //for later

		//Welcome message
		System.out.println("Hearthstone (Redux)\nBy Trevor B.\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

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
			redClass = (String) JOptionPane.showInputDialog(null, redName + ", pick your class", "Red class", JOptionPane.QUESTION_MESSAGE, null, heroes, heroes[0]);

			if(redClass == null || redClass == "Choose one") {
				System.err.println(redName + " did not pick a class!");
			}
			else {
				if(redClass == "Druid") {
					redHero = "Malfurion Stormrage";
				}
				else if(redClass == "Hunter") {
					String alternateHeroResponse = null;
					while(alternateHeroResponse == null || alternateHeroResponse == "Choose one") {
						String[] alternateHeroResponseChoices = {
								"Choose one", 
								"Rexxar", 
								"Alleria Windrunner"
								};
						alternateHeroResponse = (String) JOptionPane.showInputDialog(null, redName + ", which hero do you want to use?", "Red hero", JOptionPane.QUESTION_MESSAGE, null, alternateHeroResponseChoices, alternateHeroResponseChoices[0]);
						
						if(alternateHeroResponse == null || alternateHeroResponse == "Choose one") {
							System.err.println(redName + " did not pick a hero!");
						}
						else {
							redHero = alternateHeroResponse;
						}
					}
				}
				else if(redClass == "Mage") {
					String alternateHeroResponse = null;
					while(alternateHeroResponse == null || alternateHeroResponse == "Choose one") {
						String[] alternateHeroResponseChoices = {
								"Choose one", 
								"Jaina Proudmoor", 
								"Medivh",
								"Khadgar"
								};
						alternateHeroResponse = (String) JOptionPane.showInputDialog(null, redName + ", which hero do you want to use?", "Red hero", JOptionPane.QUESTION_MESSAGE, null, alternateHeroResponseChoices, alternateHeroResponseChoices[0]);
						
						if(alternateHeroResponse == null || alternateHeroResponse == "Choose one") {
							System.err.println(redName + " did not pick a hero!");
						}
						else {
							redHero = alternateHeroResponse;
						}
					}
				}
				else if(redClass == "Paladin") {
					String alternateHeroResponse = null;
					while(alternateHeroResponse == null || alternateHeroResponse == "Choose one") {
						String[] alternateHeroResponseChoices = {
								"Choose one", 
								"Uther Lightbringer", 
								"Lady Liadrin"
								};
						alternateHeroResponse = (String) JOptionPane.showInputDialog(null, redName + ", which hero do you want to use?", "Red hero", JOptionPane.QUESTION_MESSAGE, null, alternateHeroResponseChoices, alternateHeroResponseChoices[0]);
						
						if(alternateHeroResponse == null || alternateHeroResponse == "Choose one") {
							System.err.println(redName + " did not pick a hero!");
						}
						else {
							redHero = alternateHeroResponse;
						}
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
					String alternateHeroResponse = null;
					while(alternateHeroResponse == null || alternateHeroResponse == "Choose one") {
						String[] alternateHeroResponseChoices = {
								"Choose one", 
								"Garrosh Hellscream", 
								"Magni Bronzebeard"
								};
						alternateHeroResponse = (String) JOptionPane.showInputDialog(null, redName + ", which hero do you want to use?", "Red hero", JOptionPane.QUESTION_MESSAGE, null, alternateHeroResponseChoices, alternateHeroResponseChoices[0]);
						
						if(alternateHeroResponse == null || alternateHeroResponse == "Choose one") {
							System.err.println(redName + " did not pick a hero!");
						}
						else {
							redHero = alternateHeroResponse;
						}
					}
				}
				
				System.out.println(redName + " has chosen " + redClass + " and will play as " + redHero + ".");
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
			blueClass = (String) JOptionPane.showInputDialog(null, blueName + ", pick your class", "Blue class", JOptionPane.QUESTION_MESSAGE, null, heroes, heroes[0]);

			if(blueClass == null || blueClass == "Choose one") {
				System.err.println(blueName + " did not pick a class!");
			}
			else {
				if(blueClass == "Druid") {
					blueHero = "Malfurion Stormrage";
				}
				else if(blueClass == "Hunter") {
					String alternateHeroResponse = null;
					while(alternateHeroResponse == null || alternateHeroResponse == "Choose one") {
						String[] alternateHeroResponseChoices = {
								"Choose one", 
								"Rexxar", 
								"Alleria Windrunner"
								};
						alternateHeroResponse = (String) JOptionPane.showInputDialog(null, blueName + ", which hero do you want to use?", "Blue hero", JOptionPane.QUESTION_MESSAGE, null, alternateHeroResponseChoices, alternateHeroResponseChoices[0]);
						
						if(alternateHeroResponse == null || alternateHeroResponse == "Choose one") {
							System.err.println(blueName + " did not pick a hero!");
						}
						else {
							blueHero = alternateHeroResponse;
						}
					}
				}
				else if(blueClass == "Mage") {
					String alternateHeroResponse = null;
					while(alternateHeroResponse == null || alternateHeroResponse == "Choose one") {
						String[] alternateHeroResponseChoices = {
								"Choose one", 
								"Jaina Proudmoor", 
								"Medivh",
								"Khadgar"
								};
						alternateHeroResponse = (String) JOptionPane.showInputDialog(null, blueName + ", which hero do you want to use?", "Blue hero", JOptionPane.QUESTION_MESSAGE, null, alternateHeroResponseChoices, alternateHeroResponseChoices[0]);
						
						if(alternateHeroResponse == null || alternateHeroResponse == "Choose one") {
							System.err.println(blueName + " did not pick a hero!");
						}
						else {
							blueHero = alternateHeroResponse;
						}
					}
				}
				else if(blueClass == "Paladin") {
					String alternateHeroResponse = null;
					while(alternateHeroResponse == null || alternateHeroResponse == "Choose one") {
						String[] alternateHeroResponseChoices = {
								"Choose one", 
								"Uther Lightbringer", 
								"Lady Liadrin"
								};
						alternateHeroResponse = (String) JOptionPane.showInputDialog(null, blueName + ", which hero do you want to use?", "Blue hero", JOptionPane.QUESTION_MESSAGE, null, alternateHeroResponseChoices, alternateHeroResponseChoices[0]);
						
						if(alternateHeroResponse == null || alternateHeroResponse == "Choose one") {
							System.err.println(blueName + " did not pick a hero!");
						}
						else {
							blueHero = alternateHeroResponse;
						}
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
					String alternateHeroResponse = null;
					while(alternateHeroResponse == null || alternateHeroResponse == "Choose one") {
						String[] alternateHeroResponseChoices = {
								"Choose one", 
								"Garrosh Hellscream", 
								"Magni Bronzebeard"
								};
						alternateHeroResponse = (String) JOptionPane.showInputDialog(null, blueName + ", which hero do you want to use?", "Blue hero", JOptionPane.QUESTION_MESSAGE, null, alternateHeroResponseChoices, alternateHeroResponseChoices[0]);
						
						if(alternateHeroResponse == null || alternateHeroResponse == "Choose one") {
							System.err.println(blueName + " did not pick a hero!");
						}
						else {
							blueHero = alternateHeroResponse;
						}
					}
				}
				
				System.out.println(blueName + " has chosen " + blueClass + " and will play as " + blueHero + ".");
			}
		}
	}
}
