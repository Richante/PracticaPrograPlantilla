package interfaz;

import java.util.ArrayList;
import java.util.Scanner;
import dominio.*;


public class Interfaz{

	private static String negrita = "\u001B[1m";
	private static String normal = "\033[0m";
    private static String rojo = "\u001B[31m";




public static void ejecutar(String[] args){

	Plantilla fichajes = new Plantilla();
		
		if(args[0].equalsIgnoreCase("mostrar") && args.length == 1 ){
			mostrarPlantilla(fichajes);

		}else if(args[0].equalsIgnoreCase("anadir") && args.length == 1){
			
			Scanner sc = new Scanner(System.in);
				System.out.println(rojo + "RELLENA LA INFORMACIONES DEL NUEVO JUGADOR" + normal);
				System.out.println(negrita + "NOMBRE: " + normal);
					String nombre = sc.nextLine();
				System.out.println(negrita + "Posicion: "+ normal);
					String posicion = sc.nextLine();
				System.out.println(negrita + "Pais: "+ normal);
					String pais = sc.nextLine();
				System.out.println(negrita +"Dorsal: "+ normal);
					int dorsal = sc.nextInt();

			sc.close();
				
			Jugador jugador = new Jugador(nombre, posicion, pais, dorsal);
			fichajes.annadirJugador(jugador);

		}else if(args[0].equalsIgnoreCase("eliminar")){
			Scanner sc = new Scanner(System.in);
				System.out.println(negrita +"QUIEN QUIERES ELIMINAR DE LA PLANTILLA :"+ normal);
					mostrarnombre(fichajes);
				System.out.println("SELECTIONA UN NOMBRE: ");
					String nombre = sc.nextLine();
					fichajes.eliminarJugador(nombre);
			sc.close();

		}else if(args[0].equalsIgnoreCase("ayuda")){
			ayuda();
		}else{
			System.out.println("COMANDO INCORECTO" + "\n" + "escribir `ayuda` para acceder al menu de ayuda");
		}

	}


	public static void mostrarPlantilla(Plantilla p){
			
		System.out.println("\n"+negrita+"PLANTILLA ACTUAL: "+normal);
		int n = 1;
			ArrayList<Jugador> plantilla = p.getPlantilla();
			for (Jugador ju : plantilla){
				System.out.print(rojo + n + ". "+ normal);
				System.out.println(ju.GetNombre() + ", " + ju.GetPosicion() + ", " + ju.GetNacionalidad() + ", " + ju.GetDorsal());
				n++;
			}
	}

	public static void mostrarnombre(Plantilla p){
	int n = 1;
		ArrayList<Jugador> plantilla = p.getPlantilla();
		for (Jugador j : plantilla){
			System.out.print(rojo + n + ". " + normal);
			System.out.println(j.GetNombre());
			n++;
		}

	}



	private static void ayuda(){

		System.out.println("\n"+negrita+"DESCRIPCIÓN"+normal);
		System.out.println("\tEsta aplicación ofrece las siguientes funcionalidades:\n\n" + 
				"\t- Permite añadir un nuevo jugador a la plantilla\n" + 
				"\t- Permite mostrar los jugadores actuales de la plantilla" +
				"\t- Permite eliminar un jugador de la plantilla\n");

		System.out.println(negrita+"FORMATO"+normal);
		System.out.println("\tPara añadir un nuevo jugador, se escribe:\n");
		System.out.println("\t\t" + negrita+ "make anadir // java -cp bin aplicacion.Principal anadir, y rellenar las informaciones que le piden" + normal +"\n");
		System.out.println("\tPara mostrar los jugadores de la plantillas, se teclea:\n");
		System.out.println("\t\t" + negrita + "make mostrar // java -cp bin aplicacion.Principal mostrar" + normal + "\n");
		System.out.println("\tPara mostrar esta ayuda, se escribe:\n");
		System.out.println("\t\t" + negrita +"make ayuda // java -cp bin aplicacion.Principal ayuda" + normal + "\n");
		System.out.println("\tPara eliminar un jugador de la plantilla, se escribe:\n");
		System.out.println("\t\t" + negrita +"make eliminar // java -cp bin aplicacion.Principal eliminar" + normal + "\n");


	}


	}


