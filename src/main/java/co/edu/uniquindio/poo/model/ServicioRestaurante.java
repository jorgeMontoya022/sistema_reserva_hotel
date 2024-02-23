package co.edu.uniquindio.poo.model;

import co.edu.uniquindio.poo.services.IConsumible;

public class ServicioRestaurante extends Servicio implements IConsumible {

    public ServicioRestaurante(String descripcion) {
        super(descripcion);
       
    }

    @Override
    public void consumir() {
       System.out.println("realizando servicio de restaurante");
    }
    
}
