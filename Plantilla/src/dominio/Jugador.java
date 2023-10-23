package dominio;

public class Jugador{

	private String nombre;
	private String nacionalidad;
	private String posicion;
	private int dorsal;

	
	public void SetNombre(String nombre){
		this.nombre = nombre;
	}
	public void SetNacionalidad(String nacionalidad){
		this.nacionalidad = nacionalidad;
	}
	public void SetPosicion(String posicion){
		this.posicion = posicion;
	}
	public void SetDorsal(int dorsal){
		this.dorsal = dorsal;
	}



	public  String GetNombre(){
		return nombre;
	}
	public String GetNacionalidad(){
		return nacionalidad;
	}
	public String GetPosicion(){
		return posicion;
	}
	public int GetDorsal(){
		return dorsal;
	}


	public Jugador(String nombre_, String nacionalidad_, String posicion_, int dorsal_){

		SetNombre(nombre_);
		SetNacionalidad(nacionalidad_);
		SetPosicion(posicion_);
		SetDorsal(dorsal_);

	}

	public String toString(){	
		return "Datos de l Jugador ::  " + nombre + " ; " + nacionalidad + " ; " + posicion + " ; " + dorsal;
	}



}
