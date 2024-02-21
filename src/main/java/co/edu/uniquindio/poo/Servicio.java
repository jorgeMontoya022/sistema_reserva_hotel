package co.edu.uniquindio.poo;

public abstract class Servicio {
    private String descripcion;

    public Servicio(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}