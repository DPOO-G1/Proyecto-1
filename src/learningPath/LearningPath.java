package learningPath;

import java.util.ArrayList;
import java.util.List;

public class LearningPath<Actividad> {
	String titulo;
	String descripcion;
	String objetivos;
	String nivelDificultad;
	int duracion;
	int rating;
	List<Actividad> actividades;
	
	
	public LearningPath(String titulo, String descripcion, String objetivos, String nivelDificultad, int duracion,
			int rating, List<Actividad> actividades) {
		super();
		this.titulo = titulo;
		this.descripcion = descripcion;
		this.objetivos = objetivos;
		this.nivelDificultad = nivelDificultad;
		this.duracion = duracion;
		this.rating = rating;
		this.actividades = new ArrayList<>();
	}


	
	
}
