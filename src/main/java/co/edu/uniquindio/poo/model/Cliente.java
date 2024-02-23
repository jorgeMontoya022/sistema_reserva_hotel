package co.edu.uniquindio.poo.model;

import java.util.ArrayList;
import java.util.Collection;

public class Cliente {
    private String nombreCliente;
    private String DNI;

    public Cliente(String nombreCliente, String DNI){
        this.nombreCliente = nombreCliente;
        this.DNI = DNI;
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

}
