package usuarios;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import actividades.Actividad;
import actividades.PreguntaCerrada;
import actividades.Quiz;
import actividades.Recurso;
import learningPath.LearningPath;


public class Profesor extends Usuario {
	
	ArrayList<LearningPath> learningpaths;
	
	public Profesor(String nombre, String correo, String password) {
		super(nombre, correo, password);
		learningpaths = new ArrayList<>();
			}

	@Override
	public void menu() {
	    System.out.println("Menú Profesor");
	  
	    System.out.println("1. Crear Learning Path");
	    System.out.println("2. Administrar Learning Paths");
	    System.out.println("3. Volver al inicio");
		}
	
	public void mostrarLearningPaths() {
		if( learningpaths.size()>0) {
			System.out.println("\nEstos son los LearningPaths de "+ this.correo);
			for(int i = 0; i<learningpaths.size();i++) {
				LearningPath learningpath = learningpaths.get(i);
	
				System.out.println(i + "." + learningpath.getTitulo());
			}
		}
		else {
			System.out.println("Todavía no tienes Learning Paths asociados.");
		}
	}
	
	
	
	public Actividad crearQuiz(String tipo,String descripcion, String objetivo, String nivelDificultad, int duracion,
								Date fechaLim, boolean obligatoria, double calificacionMin) {
		
			Actividad actividad = new Quiz(descripcion, objetivo, nivelDificultad, duracion,
					 fechaLim, calificacionMin, obligatoria);
			
			return actividad;
		}
	
	public Actividad crearRecurso(String descripcion, String objetivo, String nivelDificultad, int duracion,
			List<Actividad> actividadesPrerrequisito, Date fechaLim, List<Actividad> actividadesOpcionales, boolean obligatoria, String tipoRecurso) {	
			Actividad actividad = new Recurso(descripcion, objetivo, nivelDificultad, duracion,
					 fechaLim, obligatoria,tipoRecurso);
		
			return actividad;
		}
	
	public Actividad CrearExamen() {
			
			return null;
		}
	
	
	public void addLearningPath(LearningPath learningpath) {
		learningpaths.add(learningpath);
		
	}

	public ArrayList<LearningPath> getLearningpaths() {
		return learningpaths;
	}

	public void setLearningpaths(ArrayList<LearningPath> learningpaths) {
		this.learningpaths = learningpaths;
	}
}
