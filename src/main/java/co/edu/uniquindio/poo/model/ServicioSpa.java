package co.edu.uniquindio.poo.model;

import co.edu.uniquindio.poo.services.IConsumible;

public class ServicioSpa extends Servicio implements IConsumible {

    public ServicioSpa(String descripcion) {
        super(descripcion);
        
    }

    @Override
    public void consumir() {
        System.out.println("Realizando servicio de Spa :)");
    }

  
    
    
}
