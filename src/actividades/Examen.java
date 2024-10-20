package actividades;

import java.util.Date;
import java.util.List;

public class Examen extends Actividad {

	public Examen(String descripcion, String objetivo, String nivelDificultad, int duracion,
			List<Actividad> actividadesPrerrequisito, Date fechaLim, List<Actividad> actividadesOpcionales,
			boolean obligatoria) {
		super(descripcion, objetivo, nivelDificultad, duracion,  fechaLim, obligatoria);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void menu() {
		// TODO Auto-generated method stub
		
	}

}
