<<<<<<< HEAD
package dominio;

public class Jugadores{

	private String nombre;
	private String posicion;
	private String nacionalidad;
	private int dorsal;

	public void setNombre(String nombre){
		
		this.nombre = nombre;
}

        public String getNombre(){

		return nombre;
	}

        public void setPosicion(String posicion){

		this.posicion = posicion;
	}

        public String getPosicion(){

	        return posicion;
	}

        public void setNacionalidad(String nacionalidad){

		this.nacionalidad = nacionalidad;

	}

        public String getNacionalidad(){

		return nacionalidad;

	}

        public void setDorsal(int dorsal){
		this.dorsal = dorsal;

	}

        public int getDorsal(){

		return dorsal;
	}
        
        public String toString(){

		return "Nombre " + getNombre() + " " +
		       "Posición " + getPosicion() + " " +
		       "Nacionalidad " + getNacionalidad() + " " +
		       "Dorsal " + getDorsal() + " ";
	}

        public Jugadores(String nombre, String posicion, String nacionalidad, int dorsal){

		this.nombre = nombre;
		this.posicion = posicion;
		this.nacionalidad = nacionalidad;
		this.dorsal = dorsal;
	}
        


        
=======

>>>>>>> 7427d79518836a2eebcb34aa257ce598c4a1ad55
