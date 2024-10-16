package actividades;

import java.util.ArrayList;
import java.util.List;

public abstract class Actividad {
	
	String descripcion;
	
	String objetivo;
	
	String nivelDificultad;
	
	int duracion;
	
	List<Actividad> ActividadesPrerrequisito;
	
	String fechaLim;
	
	List<Actividad> actividadesOpcionales;
	
	String estado;
	
	boolean completado;
	
	List<Reseña> reseñas;
	
	public Actividad(String descripcion, String objetivo, String nivelDificultad, int duracion,
			List<Actividad> actividadesPrerrequisito, String fechaLim, List<Actividad> actividadesOpcionales) {

		this.descripcion = descripcion;
		this.objetivo = objetivo;
		this.nivelDificultad = nivelDificultad;
		this.duracion = duracion;
		ActividadesPrerrequisito = actividadesPrerrequisito;
		this.fechaLim = fechaLim;
		this.actividadesOpcionales = actividadesOpcionales;
		this.estado = "No enviada";
		this.completado = false;
		this.reseñas = new ArrayList<>();
	}

	

	
}
