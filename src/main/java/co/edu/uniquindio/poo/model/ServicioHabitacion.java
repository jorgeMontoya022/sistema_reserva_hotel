package co.edu.uniquindio.poo.model;

import co.edu.uniquindio.poo.services.IConsumible;

public class ServicioHabitacion extends Servicio implements IConsumible {

    public ServicioHabitacion(String descripcion) {
        super(descripcion);
        
    }

    @Override
    public void consumir() {
        System.out.println("realizando servicio de habitación");
    }
    
}
