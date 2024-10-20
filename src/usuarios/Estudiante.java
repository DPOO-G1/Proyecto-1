package usuarios;

public class Estudiante extends Usuario {

	public Estudiante(String nombre, String correo, String password) {
		super(nombre, correo, password);
		
	}
	
	@Override
	public void menu() {
		System.out.println("Menú Estudiante");
        
        System.out.println("1. Ver Learning Paths");
        System.out.println("2. Realizar una tarea");
	}
	
}
