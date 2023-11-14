package dominio;

public class Jugador{

	private int id;
	private String nombre;
	private String nacionalidad;
	private String posicion;
	private int dorsal;

	
	public void SetId(int id){
		this.id = id;
	}
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


	public int GetId(){
		return id;
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


	public Jugador(int id_, String nombre_, String nacionalidad_, String posicion_, int dorsal_){

		SetId(id_);
		SetNombre(nombre_);
		SetNacionalidad(nacionalidad_);
		SetPosicion(posicion_);
		SetDorsal(dorsal_);

	}

	public String toString(){	
		return "Datos del Jugador ::  " + id + ";" + nombre + " ; " + nacionalidad + " ; " + posicion + " ; " + dorsal;
	}



}
