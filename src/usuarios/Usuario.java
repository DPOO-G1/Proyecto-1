package usuarios;

public abstract class Usuario {
	protected String nombre;
	protected String correo;
	protected String password;
	
	public Usuario(String nombre, String correo, String password){
		this.nombre = nombre;
		this.correo = correo;
		this.password = password;
	}
	
	public abstract void menu();

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
}
