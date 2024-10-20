package persistencia;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Map;

import learningPath.LearningPath;
import usuarios.Profesor;
import usuarios.Usuario;


public class PersistenciaLearningPaths {
		
	public static void guardarLearningPath(LearningPath learningPath, String correo) {
		try (FileWriter writer = new FileWriter("learningPaths.csv", true)) {
		      
            writer.append(correo).append(",").append(learningPath.getTitulo()).append(",").append(learningPath.getDescripcion()).append(",").append(learningPath.getObjetivos()).append(",").append(learningPath.getNivelDificultad()).append("\n");
        } catch (IOException e) {
            System.out.println("Ocurrió un error al el LearningPath.");
            e.printStackTrace();
        }
	}
	
	public static void cargarLearningPaths(Map<String, Usuario> usuarios) {

		try (BufferedReader reader = new BufferedReader(new FileReader("learningPaths.csv"))) {
            String linea;
            while ((linea = reader.readLine()) != null) {
  
                String[] datos = linea.split(",");
                String correo = datos[0];
                String titulo = datos[1];
                String descripcion = datos[2];
                String objetivos = datos[3];
                String nivelDificultad = datos[4];
                LearningPath learningPath = new LearningPath(titulo,descripcion,objetivos,nivelDificultad);
                
                Usuario profesor = (Profesor)usuarios.get(correo);
                
                ((Profesor) profesor).addLearningPath(learningPath);
              
            }
        } 
		catch (IOException e) {
            System.out.println("Ocurrió un error al cargar los learning paths.");
            e.printStackTrace();
        }
	
	}
	
	
}
