package actividades;

import java.util.List;

public class Recurso extends Actividad {
	
	String tipoRecurso;
	
	public Recurso(String descripcion, String objetivo, String nivelDificultad, int duracion,
			List<Actividad> actividadesPrerrequisito, String fechaLim, List<Actividad> actividadesOpcionales, String tipoRecurso) {
		super(descripcion, objetivo, nivelDificultad, duracion, actividadesPrerrequisito, fechaLim, actividadesOpcionales);
		this.tipoRecurso = tipoRecurso;
	}

	
	

	
	
}


