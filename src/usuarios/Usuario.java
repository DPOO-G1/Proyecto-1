package usuarios;

public abstract class Usuario {
	private String nombre;
	private String correo;
	private String password;
	
	public Usuario(String nombre, String correo, String password){
		this.nombre = nombre;
		this.correo = correo;
		this.password = password;
	}

}
