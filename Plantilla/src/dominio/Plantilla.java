package dominio;

import java.util.ArrayList;
import java.io.FileWriter;
import java.io.IOException;
import java.io.File;
import java.util.Scanner; 

public class Plantilla{

	private ArrayList<Jugador> plantilla = new ArrayList <>();

	
public Plantilla(){
		cargarPlantilla();
}

	public ArrayList<Jugador> getPLantilla(){
		return plantilla;
	}

	public void annadirJugador(Jugador j){
		plantilla.add(j);
		volcarPlantilla();
	}

	public void eliminarJugador(String nombre) {
		// Limpia y convierte la entrada del usuario a minúsculas (puedes usar toUpperCase() si prefieres mayúsculas)
		String nombreLimpio = nombre.trim().toLowerCase();
	
		boolean jugadorEncontrado = false;
	
		for (int i = 0; i < plantilla.size(); i++) {
			// Limpia y convierte el nombre del jugador a minúsculas (o mayúsculas) para la comparación
			String nombreJugador = plantilla.get(i).GetNombre().trim().toLowerCase();
	
			if (nombreJugador.equals(nombreLimpio)) {
				plantilla.remove(i);
				System.out.println("\n"+"JUGADOR ELIMINADO CORRECTAMENTE");
				jugadorEncontrado = true;
				break;
			}
		}
	
		if (!jugadorEncontrado) {
			System.out.println("\n"+"ESTE JUGADOR NO PERTENECE A LA PLANTILLA");
		}

		volcarPlantilla();
	}
	
    


	public ArrayList<Jugador> getPlantilla(){
		return plantilla;

	}

	public void volcarPlantilla (){

		try{
			FileWriter fw = new FileWriter("Plantilla_Actual.csv");
			for(Jugador j : plantilla){
				fw.write( 
				j.GetNombre() + "," + 
				j.GetPosicion() + "," + 
				j.GetNacionalidad() + "," + 
				j.GetDorsal() + "\n" );
			}
			fw.close();
		}catch(IOException ex){
			System.err.println(ex);		
		}
	}


	
	public void cargarPlantilla(){

		try{

			File fichero = new File("plantilla_Actual.csv");
			fichero.createNewFile();
			Scanner sc = new Scanner(fichero);
			sc.useDelimiter(",|\n");
			
			while(sc.hasNext()){
				Jugador jugador = new Jugador(sc.next(),sc.next(),sc.next(),sc.nextInt() );
				plantilla.add(jugador);
			
			}
			
			sc.close();


		}catch(IOException ex){

			System.err.println("No hay habitantes inscritos");

		}



	}

}



	



