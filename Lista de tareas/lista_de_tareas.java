
class Tarea {
    private String nombre;
    private int duracion;
    private String personaEncargada;
    private String estado;

    public Tarea(String nombre, int duracion, String personaEncargada, String estado) {
        this.nombre = nombre;
        this.duracion = duracion;
        this.personaEncargada = personaEncargada;
        this.estado = estado;
    }

    public String getNombre() {
        return nombre;
    }

    public int getDuracion() {
        return duracion;
    }

    public String getPersonaEncargada() {
        return personaEncargada;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
}