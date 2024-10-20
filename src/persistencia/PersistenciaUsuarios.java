package persistencia;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import usuarios.Estudiante;
import usuarios.Profesor;
import usuarios.Usuario;

public class PersistenciaUsuarios {
    
    public static void guardarUsuarioEnCSV(String nombre, String correo, String password, String tipoUsuario) {
        try (FileWriter writer = new FileWriter("usuarios.csv", true)) {
      
            writer.append(nombre).append(",").append(correo).append(",").append(password).append(",").append(tipoUsuario).append("\n");
        } catch (IOException e) {
            System.out.println("Ocurrió un error al guardar el usuario.");
            e.printStackTrace();
        }
    }

    public static Map<String, Usuario> cargarUsuariosDeCSV() {
        Map<String, Usuario> usuarios = new HashMap<>();
        try (BufferedReader reader = new BufferedReader(new FileReader("usuarios.csv"))) {
            String linea;
            while ((linea = reader.readLine()) != null) {
  
                String[] datos = linea.split(",");
                String nombre = datos[0];
                String correo = datos[1];
                String password = datos[2];
                String tipoUsuario = datos[3];

   
                if (tipoUsuario.equals("Estudiante")) {
                    usuarios.put(correo, new Estudiante(nombre, correo, password));
                } else if (tipoUsuario.equals("Profesor")) {
                    usuarios.put(correo, new Profesor(nombre, correo, password));
                }
            }
        } catch (IOException e) {
            System.out.println("Ocurrió un error al cargar los usuarios.");
            e.printStackTrace();
        }
        return usuarios;
    }
}
