package actividades;

import java.util.List;

public class PreguntaCerrada extends Pregunta {
	
	List<Opcion> opciones;
	Opcion opcionCorrecta;
	
	public PreguntaCerrada(String cuerpo,List<Opcion> opciones,Opcion opcionCorrecta) {
		super(cuerpo);
		this.opciones = opciones;
		this.opcionCorrecta = opcionCorrecta;
	}


	
}
