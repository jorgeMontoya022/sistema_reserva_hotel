package co.edu.uniquindio.poo;

public class ServicioRestaurante extends Servicio implements IConsumible {

    public ServicioRestaurante(String descripcion) {
        super(descripcion);
       
    }

    @Override
    public void consumir() {
       System.out.println("realizando servicio de restaurante");
    }
    
}
