package co.edu.uniquindio.poo.model;


public class Cliente {
    private String nombreCliente;
    private String DNI;
    private int edad;

    public Cliente(String nombreCliente, String DNI, int edad){
        this.nombreCliente = nombreCliente;
        this.DNI = DNI;
        this.edad = edad;
    }

    public Cliente(){
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String dNI) {
        DNI = dNI;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

}
