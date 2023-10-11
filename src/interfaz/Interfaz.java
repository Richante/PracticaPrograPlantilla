package interfaz;

import java.util.ArrayList;

import dominio.*;


public class Interfaz{

    public static void iniciar(String[] args){

		Plantilla plantilla = new Plantilla();
		if (args[0].equalsIgnoreCase("mostrar")){
            mostrarJugadores(plantilla);
		}
		if (args[0].equalsIgnoreCase("añadir")){
			Jugadores jugador = new Jugadores(args[1], args[2], Integer.parseInt(args[3]), args[4]);
			plantilla.annadir(jugador);
		}
	}

	private static void mostrarJugadores(Plantilla plantilla){
		ArrayList<Jugadores> listaJugadores = plantilla.getJugadoresPlantilla();
		for(Jugadores jugador : listaJugadores){
			System.out.println(jugador);
		}

	}

}


