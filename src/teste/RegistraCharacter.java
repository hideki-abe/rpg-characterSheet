package teste;

import java.util.Scanner;

import javax.swing.JOptionPane;

import character.sheet.data.Ambusher;
import character.sheet.data.Android;
import character.sheet.data.Atributes;
import character.sheet.data.Hacker;
import character.sheet.data.Human;
import character.sheet.data.Medic;
import character.sheet.data.Mercenary;
import character.sheet.data.Player;
import character.sheet.data.Replicant;
import character.sheet.data.Sniper;

public class RegistraCharacter {

	@SuppressWarnings("unused")
	public static void main(String[] args) {

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
				Player player = new Player(null, null, null, null, null, 1, 0, null, 0, 30);
				Atributes atributes = new Atributes(0, 0, 0, 0, 0, 0);
				ldp.registerPlayer(player);
				player.setAtributes(atributes);

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

				// String playerName, String characterName, characterClass classe, Race race,
				// String origin, int level,
				// double experience, Atributes atributes, int hitPoints, int speed

				// JOptionPane.showMessageDialog(null, "New Register!");
//				 int nano = Integer.parseInt(JOptionPane.showInputDialog("Insira o seu ano de nascimento"));
//               int nmes = Integer.parseInt(JOptionPane.showInputDialog("Insira o seu mes de nascimento"));
//               int ndia = Integer.parseInt(JOptionPane.showInputDialog("Insira o seu dia de nascimento"));

				String menu3 = String.format("1 - HUMAN\n2 - REPLICANT\n3 - ANDROID");
				int choice3;
				for (;;) {
					choice2 = Integer.parseInt(JOptionPane.showInputDialog(menu3));
					if (choice2 == 1) {
						Human human = new Human();
						player.setRace(human);
						player.getAtributes().setCha(1);
						player.getAtributes().setDex(1);
						player.getAtributes().setStr(1);
						player.getAtributes().setTech(1);
						player.getAtributes().setCon(1);
						player.getAtributes().setIntel(1);

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

				String playerName = JOptionPane.showInputDialog("Player name");
				player.setPlayerName(playerName);
				String charName = JOptionPane.showInputDialog("Character name");
				player.setCharacterName(charName);
				String origin = JOptionPane.showInputDialog("Origin");
				player.setOrigin(origin);
				// int str, int dex, int con, int intel, int tech, int cha
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
