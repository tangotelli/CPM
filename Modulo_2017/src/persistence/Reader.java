package persistence;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import model.Pack;
import model.Skin;
import model.Weapon;
import model.types.Category;

public class Reader {
	public static BufferedReader b;
	private static final String ACCOMODATION_FILE = "data/output/alojamientos.dat";
	private static final String TICKET_FILE = "data/output/entradas.dat";
	private static final String THEMEPARK_FILE = "data/output/tematicos.dat";
	private static final String PACKAGE_FILE = "data/output/paquetes.dat";

	public static HashMap<Long, Skin> loadSkin() {
		List<String> lines = readFile(THEMEPARK_FILE);
		HashMap<Long, Skin> skins = new HashMap<>();
		for (String line : lines) {
			String[] date = line.split("@");
			String id = date[0];
			String name = date[1];
			String price = date[2];
			String type = date[3];
			String image = date[4];
			Skin skin = new Skin(Long.parseLong(id), name, Float.parseFloat(price),
					Category.valueOf(type), image);
			skins.put(skin.getId(), skin);
		}
		return skins;
	}

	public static HashMap<Long, Weapon> loadWeapon() {
		List<String> lines = readFile(TICKET_FILE);
		HashMap<Long, Weapon> weapons = new HashMap<>();
		for (String line : lines) {
			String[] date = line.split("@");
			String id = date[0];
			String name = date[1];
			String type = date[2];
			String ammo = date[3];
			String damage = date[4];
			String price = date[5];
			String image = date[6];
			Weapon weapon = new Weapon(Long.parseLong(id), name, Category.valueOf(type),
					Integer.parseInt(ammo), Float.parseFloat(damage), Float.parseFloat(price), image);
			weapons.put(weapon.getId(), weapon);
		}
		return weapons;
	}

	public static HashMap<Long, Pack> loadPackage() {
		List<String> lines = readFile(PACKAGE_FILE);
		HashMap<Long, Pack> packs = new HashMap<>();
		for (String line : lines) {
			String[] date = line.split("@");
			String idPack = date[0];
			String idSkin = date[1];
			String idWeapon = date[2];
			String price = date[3];
			String name = date[4];
			Pack pack = new Pack(Long.parseLong(idPack), Long.parseLong(idSkin), Long.parseLong(idWeapon),
					Float.parseFloat(price), name);
			packs.put(pack.getIdPack(), pack);
		}
		return packs;
	}

	private static List<String> readFile(String file) {
		List<String> lines = new ArrayList<>();
		try {
			b = new BufferedReader(new FileReader(file));
			while (b.ready()) {
				lines.add(b.readLine());
			}
		} catch (FileNotFoundException e) {
			System.out
					.println("El archivo fichero " + file + " no se encontro");
		} catch (IOException e) {
			new RuntimeException(
					"Error de entrada/salida con el fichero " + file);
		}
		return lines;
	}

}
