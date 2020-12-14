package teste;

import java.util.Scanner;

import javax.swing.JOptionPane;

import character.sheet.data.Ambusher;
import character.sheet.data.Android;
import character.sheet.data.Atributes;
import character.sheet.data.CharacterClass;
import character.sheet.data.Hacker;
import character.sheet.data.Human;
import character.sheet.data.Medic;
import character.sheet.data.Mercenary;
import character.sheet.data.Player;
import character.sheet.data.Race;
import character.sheet.data.Replicant;
import character.sheet.data.Sniper;

public class CharacterRegister {

	@SuppressWarnings("unused")
	public static void main(String[] args) throws NullPointerException{

		ListaDePlayers ldp = new ListaDePlayers();

		loop: for (;;) {

			Scanner sc = new Scanner(System.in);

			String menu = String.format("1 - Cadastrar novo player \n2 - Encerrar sistema");
			int sel;
			for (;;) {
				sel = Integer.parseInt(JOptionPane.showInputDialog(menu));
				if (sel == 1 || sel == 2 || sel == 0) {
					break;
				} else {
					JOptionPane.showMessageDialog(null, "Digite opcao valida");
				}
			}

			switch (sel) {

			case 1:
				Player player = new Player(null, null, null, null, null, 1, 0, null, 0, 0);
				Atributes atributes = new Atributes(0, 0, 0, 0, 0, 0);
				ldp.registerPlayer(player);
				String menu2 = String.format("1 - HACKER \n2 - MEDIC\n3 - MERCENARY\n4 - SNIPER\n5 - AMBUSHER");
				int choice2;
				for (;;) {
					choice2 = Integer.parseInt(JOptionPane.showInputDialog(menu2));
					if (choice2 == 1) {
						Hacker hacker = new Hacker();
						player.setClasse(hacker);
						break;
					}
					if (choice2 == 2) {
						Medic medic = new Medic();
						player.setClasse(medic);
						break;
					}
					if (choice2 == 3) {
						Mercenary merc = new Mercenary();
						player.setClasse(merc);
						break;
					}
					if (choice2 == 4) {
						Sniper sniper = new Sniper();
						player.setClasse(sniper);
						break;
					}
					if (choice2 == 5) {
						Ambusher ambusher = new Ambusher();
						player.setClasse(ambusher);
						break;
					} else {
						JOptionPane.showMessageDialog(null, "Digite opcao valida");
					}
				}

				String menu3 = String.format("1 - HUMAN\n2 - REPLICANT\n3 - ANDROID");
				int choice3;
				for (;;) {
					choice2 = Integer.parseInt(JOptionPane.showInputDialog(menu3));
					if (choice2 == 1) {
						Human human = new Human();
						player.setRace(human);

						break;
					}
					if (choice2 == 2) {
						Replicant rep = new Replicant();
						player.setRace(rep);
						break;
					}
					if (choice2 == 3) {
						Android android = new Android();
						player.setRace(android);
						break;
					} else {
						JOptionPane.showMessageDialog(null, "Digite opcao valida");
					}
				}
				player.setAtributes(atributes);
				String playerName = JOptionPane.showInputDialog("Player name");
				player.setPlayerName(playerName);
				String charName = JOptionPane.showInputDialog("Character name");
				player.setCharacterName(charName);
				String origin = JOptionPane.showInputDialog("Origin");
				player.setOrigin(origin);
				int str = Integer.parseInt(JOptionPane.showInputDialog("Strenght"));
				atributes.setStr(str);
				int dex = Integer.parseInt(JOptionPane.showInputDialog("Dexterity"));
				atributes.setDex(dex);
				int con = Integer.parseInt(JOptionPane.showInputDialog("Constitution"));
				atributes.setCon(con);
				int intel = Integer.parseInt(JOptionPane.showInputDialog("Intelligence"));
				atributes.setIntel(intel);
				int tech = Integer.parseInt(JOptionPane.showInputDialog("Techlonogy"));
				atributes.setTech(tech);
				int cha = Integer.parseInt(JOptionPane.showInputDialog("Charisma"));
				atributes.setCha(cha);

				atributes.attModifiers();
				player.setSpeed();
				break;
			case 2:
				JOptionPane.showMessageDialog(null, "End!");
				break loop;

			}

			for (Player player : ldp.getPlayers()) {
				System.out.println(player);
			}

		}
	}

}
