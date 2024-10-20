package learningPath;

import java.util.Date;
import actividades.Actividad;

import java.util.ArrayList;
import java.util.List;

public class LearningPath {
	String titulo;
	String descripcion;
	String objetivos;
	String nivelDificultad;
	int duracion;
	Double rating;
	List<Actividad> actividades;
	Date fechaCreacion; 
	Date fechaUltModificacion;
	
	
	
	public LearningPath(String titulo, String descripcion, String objetivos, String nivelDificultad) {
		super();
		this.titulo = titulo;
		this.descripcion = descripcion;
		this.objetivos = objetivos;
		this.nivelDificultad = nivelDificultad;
		this.duracion = 0;
		this.rating = 0.0;
		this.actividades = new ArrayList<>();
		this.fechaCreacion = new Date();
		this.fechaUltModificacion = new Date();
	}



	public String getTitulo() {
		return titulo;
	}



	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}



	public String getDescripcion() {
		return descripcion;
	}



	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}



	public String getObjetivos() {
		return objetivos;
	}



	public void setObjetivos(String objetivos) {
		this.objetivos = objetivos;
	}



	public String getNivelDificultad() {
		return nivelDificultad;
	}



	public void setNivelDificultad(String nivelDificultad) {
		this.nivelDificultad = nivelDificultad;
	}



	public int getDuracion() {
		return duracion;
	}



	public void setDuracion(int duracion) {
		this.duracion = duracion;
	}



	public Double getRating() {
		return rating;
	}



	public void setRating(Double rating) {
		this.rating = rating;
	}



	public List<Actividad> getActividades() {
		return actividades;
	}



	public void setActividades(List<Actividad> actividades) {
		this.actividades = actividades;
	}



	public Date getFechaCreacion() {
		return fechaCreacion;
	}



	public void setFechaCreacion(Date fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
	}



	public Date getFechaUltModificacion() {
		return fechaUltModificacion;
	}



	public void setFechaUltModificacion(Date fechaUltModificacion) {
		this.fechaUltModificacion = fechaUltModificacion;
	}
	
	public void addActividad(Actividad actividad) {
		this.actividades.add(actividad);
		actualizarFechaUltModificacion();
		actualizarDuracion(actividad.getDuracion());
	}
	public void eliminarActivdad(Actividad actividad) {
		this.actividades.remove(actividad);
		actualizarFechaUltModificacion();
		actualizarDuracion(actividad.getDuracion());
	}
	
	private void actualizarFechaUltModificacion() {
		this.setFechaUltModificacion(new Date());
	}
	
	private void actualizarDuracion(int duracionIni) {
		duracion = this.getDuracion();
		duracion += duracionIni;
		this.setDuracion(duracion);
	}
	
	public void eliminarActividad(Actividad actividad, LearningPath learningPath) {
		learningPath.eliminarActivdad(actividad);
	}
	
	public void menu() {
        System.out.println("Menú de "+ this.titulo);
        System.out.println("");
        System.out.println("1. Añadir actividad");
        System.out.println("2. Eliminar Actividad");
	}
	
}
