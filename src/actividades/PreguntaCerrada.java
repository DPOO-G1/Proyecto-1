package actividades;

import java.util.ArrayList;
import java.util.List;

public class PreguntaCerrada extends Pregunta {
	
	List<Opcion> opciones;
	Opcion opcionCorrecta;
	
	public PreguntaCerrada(String cuerpo,List<Opcion> opciones,Opcion opcionCorrecta) {
		super(cuerpo);
		this.opciones = new ArrayList<>();
		this.opcionCorrecta = null;
	}

	public void addOpcion(Opcion opcion) {
		if (opciones.size() >=4) {
			System.out.println("Una pregunta solo puede tener 4 opciones!");
		}
		else {
			this.opciones.add(opcion);	
		}
		
	}

	public Opcion getOpcionCorrecta() {
		return opcionCorrecta;
	}

	public void setOpcionCorrecta(Opcion opcionCorrecta) {
		this.opcionCorrecta = opcionCorrecta;
	}

	public List<Opcion> getOpciones() {
		return opciones;
	}

	public void setOpciones(List<Opcion> opciones) {
		this.opciones = opciones;
	}
	
	
}
