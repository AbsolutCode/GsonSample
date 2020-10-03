package dad.gsonsample;

import java.util.Scanner;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		Persona p = new Persona();
		System.out.println("Inserte un nombre (no puede estar vacío):");
		p.nombre = scanner.nextLine();
		System.out.println("Inserte un apellido o ambos apellidos (no puede estar vacío):");
		p.apellidos = scanner.nextLine();
		System.out.println("Inserte la edad (no puede estar vacío):");
		p.edad = scanner.nextInt();
		
		Gson gson = new GsonBuilder().setPrettyPrinting().create();
		String json = gson.toJson(p);
		System.out.println(json);
		
		scanner.close();

	}

}
