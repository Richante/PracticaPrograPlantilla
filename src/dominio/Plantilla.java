package dominio;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

	public class Plantilla {
		private String nombreFichero = "equipo.txt";
		private ArrayList<Jugadores> plantilla = new ArrayList<>();

		public Plantilla(){
			cargarJugadores();
		}


		private void cargarJugadores() {
			try {
				File fichero = new File(nombreFichero);
				fichero.createNewFile();
				Scanner sc = new Scanner(fichero).useDelimiter(",|\n");
				while (sc.hasNext()) {
					Jugadores jugador = new Jugadores(sc.nextLine(), sc.nextLine(), sc.nextInt(), sc.nextLine());
					plantilla.add(jugador);
				}
				sc.close();
			} catch (IOException ex) {
				System.err.println(ex);
			}
		}

		public void annadir(Jugadores jugador) {
			plantilla.add(jugador);
			volcarPlantilla();
		}

		public void annadirJugador(String nombre, String posicion, int dorsal, String nacionalidad) {
			Jugadores jugador = new Jugadores(nombre, posicion, dorsal, nacionalidad);
			plantilla.add(jugador);
			this.volcarPlantilla();
		}
		public ArrayList<Jugadores> getJugadoresPlantilla(){
			return plantilla;
		}

		@Override
		public String toString() {
			StringBuilder sb = new StringBuilder();
			for (Jugadores jugador : plantilla) {
				sb.append(jugador + "\n");
			}
			return sb.toString();
		}

		private void volcarPlantilla() {
			System.out.println(plantilla);
			try {
				FileWriter fw = new FileWriter(nombreFichero);
				for (Jugadores jugador : plantilla) {
					fw.write(jugador.getNombre() + "," + jugador.getPosicion() + "," + jugador.getDorsal() + jugador.getNacionalidad() +"\n");
				}
				fw.close();
			} catch (IOException ex) {
				System.err.println(ex);
			}
		}

	}
