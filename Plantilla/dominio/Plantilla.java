package dominio;

import java.io.File;
import java.ioFileWriter;
import java.ioException;
import java.util.Scanner;
import java.util.ArrayList;

public class Plantilla{

	private String nombreFichero = "equipo.txt";
	private ArrayList<Jugadores> jugadores = new ArrayList<>();

        public Plantilla() {

		try

		{
			File fichero = new File(nombreFichero);

			fichero.createNewFile();

			Scanner sc = new Scanner(fichero).useDelimiter(",|\n");

			while(sc.hasNext()){

				jugadores.add(new Jugador(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextInt());

			}catch(IOException ex)

			{
				System.out.println(ex);
			}
		}

		public void annadirContacto(String nombre,String posicion,String nacionalidad,int dorsal){

			Jugadores jugador = new Jugadores(nombre, posicion, nacionalidad, dorsal);

			plantilla.add(jugador);

			this.volcarJugadores();
		}

		private void volcarJugadores(){

			System.out.println(jugadores);

			try
			{

				FileWriter fw = new FileWriter(nombreFichero);

				for(Jugador jugador : jugadores){

				fw.write(jugador.getNombre() + "," + jugador.getPosicion() + "," + jugador.getNacionalidad() + "," + jugador.getDorsal());                                        
							fw.close();
				}

			}catch(IOException ex)

				{
					System.out.println(ex);
				}
			}
		}

		public String toString() {
			StringBuilder sb = new StringBuilder();

			for (Jugadores jugador : plantilla) {

				sb.append(jugador + "\n");
			}

			return sb.toString();
		}



