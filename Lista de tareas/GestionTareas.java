import java.util.ArrayList;
import java.util.List;

    public class GestionTareas {
        public static void main(String[] args) {
            List<Tarea> listaTareas = new ArrayList<>();
    
            // Agregar tareas a la lista
            listaTareas.add(new Tarea("Tarea 1", 60, "Persona 1", "activa"));
            listaTareas.add(new Tarea("Tarea 2", 45, "Persona 2", "En desarrollo"));
            listaTareas.add(new Tarea("Tarea 3", 30, "Persona 3", "En desarrollo"));
            listaTareas.add(new Tarea("Tarea 4", 90, "Persona 1", "Realizada"));
            listaTareas.add(new Tarea("Tarea 5", 120, "Persona 2", "activa"));
    
            // Mostrar las tareas
            System.out.println("Lista de Tareas:");
            for (Tarea tarea : listaTareas) {
                System.out.println("Nombre: " + tarea.getNombre());
                System.out.println("Duración: " + tarea.getDuracion() + " minutos");
                System.out.println("Persona encargada: " + tarea.getPersonaEncargada());
                System.out.println("Estado: " + tarea.getEstado());
                System.out.println("---------------------");
            }
        }
    }