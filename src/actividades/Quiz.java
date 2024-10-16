package actividades;

import java.util.List;

public class Quiz extends Actividad {
	
	List<PreguntaCerrada> preguntas;
	
	public Quiz(String descripcion, String objetivo, String nivelDificultad, int duracion,
			List<Actividad> actividadesPrerrequisito, String fechaLim, List<Actividad> actividadesOpcionales, List<PreguntaCerrada> preguntas) {
		super(descripcion, objetivo, nivelDificultad, duracion, actividadesPrerrequisito, fechaLim, actividadesOpcionales);
		
		this.preguntas = preguntas; 
	}

	
	
	

}

